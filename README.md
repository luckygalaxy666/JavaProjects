
# 目录
<!-- vim-markdown-toc GFM -->

* [Java SE](#java-se)
* [JavaWeb](#javaweb)
* [剑指Offer75](#剑指offer75)
* [苍穹外卖](#苍穹外卖)
* [代码随想录](#代码随想录)
* [Java并发编程](#java并发编程)
* [JavaGuide](#javaguide)
* [Raft协议](#raft协议)
* [备战秋招](#备战秋招)
    * [具体学习时间](#具体学习时间)
* [代码随想录](#代码随想录-1)
    * [具体学习时间](#具体学习时间-1)
* [JAVA虚拟机](#java虚拟机)
    * [具体学习时间](#具体学习时间-2)
* [黑马商城（SpringCloud微服务）](#黑马商城springcloud微服务)
    * [具体学习时间](#具体学习时间-3)
* [JUC并发编程](#juc并发编程)
    * [具体学习时间](#具体学习时间-4)
* [JavaGuide](#javaguide-1)
    * [具体学习时间](#具体学习时间-5)
* [Raft协议](#raft协议-1)
* [华为软件精英挑战赛](#华为软件精英挑战赛)
* [备战秋招](#备战秋招-1)

<!-- vim-markdown-toc -->


## Java SE
* **24.11.26** ~ **24.12.15**
* [整理资料](https://github.com/luckygalaxy666/JavaProjects/blob/master/JavaSE.md)

## JavaWeb
* **24.12.16** ~ **24.12.30**
* [整理资料](https://github.com/luckygalaxy666/JavaProjects/blob/master/JavaWeb.md)

## 剑指Offer75
* **24.12.11** ~ **24.12.29**
* [整理资料](https://github.com/luckygalaxy666/Offer75/blob/main/README.md)

## 苍穹外卖
* **25.01.02** ~ **25.01.14**
* [整理资料](https://github.com/luckygalaxy666/JavaProjects/blob/master/CangQiongTakeOut.md)

## 代码随想录
* **24.12.31** ~ **25.02.19**

## Java并发编程
* **25.02.14** ~ **25.02.25**
* [整理资料](https://gitee.com/gu_chun_bo/java-construct/blob/master/java%E5%B9%B6%E5%8F%91%E7%BC%96%E7%A8%8B/java%E5%B9%B6%E5%8F%911.md)

## JavaGuide
* **25.02.26** ~ **25.06.14**

## Raft协议
* **25.03.03** ~ **25.05.01**

## 备战秋招

* **25.07.20** ~ 至今

### 具体学习时间

* **25.01.02** day1
* **25.01.03** day2
* **25.01.04** ~ **25.01.05** day3 ~ day4
* **25.01.06** day4 ~ day5
* **25.01.07** day6  (前端部分略过)
* **25.01.08** day7 （Redis）
* **25.01.09** ~ **25.01.10** day8 ~ day9 (支付功能略过)
* **25.01.12** day10
* **25.01.13** day11
* **25.01.14** day12
* 前端部分略过

## 代码随想录
* **24.12.31** ~ **25.02.19**

### 具体学习时间

* **24.12.30** 数组 -- 二分查找 双指针
* **24.12.31** 数组 -- 滑动窗口
* **25.01.05** 数组 -- 螺旋矩阵 前缀和  链表 -- 1 ~ 5
* **25.01.06** 链表 -- 6 ~ 8 哈希表 -- 1 ~ 6 ，8  
    * **重点** 哈希表 -- 8 三数之和
* **25.01.07** 字符串 -- 1 ~ 6
    * **重点** 字符串 -- 6 kmp算法(如果要从j=0开始匹配，那么next[0] = -1)
* **25.01.08** 字符串 -- 7 栈和队列 -- 1 ~ 8
    * **重点** 栈和队列 -- 7 滑动窗口
* **25.01.10** 二叉树 -- 1 ~ 10
* **25.01.12** 二叉树 -- 11 ~ 21
    * **重点** 二叉树 -- 12 平衡二叉树（递归记录高度+判断时，可以用-1表示否逻辑 这样只需返回Integer一个变量）
    * **重点** 二叉树 -- 18 从中序和后序遍历序列构造二叉树（HashMap 记录 inorder的信息 ， 利用中序确定左右子树信息，利用后序/前序确定根节点）

* **25.01.13** 二叉树 -- 22 ~ 34
    * **重点** 二叉树 -- 23 验证二叉搜索树（左右子树都是二叉搜索树并不能判断跟子树也是  利用中序遍历判断前后即可）
    * **重点** 二叉树 -- 26 二叉树的最近公共祖先（递归判断左右子树是否包含p或q，如果包含则返回当前节点，否则返回null
   * **重点** 二叉树 -- 30 删除二叉搜索树的节点（递归删除左右子树，如果当前节点等于val，分情况讨论 **利用有返回的递归**）

* **25.01.14** 回溯算法 -- 1 ~ 10
    * **重点** 回溯算法 -- 1 8 组合总和Ⅱ（排序 + 使用used 判断上一个数用没用过 如果没用过但是值相同直接跳过）

* **25.01.15** 回溯算法 -- 11 ~ 21
    * **重点** 回溯算法 -- 14 递增子序列（层级递归）*
    * **重点** 回溯算法 -- 19 重新安排行程（递归+ 栈的思想）*

* **25.01.16** 贪心算法 -- 1 ~ 8
* **25.01.17** 贪心算法 -- 9 ~ 16
* **25.01.22** 贪心算法 -- 17 ~ 23
    * **重点** 贪心算法 -- 23 监控二叉树（**可以理解为树状dp**）(递归返回三种状态： 0：未被覆盖 2：已被覆盖 1：已安装摄像头)

* **25.01.23** 动态规划 -- 1 ~ 14
    * **重点** 动态规划 -- 9 不同的二叉搜索树（以i为）根节点，左子树有i-1个节点，右子树有n-i个节点，所以以i为根节点的二叉搜索树的个数为左右子树的笛卡尔积））
    * **重点** 动态规划 -- 14 最后一块石头的重量（对于分成最接近的两部分问题，可以转换成总体积一半的背包最多能装的价值问题 **01背包问题** 价值即为体积）
* **25.01.24** 动态规划 -- 15 ~ 25
* **25.01.25** 动态规划 -- 26 ~ 36
* **25.01.27** 动态规划 -- 37 ~ 47
* **25.01.30** 动态规划 -- 48 ~ 54 单调栈 -- 1 ~ 5
    * **重点** 动态规划 -- 52 回文字串（dp[i][j] = dp[i+1][j-1] && s[i] == s[j]））
    * **重点** 单调栈 -- 4 接雨水（双指针想法和单调栈想法）
    * **重点** 单调栈 -- 5 柱形图中最大的矩形（双指针和单调栈）
* **25.01.31** 图论 -- 1 ~ 10
* **25.02.01** 图论 -- 11 ~ 18
* **25.02.04** 图论 -- 19 ~ 23
* **25.02.05** 图论 -- 24 ~ 29
    * **重点** 图论 -- 27 bellmen-ford算法求最多k次中转的最短路径（**层级更新** 额外记录上次迭代时的距离）
    * **重点** 图论 -- 29 A*算法（**启发式搜索** 估计函数+优先队列 **强化版BFS**）
* **25.02.13** 额外题目 -- 数组 哈希表 字符串
    * **重点** 额外题目 -- 重排链表（找到中点+反转后半部分+合并两个链表）
    * **重点** 额外题目 -- 回文链表（找到中点+反转后半部分+比较两个链表）
* **25.02.14** 额外题目 -- 二叉树 贪心
* **25.02.18** 额外题目 -- 动态规划 图论
* **25.02.19** 额外题目 -- 并查集 模拟 位运算
    * **重点** 额外题目 -- 并查集 冗余运算Ⅱ（两种条件：入度为2 或者成环）
    * **重点** 额外题目 -- 模拟 下一个排列（从后往前找到第一个升序对，然后从后往前找到第一个比升序对大的数，交换后翻转后面的数）
## JAVA虚拟机
* **25.01.09** ~ 至今

### 具体学习时间

* **25.01.09** 第二章 -- Java内存区域与内存溢出异常
* **25.01.13 ~ 25.01.15** 第三章 -- 垃圾收集器与内存分配策略

## 黑马商城（SpringCloud微服务）

* **25.01.16** ~  **25.02.12**
* [整理资料](https://github.com/luckygalaxy666/JavaProjects/blob/master/SpringCloud.md)
 
### 具体学习时间

* **25.01.16 ~ 25.01.17** MybatisPlus
* **25.01.21** Docker
* **25.01.22 ~ 25.01.23** 微服务(Nocus OpenFeign)
* **25.01.24** 微服务(登录校验) **重点复习**
* **25.01.25 ~ 25 01.26** 微服务保护与分布式管理
* **25.01.27** MQ消息队列基础
    * **重点** 利用`MessageConverter`将消息转换为jsn格式，并利用重写`fromMessage`和`toMessage`方法在请求头传递和解析用户Id，实现类似于拦截器的功能
* **25.01.31** MQ消息队列高级 (代码实现没有细看和操作)
* **25.02.01** ElasticSearch基础
* **25.02.02** ElasticSearch高级
* **25.02.04** ElasticSearch作业
* **25.02.05** Redis面试相关
* **25.02.06** 微服务面试相关
* **25.02.10 ~ 25.02.12** 复习[黑马商城微服务资料](https://b11et3un53m.feishu.cn/wiki/R4Sdwvo8Si4kilkSKfscgQX0niB)
* **25.03.03 ~ 25.03.08** docker compose 部署上云
## JUC并发编程

* **25.02.14** ~ **25.02.25**
* [整理资料](https://gitee.com/gu_chun_bo/java-construct/blob/master/java%E5%B9%B6%E5%8F%91%E7%BC%96%E7%A8%8B/java%E5%B9%B6%E5%8F%911.md)

### 具体学习时间
* **25.02.14** JUC并发编程 -- 1 ~ 42
    * **主要学习内容** 线程的创建和启动，线程的状态，常见方法
* **25.02.15** JUC并发编程 -- 43 ~ 96
    * **主要学习内容** 线程安全、线程同步，对象锁synchronized（重量级锁，自旋锁，偏向锁，轻量级锁)
        * **重点** synchronized的锁升级过程
* **25.02.18** JUC并发编程 -- 97 ~ 133
    * **主要学习内容** 锁ReentrantLock, Park和Unpark(信号量机制)、保护性暂停（同步 一对一）、生产者消费者模式（异步 多对多）、顺序控制
        * **重点** ReentrantLock的使用和原理
        * **重点** `wait()`和`notify()`的使用和原理
* **25.02.19** JUC并发编程 -- 134 ~ 168
    * **主要学习内容** volatile关键字（读屏障、写屏障）-> 可见性、有序性、不保证原子性
        * **重点** volatile的使用和原理
        * **重点** volatile的内存屏障
        * **重点** 单例设计模式（懒汉式、饿汉式、双重检查、静态内部类、枚举）
        * **重点** 缓存优化 -> 影响可见性 指令重排序 -> 影响有序性
* **25.02.20** JUC并发编程 -- 169 ~ 204
    * **主要学习内容** CAS、原子、自定义线程池
        * **重点** 原子类的使用和原理
        * **重点** 自定义线程池的使用和原理
* **25.02.21** JUC并发编程 -- 205 ~ 232
    * **主要学习内容** ThreadPoolExecutor、设计模式-工作线程-饥饿（解决办法：不同工作不同线程池）、Tomcat线程池(自旋重试、核心线程->救急线程->阻塞队列)
        )
* **25.02.22** JUC并发编程 -- 233 ~ 270
    * **主要学习内容** ForkJoinPool（递归线程池 分治）、CountDownLatch、Semaphore(信号量)、reenTrantReadWriteLock(读写锁)

## JavaGuide
* **25.02.26** ~ **25.06.14**
* [整理资料](https://javaguide.cn/home.html>)

### 具体学习时间
* **25.02.26** 并发编程 -- 常见面试题（上）（中）AQS详解 
* **25.02.27** 并发编程 -- 常见面试题（下） 乐观锁和悲观锁 CAS详解 JMM详解
* **25.04.20** JAVA IO
* **25.04.21** Java集合
* **25.04.22** JVM
* **25.04.23** 数据库 -- 基础 ~ SQL常见面试题总结（2）
* **25.04.24** 数据库 -- MySQL常见面试题总结 高性能优化规范 计算机基础 计算机网络常见面试题（上）
## Raft协议
* **25.03.03** ~ **25.05.01**


## 华为软件精英挑战赛
* **25.03.08** ~ **25.03.30**  初赛第二名
* **25.03.31** ~ **25.04.14**  复赛滑跪

## 备战秋招
* **25.07.20**
Java数据比较
```
public static void main(String[] args) {

        Long a = new Long(42);
        Integer b = new Integer(42);
        BigInteger c = new BigInteger("42");
//        System.out.println(b == c); // false, because a is Long and b is Integer, different types
//        System.out.println(a == b); // false, because a is Long and b is Integer, different types
        System.out.println(a.equals(b)); // true, because Long's equals method checks for value equality

        int d = 10;
        double e = 10.0;
        System.out.println(d == e); // true, because d is int and e is double, but they are both 10
        System.out.println(e == d);
        System.out.println(e ==10); // true,

        Boolean f = new Boolean(true);
        String g = new String("true");
//        System.out.println(f == g); // 不可比较
        System.out.println(f.equals(g)); // false, because f is Boolean and g is String, different types
//        String s = null;
//        System.out.println("s= " + s); // s= null
//        String s ;
//        System.out.println("s= " + s); //报错 未初始化s

        int i = 1;
        int j = i++;
        if((i>++j)&&(i++ ==j)) // &&后不执行
        {
            i+=j;
        }
        System.out.println("i= "+i); // i= 2
    }
```
* **25.07.21**  
    * 代码随想录
        * **重点** 验证二叉搜索树
    * 分布式事务
        * SEATA 提供XA（cp）,AT(ap), TCC(ap)三种事务模型
        * MQ 
* **25.07.22**
    * 接口幂等性
        * 幂等性：多次执行同一操作，结果相同
        * 新增操作：数据库唯一索引解决
        * 更新操作：使用版本号或时间戳 或者reids+token 以及分布式锁
    * Kafka 
        * 结构
            * ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507221635803.png) 
        * 防止消息丢失
            * 消息生产阶段： 生产者确认机制+ 重试
            * 消息传输阶段： 消息副本机制+ ISR机制（in-sync_replicas + leader_follower + HW 高水位机制）
            * 消息消费阶段： 接受消息＋消息处理之后再回复ACK,对于kafka来说可以改为手动提交偏移量
* **25.07.24**
    * 代码随想录
        * **重点** 二叉搜索树的插入操作
        * **重点** 修剪二叉搜索树
        * 对于二叉搜索树的递归理解
            * 1. 利用中序遍历的特性，记录previous节点,用当前节点和previous节点比较大小
            * 2. 根据当前节点是否满足要求，对左子树或右子树进行有返回值的递归
    * HashMap
        * ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507241553481.png)
    * Synchronized
        * ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507242016680.png) 
    * Lock : ReentrantLock,ReentrantWriteReadLock
        * 可超时 tryLock(long timeout, TimeUnit unit)
        * 可中断 lockInterruptibly()
        * 可重入
        * 公平锁和非公平锁
        * 多条件变量
        * ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507242145714.png) 
* **25.07.27**
    * ThreadLocal
        * ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507271700235.png)
    * 运行时常量池
        * ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507271928518.png)
* **25.07.28**
    * 工厂设计模式
        * 主要作用：解耦
        * ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507281551163.png)
    * 策略设计模式
        * 主要作用：替换if-else或switch-case
        * ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507281605328.png)
    * 单点登录（SSO）
        *![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507281632601.png)
    * 权限认证
        * **RBAC（Role-Based Access Control）基于角色的访问控制 + Spring Security** 电商项目可以描述
        * ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507281637576.png)
    * 棘手问题
        * ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507281700161.png) 
    * 日志采集
        * 在`logback-spring.xml`中配置日志采集（logStash的相关配置）
        * 在`kibana`中的`discover`中筛选日志，`dashboard`中可视化日志
        * ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507281717014.png)
        * ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507281708525.png)
    * 查看日志
        * ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507281943781.png)
    * 如何定位性能瓶颈
        * ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507281955612.png)
* **25.07.29**
    * 代码随想录
        * **重点** 根据身高重建队列
            * 给某个人排队时需要保证所有比他高的人都已经排好，只需要在指定位置插入即可
            * 因此对身高进行降序排序，身高相同的按照k值升序排序
    * **Raft协议**
        * 如何解决脑裂问题
            * 不发生网络分区时，基于任期号机制+心跳检测，确保只有一个leader
            * 发生网络分区时，基于多数派投票机制，确保只有多数派分区能选举出leader
            * 即使分区后原leader位于少数派分区，也会因为心跳检测超时而失去leader资格，自动退位
        * 如何实现配置变更（ **两阶段配置变更** ）
            * 一阶段：联合共识
                * 分别记录新旧配置的节点信息
                * 使用日志复制传输配置信息
                * 需要同时满足新旧配置的多数派要求后，将联合共识配置加入到状态机中
            * 二阶段：新配置生效
                * 满足新配置的多数派要求后，状态机将新配置生效
                * 旧配置的节点会被新配置的节点踢出集群
            * 核心优势
                * 通过联合共识，确保新旧配置的节点都能参与到共识中，避免了脑裂问题
                * 新配置生效后，旧配置的节点会被踢出集群，确保集群的一致性
        * 项目用到了哪些JUC组件
            * 自定义线程池`RaftThreadPool`和`RaftThreadPoolExecutor`
                * 定时线程池：心跳检测，投票选举重试
                * 普通线程池：日志复制，RPC调用
                * 自定义线程池执行器：记录任务执行时间和释放`ThreadLocal`资源
            * 阻塞队列`BlockingQueue`
                * 限制队列长度用于线程池
            * `CountDownLatch`
                * 用于等待所有投票选举RPC完成
            * 原子变量`AtomicInteger`
                * 用于记录日志复制成功数和投票数，确保线程安全
            * `ReentrantLock`
                * 用于保护日志写入和状态机操作的线程安全
            * `ConcurrentHashMap`
                * Leader节点记录每个Follower节点的下一个日志索引和已提交日志索引
        * 日志压缩
            * 日志压缩的目的：减少日志存储空间，提高日志复制效率
            * 日志压缩的方式：快照（Snapshot）
                * 快照的核心信息
                    * 最后日志索引
                    * 最后日志任期
                    * 状态机数据
                    * 快照策略（SnapshotStrategy）
                    * 快照版本
                * 使用策略模式实现了不同的快照策略
                    * 基于日志条数的快照策略（1000条）
                    * 基于时间的快照策略（每隔7天）
                    * 基于日志大小的快照策略（1G）
        * 为什么用RocksDB
            * RocksDB是一个高性能的键值存储数据库
            * 底层使用了LSM树（Log-Structured Merge Tree）数据结构
                * LSM树的核心思想是将写操作先写入内存中的MemTable，然后定期将MemTable中的数据合并到磁盘上的SSTable中
                * 用顺序写入代替随机写入（SkipList 快表），减少磁盘寻址时间，适合写入密集型场景(频繁追加日志的分布式系统)
                * 采用分层存储：热数据在内存中，冷数据在磁盘上
                * 支持压缩和合并操作，减少存储空间
        * 项目的RPC框架
            * 项目基于阿里巴巴开源的`SOFT-Bolt`框架构建，底层使用``Netty``作为网络传输层，整个框架的设计思路是提供一个高性能、低延时的
            分布式通信解决方案。
            * 从架构上看，我们采用了经典的分层设计模式，为客户端和服务端分别封装了接口，通过`Request`和`Response`这两个统一的消息格式来进行
            数据交换
            * 在具体实现上，我们定义了几种核心的请求类型，比如选举投票、日志复制、客户端请求、成员变更等，每种请求类型都有对应的处理器，
            服务端会根据请求类型分发到不同的业务逻辑处理器上。
            * 在性能方面，首先Netty本身就是一个高性能的网络框架，它的事件驱动模型和零拷贝技术大大提升了网络传输效率。我们使用了连接池来复用连接，
            避免频繁建立连接的开销。序列化这块我们主要使用``Hessian``，它在性能和兼容性之间取得了很好的平衡。
            * 在实际使用中，这个RPC框架支撑了整个Raft集群的通信。比如Leader选举时，候选人会向其他节点发送投票请求；日志复制时，Leader会向Follower发送追加日志请求；客户端操作时，会通过RPC调用Leader节点。所有这些通信都通过这个统一的RPC框架来完成。
            
* **25.07.30**
    * TCP/IP
        * HTTP 1.1
            * 长连接：Connection: keep-alive
            * 断点重传：
                * 客户端：`Range`
                * 服务端：`Content-Range`,`Accept-Ranges`,`Content-Length`
        * TLS/SSL
            * 四次握手
                * 客户端发起`ClientHello`请求，发送TLS版本、加密套件、第一个随机数等信息
                * 服务端响应`ServerHello`，发送证书、加密套件、第二个随机数等信息
                * 客户端验证证书后，发送`ClientKeyExchange`，用公钥加密生成的第三个随机数，并生成摘要发送给服务器，表示客户端握手结束
                * 服务端收到后，解密第三个随机数，，获得会话密钥，生成摘要并发送给客户端，表示服务端握手结束
            * 非对称加密算法: RSA、ECC
            * 对称加密算法: AES、DES
            * 哈希算法: SHA-256、SHA-512，MD5（不安全）
        * HTTP 2.0
            * 二进制分帧：将请求和响应分成多个二进制帧进行传输
            * 多路复用：引入了Stream概念，在一个TCP连接上同时发送多个请求和响应，避免了HTTP 1.1的队头阻塞问题
                * 服务器可以乱序返回，浏览器再按ID组装
            * 头部压缩：使用HPACK算法对请求和响应头进行压缩，减少传输数据量
            * 服务端推送：服务端可以主动向客户端推送资源，减少客户端的请求次数
        * HTTP 3.0
            * 基于QUIC协议，放弃了TCP，基于UDP实现的可靠传输协议
            * 在UDP上实现了多路复用，丢包重传，拥塞控制等功能，彻底解决应用层+传输层（TCP按序交付）的队头阻塞问题
        * JWT
            * JSON Web Token（JWT）是一种开放标准（RFC 7519），用于在网络应用环境间以JSON对象的形式安全地传递信息
            * JWT由三部分组成：头部（Header）、载荷（Payload）、签名（Signature）
            * JWT可以解决集群部署的问题（单点登录）
                * JWT是无状态的，服务端不需要存储会话信息
            * JWT缺点:没办法及时撤销
                * 解决办法：使用短期有效的JWT和刷新令牌（Refresh Token）或者使用黑名单机制
        * TCP为什么三次握手
            * 避免历史连接，造成资源混乱和浪费
        * TCP四次挥手为什么要等待2MSL
            * MSL是指TCP连接的最大报文段生命周期，确保所有数据包都能被正确接收和处理
            * 如果不等待2MSL，可能会导致数据包丢失或重复，影响连接的可靠性
* **25.07.31**
    * Jgit项目
        * JGit核心概念
            * JGit是一个纯Java实现的Git版本控制系统库
            * Git对象模型
                * Git对象分为四种类型：Blob（文件内容），Tree（目录结构），Commit（提交记录），Tag（标签）
                * 每个Git对象都有一个唯一的SHA-1哈希值作为标识
            * Ref(引用)
                * HEAD：当前分支的引用
                * 分支引用
                * 标签引用
                * 远程引用
            * 实现功能
                * 创建和管理Git仓库
                * 提交和回滚版本
                * 分支管理：获取分支和标签信息
                * 差异比较：比较两个提交之间的差异
                * 文件操作：读取和写入文件内容
                * 远程操作：克隆、推送、拉取等
                * 权限控制：结合Gitolite实现权限控制
        * Gitolite
            * Gitolite是一个基于SSH的Git服务器管理工具，可以实现细粒度的Git仓库权限控制
                * 仓库级别的权限控制
                * 分支级别的权限控制
                * 用户组和仓库组管理
            * 项目配置结构
                * ![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202507312030693.png)
            * 项目中的Gitolite集成
                * 当创建新用户/仓库/协作者时，系统会自动在Gitolite中创建配置
                * 所有Git操作都通过Gitolite进行权限验证
                * 所有Gitolite操作都是事务性的，失败会回滚
        * 为什么项目使用PostgreSQL，而不是MySQL
            * PostgreSQL是一个功能强大的关系型数据库，支持复杂查询和事务处理
            * 对象关系映射（ORM）支持更好，支持自定义符合数据类型
            * PostgreSQL的ACID特性和MVCC（多版本并发控制）使其在高并发场景下表现更好
            * 在复杂查询和大数据量处理方面，PostgreSQL的性能通常优于MySQL
* **25.08.01**
    * 代码随想录
        * [组合计数](https://leetcode.cn/problems/combination-sum-iv/description/)
            * 先遍历数组则为完全背包问题（不考虑顺序）
            * 先遍历目标值就是组合问题（考虑顺序）
    * Maven的依赖管理，如果出现了A依赖B和C，然后C依赖B会怎么样
        * 当A依赖B和C，而C又依赖B时，Maven会通过依赖传递机制来处理这种情况。具体来说，Maven会构建一个依赖树，然后根据一些规则来决定最终使用哪个版本的B。
首先，Maven会按照"最近优先"的原则来处理。在这个场景中，A直接依赖B，而C也依赖B，那么A到B的路径是A→B，A到C到B的路径是A→C→B。显然A→B的路径更短，所以Maven会优先选择A直接依赖的B版本。
        * 但是实际情况可能更复杂一些。比如如果A依赖B的1.0版本，C依赖B的2.0版本，这时候Maven会通过依赖调解机制来解决冲突。Maven有几种调解策略，默认是"第一声明优先"，也就是在pom.xml中先声明的依赖会优先。
        * 我们项目中就遇到过类似的情况。比如我们的common模块依赖了hessian，client模块也依赖了hessian，同时client还依赖了common模块。
        这时候Maven会确保整个项目使用同一个hessian版本，避免类加载冲突。
        * 另外，Maven的dependencyManagement也是一个很重要的机制。在父pom中定义版本号，子模块就可以直接引用而不需要指定版本，
        这样就能统一管理依赖版本，避免版本冲突。
        * 总的来说，Maven的依赖管理机制是通过依赖树、依赖传递、依赖调解和dependencyManagement等多种方式来确保项目中依赖的正确性和一致性。
    * 访问www.baidu.com的时候用到什么缓存
        * 浏览器缓存：通过`Cache-control`头控制缓存静态资源
        * DNS缓存：浏览器会缓存域名解析结果，减少DNS查询次数
        * CDN缓存：如果使用了CDN加速，CDN会缓存静态资源，减少源站压力
        * 服务端缓存：如果服务端配置了缓存策略，可能会缓存动态内容
        * 数据库缓存：如果访问的内容涉及数据库查询，可能会使用Redis、Memcached等缓存热点数据，比如热搜词、用户信息等
        * HTTP缓存：浏览器会缓存HTTP响应头中的`ETag`和`Last-Modified`，用于条件请求，减少不必要的数据传输
    * ``Redis``：String和Hash的区别，为什么购物车不用String
        * 从存储结构来看，``String``是简单的``key-value``结构，而``Hash``是``key-field-value``的三层结构。比如存储用户信息，
        用String的话可能是"user:1"对应一个JSON字符串，而用Hash的话是"user:1"下面有多个field，比如"name"、"age"、"email"等。
        * 购物车不用String而选择Hash，主要有几个原因。
            * 第一个是部分更新效率。购物车经常需要添加商品、修改数量、删除商品等操作。如果用String存储，每次修改都需要序列化整个购物车数据，
            然后重新写入。而用Hash的话，可以只更新某个商品的字段，比如"cart:user123"下面的"product:456"字段，这样效率就高很多。
            * 第二个是内存使用效率。Hash在存储小对象时比String更节省内存。因为String存储JSON时会有很多重复的字段名，而Hash的field名是共享的，
            不会重复存储。比如购物车有100个商品，用String存储会有100个"price"、"quantity"这样的字段名，而Hash只需要存储一次。
            * 第三个是原子性操作。Hash提供了很多原子操作，比如HINCRBY可以原子地增加某个商品的数量，HGETALL可以原子地获取整个购物车。
            如果用String的话，需要先读取、修改、再写入，这个过程中可能会有并发问题。
            * 第四个是查询效率。购物车经常需要查询某个商品的信息，用Hash可以直接用HGET获取特定商品，而用String需要先GET整个字符串，
            然后解析JSON，再找到对应的商品，效率明显低很多。
    * `Redis`：为什么哈希槽为16384
        * CRC16算法产生的哈希值是16bit的，最大可以产生65536个哈希值
        * redis节点发送心跳包需要包含哈希槽信息，使用16bit的哈希值会导致心跳包过大，所以为了节省内存网络开销，redis将哈希槽数量限制为16384
        * 哈希槽如果太小，会导致哈希冲突严重
    * `Redis`: cluster集群如果实例上没有相应的数据会怎样杨
        * Moved重定向：哈希槽计算重新转移到其他节点
        * Ask重定向：发生数据迁移时吗，重定向
