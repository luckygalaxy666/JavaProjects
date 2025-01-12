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
* [HTTPClient](#httpclient)
    * [使用场景](#使用场景)
* [Spring Cache](#spring-cache)
    * [什么是 Spring Cache](#什么是-spring-cache)
    * [常用注解](#常用注解-1)
* [Spring Task](#spring-task)
    * [什么是 Spring Task](#什么是-spring-task)
    * [使用方式](#使用方式-1)
* [WebSocket](#websocket)
    * [什么是 WebSocket](#什么是-websocket)
    * [使用方式](#使用方式-2)

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

## HTTPClient

HttpClient 是 Apache 提供的一个 Java HTTP 客户端库，用于发送 HTTP 请求。HttpClient 提供了多种请求方法，如 GET、POST、PUT、DELETE 等，支持多种认证方式，如 Basic 认证、Digest 认证等。

**1. 引入依赖**

```xml
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpclient</artifactId>
    <version>4.5.13</version>
</dependency>
```

**2. 发送 GET 请求**

```java
@Test
    public void testGET() throws Exception {
        // 创建HttpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        // 创建请求对象
        HttpGet httpGet = new HttpGet("http://localhost:8080/user/shop/status");

        // 发送请求，接收响应结果
        CloseableHttpResponse response = httpClient.execute(httpGet);

        // 获取服务端返回的状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("服务端返回的状态码 = " + statusCode);

        // 获取服务端返回的数据
        HttpEntity entity = response.getEntity();
        String body = EntityUtils.toString(entity);
        System.out.println("服务端返回的数据 = " + body);

        // 关闭资源
        response.close();
        httpClient.close();
    }
}
```

**3. 发送 POST 请求**

```java
@Test
    public void testPOST() throws Exception {
        // 创建HttpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        // 创建请求对象
        HttpPost httpPost = new HttpPost("http://localhost:8080/admin/employee/login");

        // 发送请求，接收响应结果
        // 设置请求头
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", "admin");
        jsonObject.put("password", "123456");
        StringEntity stringEntity = new StringEntity(jsonObject.toString(), "UTF-8");
//        stringEntity.setContentEncoding("UTF-8");
        stringEntity.setContentType("application/json");

        httpPost.setEntity(stringEntity);
        CloseableHttpResponse response = httpClient.execute(httpPost);

        // 获取服务端返回的状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("服务端返回的状态码 = " + statusCode);

        // 获取服务端返回的数据
        HttpEntity entity = response.getEntity();
        String body = EntityUtils.toString(entity);
        System.out.println("服务端返回的数据 = " + body);

        // 关闭资源
        response.close();
        httpClient.close();
    }
```

### 使用场景

在苍穹外卖项目中，用户端使用小程序登录时，会向后端发送code,后端需要向微信服务器发送请求，获取用户的openid（用户微信的唯一标识），利用open_id 查询数据库中是否存储该用户，如果没有则更新数据库

## Spring Cache

### 什么是 Spring Cache
Spring Cache 是 Spring Framework 提供的一个缓存抽象，它允许开发者在应用程序中轻松地添加缓存功能。Spring Cache 支持多种缓存实现，如 EhCache、Caffeine、Redis 等。通过使用 Spring Cache，开发者可以将方法的返回值缓存起来，以减少重复计算，提高应用程序的性能。

### 常用注解

- **@EnableCaching**：用于开启 Spring Cache 功能。通常在配置类上使用。
- **@Cacheable**：用于标注一个方法，该方法的返回值将被缓存起来。下次调用该方法时，如果缓存中存在对应的值，则直接从缓存中获取，而不再执行方法体。 **在调用方法之前会通过动态代理先从缓存中查找**
- **@CachePut**：用于标注一个方法，该方法的返回值将被缓存起来。与 @Cacheable 不同的是，每次调用该方法时，都会执行方法体，并将返回值更新到缓存中。 **只存不取**
- **@CacheEvict**：用于标注一个方法，该方法执行后，将从缓存中移除对应的值。可以通过设置 allEntries 属性为 true，来清空整个缓存。

**示例：**

在启动类中添加@EnableCaching注解，开启缓存功能
```java
@Slf4j
@SpringBootApplication
@EnableCaching // 开启缓存
public class CacheDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CacheDemoApplication.class,args);
        log.info("项目启动成功...");
    }
}
```


在Controller中添加@CachePut注解，将user对象以 key为 ``userCache::id``的形式存储到缓存中
```java
@PostMapping
    @CachePut(cacheNames = "userCache", key = "#user.id")
    public User save(@RequestBody User user){
        userMapper.insert(user);
        return user;
    }
```

在Controller中添加@Cacheable注解，查询user对象时，先从缓存中获取，如果缓存中没有，则从数据库中查询，并将查询结果存储到缓存中
```java
@GetMapping
    @Cacheable(cacheNames = "userCache", key = "#id")
    public User getById(Long id){
        User user = userMapper.getById(id);
        return user;
    }
```

删除user对象时，先从缓存中移除对应的值
```java
@DeleteMapping
    @CacheEvict(cacheNames = "userCache", key = "#id") // 删除某个key
    public void deleteById(Long id){
        userMapper.deleteById(id);
    }

	@DeleteMapping("/delAll")
    @CacheEvict(cacheNames = "userCache", allEntries = true)  // 清空缓存
    public void deleteAll(){
        userMapper.deleteAll();
    }
```

## Spring Task

### 什么是 Spring Task

Spring Task 是 Spring Framework 提供的一个任务调度框架，用于执行定时任务。Spring Task 支持多种任务调度方式，如固定间隔调度、固定延迟调度、cron 表达式调度等。通过使用 Spring Task，开发者可以轻松地实现定时任务的调度。

### 使用方式

* 1. 在启动类上添加@EnableScheduling注解，开启定时任务功能

* 2. 在定时任务类上添加@Component注解，将定时任务类交给Spring容器管理

* 3. 在定时任务方法上添加@Scheduled注解，指定任务调度方式

**示例：**

每隔一分钟查询超时订单，将超时未支付的订单状态修改为取消
```Java
@Scheduled(cron = "0 * * * * ? ")
    public void processTimeOutOrder() {
        log.info("处理超时订单");
        //查询超时订单
        LocalDateTime time = LocalDateTime.now().plusMinutes(-15);
        List<Orders> list = orderMapper.selectTimeOutOrder(Orders.PENDING_PAYMENT,time);

        if(list != null && list.size() > 0)
        {
            for (Orders order : list) {
                //修改订单状态为取消
                order.setStatus(Orders.CANCELLED);
                order.setCancelTime(LocalDateTime.now());
                order.setCancelReason("超时未支付，系统自动取消");
                orderMapper.update(order);
            }
        }
    }
```

## WebSocket

### 什么是 WebSocket

WebSocket 是一种在单个 TCP 连接上进行全双工通信的协议。WebSocket 通常用于实时通信，如在线聊天、实时数据推送等。WebSocket 与 HTTP 协议不同，它是一种持久连接，客户端与服务器之间可以双向通信，而不是单向请求-响应。

 ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202501121331152.png)

### 使用方式

* 1. 在 Spring Boot 中使用 WebSocket，首先需要引入 Spring Boot 的 WebSocket 依赖

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-websocket</artifactId>
</dependency>
```

* 2. 创建 WebSocket 配置类，用于注册 WebSocket 的 Bean

```java
@Configuration
public class WebSocketConfiguration {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

}
```

* 3. 创建 WebSocket 处理类，用于处理 WebSocket 的连接、断开、消息发送等操作

```java
@Component
@ServerEndpoint("/ws/{sid}")
@Slf4j
public class  WebSocketServer {

    //存放会话对象
    private static Map<String, Session> sessionMap = new HashMap();

    /**
     * 连接建立成功调用的方法
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("sid") String sid) {
        System.out.println("客户端：" + sid + "建立连接");
        sessionMap.put(sid, session);
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(String message, @PathParam("sid") String sid) {
        System.out.println("收到来自客户端：" + sid + "的信息:" + message);
    }

    /**
     * 连接关闭调用的方法
     *
     * @param sid
     */
    @OnClose
    public void onClose(@PathParam("sid") String sid) {
        System.out.println("连接断开:" + sid);
        sessionMap.remove(sid);
    }

    /**
     * 群发
     *
     * @param message
     */
    public void sendToAllClient(String message) {
        Collection<Session> sessions = sessionMap.values();
        for (Session session : sessions) {
            try {
                //服务器向客户端发送消息
                log.info("服务器向客户端发送消息");
                session.getBasicRemote().sendText(message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}


