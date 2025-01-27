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
* [Docker](#docker)
    * [DockerFile](#dockerfile)
    * [Docker 网络](#docker-网络)
        * [常用命令：](#常用命令)
    * [DockerCompose](#dockercompose)
* [微服务](#微服务)
    * [Nacos](#nacos)
    * [RestTemplate](#resttemplate)
    * [注册中心](#注册中心)
        * [服务发现](#服务发现)
        * [OpenFeign](#openfeign)
    * [网关](#网关)
        * [网管请求处理流程](#网管请求处理流程)
        * [网关过滤器](#网关过滤器)
    * [用户信息全局处理器](#用户信息全局处理器)
    * [配置管理与热更新](#配置管理与热更新)
* [微服务保护和分布式管理](#微服务保护和分布式管理)
    * [雪崩](#雪崩)
    * [Sentinal](#sentinal)
    * [分布式事务 Seata](#分布式事务-seata)
        * [Seata的架构](#seata的架构)
        * [XA模式](#xa模式)
        * [AT模式](#at模式)
* [消息队列MQ](#消息队列mq)
    * [RabbitMQ](#rabbitmq)
        * [基本架构](#基本架构)

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


## Docker

### DockerFile

DockerFile是一个文本文件，用来配置镜像的构建过程，DockerFile包含了一条条指令，每一条指令构建一层，构建过程是逐步的，每一条指令的内容会被DockerFile解析为一层，每一层都会在前一层的基础上进行修改。

**DockerFile指令：**

- FROM：指定基础镜像
- MAINTAINER：指定镜像的作者
- RUN：执行命令
- CMD：容器启动时执行的命令
- EXPOSE：暴露端口
- ENV：设置环境变量
- ADD：复制文件
- COPY：复制文件

### Docker 网络

Docker网络是一个独立的网络，Docker容器可以连接到这个网络，这样就可以实现容器之间的通信。

#### 常用命令：

| 命令 | 说明 |
| --- | --- |
| docker network ls | 查看所有网络 |
| docker network create --driver bridge my-bridge | 创建一个网络 |
| docker network inspect my-bridge | 查看网络详细信息 |
| docker network connect my-bridge my-container | 将容器连接到网络 |
| docker network disconnect my-bridge my-container | 将容器从网络中断开 |
| docker network rm my-bridge | 删除网络 |
| docker network prune | 删除所有未使用的网络 |

使用Docker网络，可以实现容器之间的通信，可以将容器连接到同一个网络，这样就可以实现容器之间的通信。 并且可以通过容器名直接ping。

### DockerCompose

DockerCompose是一个用于定义和运行多容器Docker应用程序的工具，通过一个单独的docker-compose.yml配置文件来配置应用程序的服务，然后使用docker-compose up命令，就可以根据配置文件创建并启动所有的容器。

**DockerCompose常用命令：**

| 命令 | 说明 |
| --- | --- |
| docker-compose up | 创建并启动所有容器 |
| docker-compose up -d | 创建并启动所有容器，后台运行 |
| docker-compose down | 停止并删除所有容器 |
| docker-compose ps | 查看容器状态 |
| docker-compose logs | 查看容器日志 |
| docker-compose exec | 进入容器 |
| docker-compose restart | 重启容器 |

## 微服务

### Nacos

Nacos是一个动态服务发现、配置管理和服务管理平台，Nacos支持几乎所有主流类型的服务，例如Kubernetes和Spring Cloud等，Nacos提供了一种简单易用的方式来实现服务注册、发现、配置管理和服务管理。

**Nacos的功能：**

通过在不同的微服务的yml配置文件中配置Nacos的地址，就可以实现服务的注册和发现，Nacos会自动将服务注册到Nacos的注册中心，然后其他服务就可以通过Nacos的注册中心来获取服务的信息，然后调用服务。

**Nacos的配置：**

```yaml

spring:
  application:
    name: cart-service # 微服务名称
  cloud:
    nacos:
      server-addr: 172.27.62.11:8848 # Nacos的地址 注册在虚拟机的docker容器中

```

### RestTemplate

RestTemplate是Spring提供的用于访问Rest服务的客户端，RestTemplate提供了多种便捷访问远程Http服务的方法，是一种简单便捷的访问Rest服务的模板类，是Spring提供的用于访问Rest服务的客户端。

1. 注入到Spring容器中


```Java
@Bean
public RestTemplate restTemplate()
{
    return new RestTemplate();
}
```

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/20250122143431177.png)

### 注册中心 

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/20250122144142004.png)

#### 服务发现

服务发现是指服务提供者将自己的服务注册到注册中心，服务消费者从注册中心获取服务提供者的信息，然后调用服务提供者的服务。

**使用DeliveryClient获取服务提供者的信息，然后调用服务提供者的服务。**

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/20250122175452413.png)

#### OpenFeign

OpenFeign是一个声明式的Web服务客户端，它使得编写Web服务客户端变得更加简单，只需要创建一个接口并用注解来配置它，它具有可插拔的注解支持，包括Feign注解和JAX-RS注解，OpenFeign支持可插拔的编码器和解码器，Spring Cloud对Spring Cloud OpenFeign进行了封装，使得使用更加方便。


**示例：**

改造DeliveryClient的实现方法，使用OpenFeign，可以做到类似调用本地``Service``方法的效果。


需要引入``spring-cloud-starter-openfeign``依赖，并在启动类上添加``@EnableFeignClients``注解

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/20250122182321808.png)

**日志配置：**


配置一个config类，设置日志级别，但不要加@Component注解，否则会被扫描到，导致所有的FeignClient都会使用这个配置。
```Java
public class DefaultFeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
```

在需要日志的启动类上加上注解，使日志配置生效

```Java
@EnableFeignClients(basePackages = "com.hmall.api.client",defaultConfiguration = DefaultFeignConfig.class)
```

### 网关

网关是一个系统的唯一入口，它负责将外部请求转发到内部服务，网关可以实现路由转发，负载均衡，安全认证，限流等功能。

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/20250123152041442.png)


**Spring Cloud Gateway**

Spring Cloud Gateway是Spring Cloud的一个全新项目，它是基于Spring 5，Spring Boot 2和Project Reactor等技术开发的网关，Spring Cloud Gateway旨在提供一种简单而有效的方式来对API进行路由，以及提供一些强大的过滤功能，Spring Cloud Gateway可以作为Zuul的替代方案。

使用方法： 

创建一个模块，引入``spring-cloud-starter-gateway``依赖，然后在配置文件中配置路由规则。

**配置文件：**

```yaml
server:
    port:8080

spring:
    application:
        name: hm-gateway
    cloud:
        nacos:
            discovery:
                server-addr: 172.27.62.11:8848
        gateway:
            routes:
                - id: item # 路由规则id，自定义，唯一
                  uri: lb://item-service # 路由的目标服务，lb代表负载均衡，会从注册中心拉取服务列表
                  predicates: # 路由断言，判断当前请求是否符合当前规则，符合则路由到目标服务
                      - Path=/items/**,/search/** # 这里是以请求路径作为判断规则
                - id: cart
                  uri: lb://cart-service
                  predicates:
                      - Path=/carts/**
                - id: user
                  uri: lb://user-service
                  predicates:
                      - Path=/users/**,/addresses/**
                - id: trade
                  uri: lb://trade-service
                  predicates:
                      - Path=/orders/**
                - id: pay
                  uri: lb://pay-service
                  predicates:
                      - Path=/pay-orders/**
```

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/20250123155855803.png)

#### 网管请求处理流程

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/20250123162330094.png)

#### 网关过滤器

网关过滤器是Spring Cloud Gateway的核心组件，它可以实现对请求的拦截和处理，可以实现对请求的修改，日志记录，安全认证等功能。

**自定义Global过滤器：**

基本逻辑如下，可以根据需求从`exchange`中获取请求信息，然后进行处理，可以放行，也可以拦截。

```Java
@Component
public class PrintAnyGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 编写过滤器逻辑
        System.out.println("未登录，无法访问");
        // 放行
        // return chain.filter(exchange);

        // 拦截
        ServerHttpResponse response = exchange.getResponse();
        response.setRawStatusCode(401);
        return response.setComplete();
    }

    @Override
    public int getOrder() {
        // 过滤器执行顺序，值越小，优先级越高
        return 0;
    }
}
```

### 用户信息全局处理器

在微服务中，可以在公共模块中编写一个全局处理器，用于提取用户信息，可以在网关过滤器处理时请求头中添加用户信息，然后在全局处理器中提取用户信息，这样就可以在微服务中获取用户信息。

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/20250124175625833.png)

### 配置管理与热更新

`nacos`提供了配置管理功能，可以将配置文件存储在`nacos`中，然后在微服务中通过`nacos`的配置中心来获取配置文件，这样就可以实现配置文件的统一管理和热更新。

**使用方法：**

1. 引入相关依赖
2. 创建bootstrap.yaml
3. 在nacos中添加配置
4. 修改application.yaml

具体看**黑马商城微服务04**的文档，很重要！！！

其中在``bootstrap.yaml``中可以配置热更新的文件名，注册在nacos中，然后在`config`包下的实现类注入对应信息后，nacos的配置文件内容修改，该注入信息也动态修改而无需重启服务


## 微服务保护和分布式管理

### 雪崩

雪崩效应是指在分布式系统中，由于某个服务的不可用导致其他服务的不可用，最终导致整个系统的不可用，这种现象就叫做雪崩效应。

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/20250125121128010.png)

### Sentinal

Sentinel是阿里巴巴开源的一款面向分布式服务架构的轻量级高可用流量控制组件，Sentinel可以实现流量控制，熔断降级，系统负载保护等功能，可以保护分布式系统的稳定性。

使用方法：

1. 引入依赖

```xml
<!--sentinel-->
<dependency>
    <groupId>com.alibaba.cloud</groupId> 
    <artifactId>spring-cloud-starter-alibaba-sentinel</artifactId>
</dependency>
```

2. 配置文件

```yaml
spring:
  cloud:
    sentinel:
      transport:
        dashboard: localhost:8090 # 服务端口
      http-method-specify: true # 开启请求方式前缀 将请求方式和请求路径拼接在一起作为簇点

3. 启动Sentinal


```cmd
java -Dserver.port=8090 -Dcsp.sentinel.dashboard.server=localhost:8090 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar
```

### 分布式事务 Seata

Seata是一款开源的分布式事务解决方案，Seata提供了AT，TCC，SAGA，XA等多种事务模式，可以实现分布式事务的一致性。

#### Seata的架构

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/20250126172100845.png)

#### XA模式

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/20250126172154736.png)

#### AT模式

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/20250126172226366.png)

## 消息队列MQ

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/20250126173235524.png)


### RabbitMQ

RabbitMQ是一个开源的消息代理，用于实现消息队列，RabbitMQ是一个高性能的消息中间件，可以实现消息的生产者和消费者之间的解耦，RabbitMQ支持多种消息协议，包括AMQP，STOMP，MQTT等。

#### 基本架构

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/20250127100128900.png)


