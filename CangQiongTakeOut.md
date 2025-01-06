# 目录

<!-- vim-markdown-toc GFM -->

* [DTO 和 VO](#dto-和-vo)
    * [概念区别](#概念区别)
* [NGINX 反向代理](#nginx-反向代理)
    * [什么是反向代理](#什么是反向代理)
    * [配置反向代理](#配置反向代理)
    * [负载均衡](#负载均衡)
* [Swagger](#swagger)
    * [什么是 Swagger](#什么是-swagger)
    * [使用方式](#使用方式)
    * [常用注解](#常用注解)
* [ThreadLocal](#threadlocal)
    * [ThreadLocal 的使用方式：](#threadlocal-的使用方式)
* [公共字段自动填充](#公共字段自动填充)
* [Redis](#redis)
    * [什么是 Redis](#什么是-redis)
    * [Redis 常用命令](#redis-常用命令)
        * [字符串](#字符串)
        * [哈希](#哈希)
        * [列表](#列表)
        * [集合](#集合)
        * [有序集合](#有序集合)
        * [通用命令](#通用命令)

<!-- vim-markdown-toc -->

## DTO 和 VO

* **VO（View Object)**：视图对象，专门用于前端展示层，专注于表示某个具体的值或对象的对象，包含业务逻辑；VO的作用是将一组数据以适合特定用户界面（UI）的形式封装起来，确保数据的呈现既符合设计要求也满足用户体验标准。

* **DTO（Data Transfer Object）**：数据传输对象，侧重于传输数据的对象，不包含业务逻辑；主要在展示层与服务层之间充当媒介，负责数据的标准化传输，确保数据在不同系统或组件间的准确无误传递。

### 概念区别

* **VO** ：假设我们有一个电子商务网站，其中产品详情页需要显示产品的名称、价格、库存、图片等信息。VO会将这些信息以最优化的方式组织起来，供前端展示。比如，前端可能需要将产品分类显示为“热销商品”、“新品推荐”或“特价优惠”，VO会根据不同的展示需求，以适当的形式提供数据。例如，将从后端接收到的“男性”标签在客户端1上显示为“帅哥”，而在客户端2上显示为“靓仔”。这样，VO可以根据不同的展示需求，提供不同的数据格式，以满足前端展示的要求。

* **DTO**：当展示层需要向服务层请求数据时，例如查询“男性”类别的产品，它会将“男性”这一概念封装进DTO中，以标准化格式发送请求。服务层接收到这个DTO后，理解为需要查询“男性”类别相关的产品数据，处理后同样以DTO的形式返回，其中可能包括所有“男性”类别的产品信息。这样，无论前端如何展示（如“帅哥”或“靓仔”），后端只需处理统一的“男性”类别，实现了前后端的解耦。


## NGINX 反向代理 

### 什么是反向代理

反向代理（Reverse Proxy）是代理服务器的一种，它根据客户端的请求，从后端服务器上获取资源，然后再返回给客户端。反向代理隐藏了真实服务器的信息，客户端只能看到代理服务器的信息。反向代理服务器通常用于以下几个方面：

- 保护真实服务器的信息安全
- 负载均衡
- 缓存静态资源
- 隐藏真实服务器的信息

反向代理的工作流程如下：

1. 客户端向反向代理服务器发送请求
2. 反向代理服务器根据请求的内容，从后端服务器获取资源
3. 反向代理服务器将获取到的资源返回给客户端

### 配置反向代理
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501021644456.png)
    
### 负载均衡

负载均衡是指将请求分发到多个服务器上，以达到均衡服务器负载的目的。负载均衡有以下几种方式：

- 轮询（Round Robin）：按照请求的顺序依次分发到后端服务器上
- 加权轮询（Weighted Round Robin）：按照权重分发请求到后端服务器上
- IP Hash：根据客户端的 IP 地址进行 hash 计算，然后将请求分发到后端服务器上
- Least Connections：将请求分发到当前连接数最少的后端服务器上
- URL Hash：根据 URL 进行 hash 计算，然后将请求分发到后端服务器上
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501021648193.png)

## Swagger

### 什么是 Swagger

Swagger 是一个规范和完整的框架，用于生成、描述、调用和可视化 RESTful 风格的 Web 服务。Swagger 提供了一套工具，包括用于 API 文档生成、代码生成和 API 测试的工具。Swagger 支持多种语言，如 Java、Python、JavaScript 等。

### 使用方式

**1. 引入依赖**

```xml
<dependency>
    <groupId>com.github.xiaoymin</groupId>
    <artifactId>knife4j-spring-boot-starter</artifactId>
    <version>${knife4j}</version>
</dependency>
```

**2. 配置 Swagger**

```java
/**
* 通过knife4j生成接口文档
* @return
*/
@Bean
public Docket docket() {
    ApiInfo apiInfo = new ApiInfoBuilder()
            .title("苍穹外卖项目接口文档")
            .version("2.0")
            .description("苍穹外卖项目接口文档")
            .build();
    Docket docket = new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.sky.controller"))
            .paths(PathSelectors.any())
            .build();
    return docket;
    }
```

**3. 设置静态映射**

```java
/**
     * 设置静态资源映射
     * @param registry
     */
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
```

### 常用注解

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501021954477.png)


## ThreadLocal

ThreadLocal 是一个线程内部的数据存储类，可以在每个线程中存储数据，数据存储以后，只有对应线程可以获取到这个数据，其他线程无法获取到这个数据。ThreadLocal 为每个线程都提供了一个独立的变量副本，所以每个线程都可以独立地改变自己的副本，而不会影响其他线程的副本。

ThreadLocal 的使用场景：

- 数据库连接管理
- Session 管理
- 事务管理
— PageHelper 分页插件

### ThreadLocal 的使用方式：

通常将ThreadLocal进行封装，
提供get、set、remove等方法，方便使用。

```java
public class BaseContext {

    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }

    public static void removeCurrentId() {
        threadLocal.remove();
    }

}
```

## 公共字段自动填充

在实际开发中，我们经常会遇到一些公共字段，比如创建时间、更新时间、创建人、更新人等，这些字段在每次新增或更新时都需要手动填充，非常繁琐。为了简化这个过程，我们可以**使用 AOP 的方式**来实现公共字段的自动填充。

**1. 定义注解**

其中，OperationType 是一个枚举类，用于标识操作类型，比如新增、更新、删除等。


```Java
/**
 * 数据库操作类型
 */
public enum OperationType {

    /**
     * 更新操作
     */
    UPDATE,

    /**
     * 插入操作
     */
    INSERT

}

```

```java
@Target(ElementType.METHOD)
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface AutoFill {
    OperationType value();
}
```

**2. 定义切面**

* 在切面中，我们定义了一个前置通知，用于在目标方法执行前自动填充公共字段。在前置通知中，我们首先获取目标方法的操作类型，然后根据操作类型填充对应的字段。

* 使用Pointcut定义切入点，通过@annotation注解指定切入点为所有被@AutoFill注解的方法。

* 利用JoinPoint获取目标方法的参数，使用****<++>然后根据操作类型填充对应的字段。

```java
@Aspect
@Slf4j
@Component
public class AutoFillAspect {

    @Pointcut("execution(* com.sky.mapper.*.*(..)) && @annotation(com.sky.annotation.AutoFill)")
    public void pointcut() {
    }

    /**
     * 前置通知
     */
    @Before("pointcut()")
    public void autoFill(JoinPoint joinPoint) {
        log.info("公共字段自动填充");

        // 获取目标方法的数据库操作类型
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        AutoFill autoFill = signature.getMethod().getAnnotation(AutoFill.class);
        OperationType operationType = autoFill.value();

        // 获取目标方法的参数
        Object[] args = joinPoint.getArgs();
        if (args == null || args.length == 0) {
            return;
        }

        // 获取到当前被拦截方法的参数 -- 实体对象
        Object entity = args[0];

        // 准备填充的字段
        LocalDateTime now = LocalDateTime.now();
        Long currentId = BaseContext.getCurrentId();

        // 根据操作类型填充字段
        if (operationType == OperationType.INSERT) {
            try {
                Method setCreateTime = entity.getClass().getDeclaredMethod(AutoFillConstant.SET_CREATE_TIME, LocalDateTime.class);
                Method setUpdateTime = entity.getClass().getDeclaredMethod(AutoFillConstant.SET_UPDATE_TIME, LocalDateTime.class);
                Method setCreateId = entity.getClass().getDeclaredMethod(AutoFillConstant.SET_CREATE_USER, Long.class);
                Method setUpdateId = entity.getClass().getDeclaredMethod(AutoFillConstant.SET_UPDATE_USER, Long.class);
                setCreateTime.invoke(entity, now);
                setUpdateTime.invoke(entity, now);
                setCreateId.invoke(entity, currentId);
                setUpdateId.invoke(entity, currentId);

            } catch (Exception e) {
                log.error("实体类缺少必要的字段");
            }
        } else if (operationType == OperationType.UPDATE) {
            try {
                Method setUpdateTime = entity.getClass().getDeclaredMethod(AutoFillConstant.SET_UPDATE_TIME, LocalDateTime.class);
                Method setUpdateId = entity.getClass().getDeclaredMethod(AutoFillConstant.SET_UPDATE_USER, Long.class);
                setUpdateTime.invoke(entity, now);
                setUpdateId.invoke(entity, currentId);
            } catch (Exception e) {
                log.error("实体类缺少必要的字段");
            }
        }
    }
}
```

## Redis

### 什么是 Redis

Redis 是一个开源的**内存数据库**，它支持多种数据结构，如字符串、哈希、列表、集合、有序集合等。Redis 通常用于缓存、消息队列、分布式锁等场景。

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501061522239.png)

### Redis 常用命令

#### 字符串

- **SET key value**：设置 key 的值为 value
- **GET key**：获取 key 的值
- **DEL key**：删除 key
- **SETEX key seconds value**：设置 key 的值为 value，并设置过期时间为 seconds 秒
- **SETNX key value**：只有在 key 不存在时，才设置 key 的值为 value

* 在Java中，我们可以使用 RedisTemplate 来操作 Redis，RedisTemplate 是 Spring Data Redis 提供的一个模板类，用于简化 Redis 的操作。


**Java中对应的操作：**
```Java
@Test
    public void testString()
    {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("name", "sky");  // set key value
        System.out.println(valueOperations.get("name"));  // get key
        valueOperations.set("string", "sky", 1000, TimeUnit.SECONDS);  // setex key seconds value
        valueOperations.setIfAbsent("lock", "2");  // setnx key value;
    }
```


#### 哈希

- **HSET key field value**：设置 key 中 field 的值为 value
- **HGET key field**：获取 key 中 field 的值
- **HDEL key field**：删除 key 中 field 的值
- **HKEYS key**：获取 key 中所有 field 的值
- **HVALS key**：获取 key 中所有 value 的值

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501061534562.png)

**Java中对应的操作：**
```Java
@Test
    public void testHash()
    {
        // hset hget hdel hkeys hvals
        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.put("user", "name", "sky");  // hset key field value
        hashOperations.put("user", "age", "18");
        System.out.println(hashOperations.get("user", "name"));  // hget key field
        Set user = hashOperations.keys("user"); // hkeys key
        System.out.println(user);

        List values = hashOperations.values("user");// hvals key
        System.out.println(values);

        hashOperations.delete("user", "name");  // hdel key field

    }
```

#### 列表

- **LPUSH key value**：将 value 插入到 key 的列表头部
- **RPUSH key value**：将 value 插入到 key 的列表尾部
- **LRANGE key start stop**：获取 key 的列表中从 start 到 stop 的元素
- **LPOP key**：移除并返回 key 的列表头部元素
- **RPOP key**：移除并返回 key 的列表尾部元素
- **LLEN key**：获取 key 的列表长度


**L 表示左侧，R 表示右侧，PUSH 表示插入，POP 表示移除。**

**Java中对应的操作：**
```Java
@Test
    public void testList(){
        //lpush lrange rpop llen
        ListOperations listOperations = redisTemplate.opsForList();

        listOperations.leftPushAll("mylist","a","b","c"); // lpush key value1 value2 value3
        listOperations.leftPush("mylist","d"); // lpush key value

        List mylist = listOperations.range("mylist", 0, -1); // lrange key start stop
        System.out.println(mylist);

        listOperations.rightPop("mylist"); // rpop key

        Long size = listOperations.size("mylist"); // llen key
        System.out.println(size);
    }
```


#### 集合

- **SADD key member**：将 member 添加到 key 的集合中
- **SMEMBERS key**：获取 key 的集合中所有元素
- **SISMEMBER key member**：判断 member 是否在 key 的集合中
- **SREM key member**：将 member 从 key 的集合中移除
- **SCARD key**：获取 key 的集合中元素的个数
- **SINTER key1 [key2]**：获取 key1 和 key2 的交集
- **SUNION key1 [key2]**：获取 key1 和 key2 的并集
- **SDIFF key1 [key2]**：获取 key1 和 key2 的差集
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501061557252.png)

**Java中对应的操作：**
```Java
@Test
    public void testSet(){
        //sadd smembers scard sinter sunion srem
        SetOperations setOperations = redisTemplate.opsForSet();

        setOperations.add("set1","a","b","c","d"); // sadd key value1 value2 value3
        setOperations.add("set2","a","b","x","y"); // sadd key value1 value2 value3

        Set members = setOperations.members("set1"); // smembers key
        System.out.println(members);

        Long size = setOperations.size("set1"); // scard key
        System.out.println(size);

        Set intersect = setOperations.intersect("set1", "set2"); // sinter key1 key2
        System.out.println(intersect);

        Set union = setOperations.union("set1", "set2"); // sunion key1 key2
        System.out.println(union);

        setOperations.remove("set1","a","b"); // srem key value1 value2
    }
```


#### 有序集合

- **ZADD key score member**：将 member 添加到 key 的有序集合中，并设置分数为 score
- **ZRANGE key start stop [WITHSCORES]**：获取 key 的有序集合中从 start 到 stop 的元素
- **ZINCRBY key increment member**：将 key 的有序集合中 member 的分数增加 increment
- **ZSCORE key member**：获取 key 的有序集合中 member 的分数
- **ZREM key member**：将 key 的有序集合中 member 移除

**Java中对应的操作：**
```Java
@Test
    public void testZset(){
        //zadd zrange zincrby zrem
        ZSetOperations zSetOperations = redisTemplate.opsForZSet();  

        zSetOperations.add("zset1","a",10); // zadd key score value
        zSetOperations.add("zset1","b",12);
        zSetOperations.add("zset1","c",9);

        Set zset1 = zSetOperations.range("zset1", 0, -1); // zrange key start stop
        System.out.println(zset1);

        zSetOperations.incrementScore("zset1","c",10); // zincrby key increment value

        zSetOperations.remove("zset1","a","b"); // zrem key value1 value2
    }
```


#### 通用命令

- **EXPIRE key seconds**：设置 key 的过期时间为 seconds 秒
- **TTL key**：获取 key 的剩余过期时间
- **EXISTS key**：判断 key 是否存在
- **DEL key**：删除 key
- **KEYS pattern**：获取所有符合 pattern 的 key
- **TYPE key**：获取 key 的类型

**Java中对应的操作：**
```Java
@Test
    public void testCommon(){
        //keys exists type del
        Set keys = redisTemplate.keys("*");  // keys pattern
        System.out.println(keys);

        Boolean name = redisTemplate.hasKey("name"); // exists key
        Boolean set1 = redisTemplate.hasKey("set1"); // exists key

        for (Object key : keys) {
            DataType type = redisTemplate.type(key); // type key
            System.out.println(type.name());
        }

        redisTemplate.delete("mylist"); // del key
    }
```


