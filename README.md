
# 目录
<!-- vim-markdown-toc GFM -->

* [Java SE](#java-se)
* [JavaWeb](#javaweb)
* [剑指Offer75](#剑指offer75)
* [苍穹外卖](#苍穹外卖)
* [黑马商城（SpringCloud微服务）](#黑马商城springcloud微服务)
    * [具体学习时间](#具体学习时间)
* [代码随想录](#代码随想录)
    * [具体学习时间](#具体学习时间-1)
* [JAVA虚拟机](#java虚拟机)
    * [具体学习时间](#具体学习时间-2)
* [黑马商城（SpringCloud微服务）](#黑马商城springcloud微服务-1)
    * [具体学习时间](#具体学习时间-3)

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

## 黑马商城（SpringCloud微服务）
* **25.01.16** ~ **至今**
* [整理资料](https://github.com/luckygalaxy666/JavaProjects/blob/master/SpringCloud.md)




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
* **24.12.31** ~ 至今

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
    * **重点** 二叉树 -- 24 二叉树的最近公共祖先（递归判断左右子树是否包含p或q，如果包含则返回当前节点，否则返回null
   * **重点** 二叉树 -- 30 删除二叉搜索树的节点（递归删除左右子树，如果当前节点等于val，分情况讨论 **利用有返回的递归**）

* **25.01.14** 回溯算法 -- 1 ~ 10
    * **重点** 回溯算法 -- 1 8 组合总和Ⅱ（排序 + 使用used 判断上一个数用没用过 如果没用过但是值相同直接跳过）

* **25.01.15** 回溯算法 -- 11 ~ 21
    * **重点** 回溯算法 -- 14 递增子序列（层级递归）
    * **重点** 回溯算法 -- 19 重新安排行程（递归+ 栈的思想）

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

## JAVA虚拟机
* **25.01.09** ~ 至今

### 具体学习时间

* **25.01.09** 第二章 -- Java内存区域与内存溢出异常
* **25.01.13 ~ 25.01.15** 第三章 -- 垃圾收集器与内存分配策略

## 黑马商城（SpringCloud微服务）

* **25.01.16** ~  至今

### 具体学习时间

* **25.01.16 ~ 25.01.17** MybatisPlus
* **25.01.21** Docker
* **25.01.22 ~ 25.01.23** 微服务(Nocus OpenFeign)
* **25.01.24** 微服务(登录校验) **重点复习**
* **25.01.25 ~ 25 01.26** 微服务保护与分布式管理
* **25.01.27** MQ消息队列基础
    * **重点** 利用`MessageConverter`将消息转换为jsn格式，并利用重写`fromMessage`和`toMessage`方法在请求头传递和解析用户Id，实现类似于拦截器的功能
* **25.01.31** MQ消息队列高级 (代码实现没有细看和操作)
    
