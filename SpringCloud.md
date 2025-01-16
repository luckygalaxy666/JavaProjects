# 目录
<!-- vim-markdown-toc GFM -->

* [课程安排](#课程安排)
    * [MyBatis Plus](#mybatis-plus)
        * [常用注解](#常用注解)
    * [@tableid注解设置IdType.AUTO不生效的解决方法](#tableid注解设置idtypeauto不生效的解决方法)
    * [条件构造器](#条件构造器)
        * [LambdaQueryWrapper](#lambdaquerywrapper)
        * [LambdaUpdateWrapper](#lambdaupdatewrapper)
    * [自定义SQL](#自定义sql)
    * [IService接口](#iservice接口)
        * [复杂查询](#复杂查询)
        * [Iservice的Lambda查询](#iservice的lambda查询)
    * [MybatisPlus插件 代码生成器](#mybatisplus插件-代码生成器)
    * [DB静态工具类](#db静态工具类)
    * [逻辑删除](#逻辑删除)

<!-- vim-markdown-toc -->

## 课程安排

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501160924981.png)

### MyBatis Plus

- MyBatis Plus 是 MyBatis 的增强工具 ,可以简化 MyBatis 的开发

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501160926293.png)


- MyBatisPlus通过扫描实体类，并基于反射获取实体类信息作为数据库表信息，通过注解的方式，简化了数据库表的操作，提供了一些常用的CRUD操作，简化了开发，提高了开发效率。
 
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501160930264.png)

#### 常用注解

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501160935002.png)

** 如果不指定@TableId为自增，那么默认是雪花算法生成的id **


### @tableid注解设置IdType.AUTO不生效的解决方法

首先造成这个问题的原因可能是我在没有设置@tableid注解的情况下，先用编写的程序插入了一条数据，由于程序默认的主键策略为ASSIGN_ID雪花算法，也就是以类似时间戳的值作为该数据主键值，这就导致后面主键自增的值都是在这个时间戳的基础上+1

**解决方法**

我要做的就是将Mysql记录的自增值重置一下

先删除之前插入的那条脏数据

再在mysql数据库中执行：``ALTER TABLE  库名.表名 AUTO_INCREMENT = 0; ``

**重新测试**

重置之后的自增值就会从已有数据中主键值最大的那条数据开始计算+1。

### 条件构造器

#### LambdaQueryWrapper

与QueryWrapper的区别是，LambdaQueryWrapper是使用Lambda表达式的方式构造查询条件，更加直观，更加方便。

**示例：**

查询用户表中用户名中包含o的，且余额大于1000的人的id,用户名，信息，余额
```Java
 @Test
    void testSelectWrapper()
    {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>()
                .select(User::getId, User::getUsername,User::getInfo, User::getBalance)
                .like(User::getUsername, "o")
            .gt(User::getBalance, 1000);
        List<User> users = userMapper.selectList(wrapper);
        users.forEach(System.out::println);
    }
```

#### LambdaUpdateWrapper

**示例：**

将id为1，2，4的用户余额加100

```Java
 @Test
    void testUpdateWrapper()
    {
        List<Long> list = List.of(1L, 2L, 4L);
        LambdaUpdateWrapper<User> wrapper = new LambdaUpdateWrapper<User>()
                .setSql("balance = balance + 100")
                .in(User::getId,list);
        userMapper.update(null, wrapper);
    }
```

### 自定义SQL

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501161059216.png)

### IService接口

IService接口是MyBatis Plus提供的一个接口，它提供了一些常用的CRUD方法，我们可以通过继承IService接口来实现自己的Service接口，这样就可以直接调用IService接口提供的方法，而不用自己再去写一遍。

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501161130920.png)

**示例：**

不需要自己写Mapper方法，直接调用IService接口提供的方法

```Java
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private IUserService userService;
    @Test
    public void testSaveUser()
    {
        User user = new User();
//        user.setId(6L);
        user.setUsername("Lucykk9");
        user.setPassword("123");
        user.setPhone("18688990311");
        user.setBalance(200);
        user.setInfo("{\"age\": 23, \"intro\": \"语文老师\", \"gender\": \"female\"}");
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        userService.save(user);
    }
}
```

#### 复杂查询
    
对于复杂的查询，我们可以通过继承IService接口，然后自己写方法来实现，这样就可以实现自己的业务逻辑。

**示例：**

根据用户id扣减用户余额

Controller层


```Java
@RestController
@RequiredArgsConstructor
public class userController {

    // spring 不推荐使用@Autowired注解，推荐使用构造函数注入
//    @Autowired
//    private IUserService userService;

    private final IUserService userService;
    @PostMapping("/{id}/deduction/{money}")
    @ApiOperation("扣减用户余额接口")
    public void deductMoneyById(@PathVariable("id") Long id, @PathVariable("money") int money) {
        userService.deductBalance(id, money);
        return ;

    }
}
```

Service层

```Java
public interface IUserService extends IService<User> {
    void deductBalance(Long id, int money);
}
```

ServiceImpl层

```Java
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Override
    public void deductBalance(Long id, int money) {
        // 1. 根据用户id查询用户信息
        User user = this.getById(id);

        // 2.校验用户状态
        if(user == null || user.getStatus() != 1) {
            throw new RuntimeException("用户状态异常");
        }

        // 3. 检验余额是否重组
        if(user.getBalance() < money) {
            throw new RuntimeException("余额不足");
        }

        // 4. 扣减余额
        baseMapper.deductBalance(id, money);  // baseMapper是IService接口提供的方法 因为设置了泛型，所以可以直接调用UserMapper
    }
}
```

Mapper层

```Java
public interface  UserMapper extends BaseMapper<User> {
    @Update("update user set balance = balance - #{money} where id = #{id}")
    void deductBalance(Long id, int money);
}
```

#### Iservice的Lambda查询

应对复杂条件查询，可以在Service层使用lambdaQuery()方法，实现非空条件查询

**示例：**

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501161455777.png)

只需要在Service层调用lambdaQuery()方法，然后在lambdaQuery()方法中传入查询条件即可， 查询条件可以加入非空判断

```Java
@Override
public List<User> queryUser(String name, Integer status, Integer minBalance, Integer maxBalance) {
    return lambdaQuery()
            .like(name!=null,User::getUsername, name)
            .eq(status!=null,User::getStatus, status)
            .ge(minBalance != null, User::getBalance, minBalance)
            .le(maxBalance != null, User::getBalance, maxBalance)
            .list();
}
```

### MybatisPlus插件 代码生成器

MybatisPlus提供了一个代码生成器，可以根据数据库表自动生成实体类，Mapper接口，Mapper.xml文件，Service接口，ServiceImpl实现类，Controller层，这样就可以省去很多重复的工作。

**使用方法：**

* 下载MybatisPlus代码生成器插件

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501161557881.png)

* 选择数据库表

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501161558139.png)

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501161559700.png)

* 设置参数配置 一键生成 （注意层级关系）

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501161600475.png)


### DB静态工具类

MybatisPlus提供了一个DB静态工具类，可以直接通过DB静态工具类来操作数据库，可以应用于跨表操作，而不注入对应Mapper对象。

使用时，只需要调用DB静态工具类的方法，传入对应的参数即可（**对应实体类，用于反射获取字节码信息**）。

**示例：**

查询用户信息的同时，查询出用户的地址信息


```Java
@Override
    public UserVO queryUserAndAddressById(Long id) {

        User user = this.getById(id);
        UserVO userVO = BeanUtil.copyProperties(user, UserVO.class);

        // 查询地址库的信息，可以使用静态工具类
        List<Address> list = Db.lambdaQuery(Address.class)
                .eq(Address::getUserId, id)
                .list();
        if(list!=null)
        {
            userVO.setAddressVOList(BeanUtil.copyToList(list, AddressVO.class));
        }
        
        return userVO;
    }

```
### 逻辑删除

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501161657282.png)

只需要在application.yaml配置文件中配置逻辑删除的字段名，MybatisPlus会自动将逻辑删除的字段加入到查询条件中，查询时会自动过滤掉逻辑删除的数据。

并且将删除操作转换为update操作，将逻辑删除字段更新为1

**配置文件：**

```yaml
mybatis-plus:
  global-config:
    db-config:
      logic-delete-field: deleted
      logic-delete-value: 1
      logic-not-delete-value: 0
```


**示例：**

逻辑删除地址信息

```Java
@SpringBootTest
public class IAddressServiceTest {

    @Autowired
    private IAddressService addressService;
    @Test
    public void testDeleteAddress()
    {
        addressService.removeById(59L);

        Address address = addressService.getById(59L);
        System.out.println("address = " + address);
    }
}
```

底层将removeById()方法转换为update语句，将deleted字段更新为0


![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501161703227.png)
