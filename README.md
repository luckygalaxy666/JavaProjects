
# 目录

<!-- vim-markdown-toc GFM -->

* [override  重写](#override--重写)
* [interface 接口](#interface-接口)
* [面向接口编程](#面向接口编程)
* [template 模板设计模式](#template-模板设计模式)
* [super 与 this 关键字](#super-与-this-关键字)
* [SingleStance 单例模式](#singlestance-单例模式)
* [clone 浅拷贝与深拷贝 重写clone方法](#clone-浅拷贝与深拷贝-重写clone方法)
* [equals 与 toString  Object方法 重写](#equals-与-tostring--object方法-重写)
* [stringBuilder 与 stringJoiner](#stringbuilder-与-stringjoiner)
* [packing_class 包装类](#packing_class-包装类)
* [Runtime 与操作系统交互 代表单个JVM进程](#runtime-与操作系统交互-代表单个jvm进程)
* [BigDecimal 用于高精度计算](#bigdecimal-用于高精度计算)
* [Date 测试日期类](#date-测试日期类)
* [Calendar 日历类](#calendar-日历类)
* [LocalDate 年月日时间](#localdate-年月日时间)
* [LocalTime 时分秒时间](#localtime-时分秒时间)
* [LocalDateTime 年月日时分秒时间](#localdatetime-年月日时分秒时间)
* [ZoneID 时区](#zoneid-时区)
* [ZonedDateTime 时区日期时间](#zoneddatetime-时区日期时间)
* [Instant 时间戳](#instant-时间戳)
* [DateTimeFormatter 格式化时间](#datetimeformatter-格式化时间)
* [Period 日期间隔](#period-日期间隔)
* [Duration 时间间隔](#duration-时间间隔)
* [Arrays 数组工具类](#arrays-数组工具类)
    * [Arrays 重写sort方法](#arrays-重写sort方法)
* [lambda表达式](#lambda表达式)
* [方法引用](#方法引用)
    * [静态方法的方法引用](#静态方法的方法引用)
    * [实例方法的方法引用](#实例方法的方法引用)
    * [特定类型的方法引用](#特定类型的方法引用)
    * [构造器的方法引用](#构造器的方法引用)
* [Regex 正则表达式](#regex-正则表达式)
* [Exception 异常](#exception-异常)
    * [自定义异常](#自定义异常)
    * [捕获异常后处理方式](#捕获异常后处理方式)
* [Collection 集合](#collection-集合)
    * [List 集合](#list-集合)
    * [Set 集合](#set-集合)
        * [HashSet](#hashset)
            * [**红黑树**](#红黑树)
        * [LinkedHashSet](#linkedhashset)
        * [TreeSet](#treeset)
    * [并发修改异常](#并发修改异常)
* [Collections 集合工具类](#collections-集合工具类)
* [Map 集合](#map-集合)
    * [map遍历](#map遍历)
    * [HashMap](#hashmap)
    * [LinkedHashMap 与 TreeMap](#linkedhashmap-与-treemap)
* [Stream 流](#stream-流)
    * [Stream流的创建](#stream流的创建)
    * [**Stream流的常用方法：**](#stream流的常用方法)
    * [**collect方法的使用**](#collect方法的使用)
    * [**toArray方法的使用**](#toarray方法的使用)
* [File 文件](#file-文件)
* [IO 流](#io-流)
    * [try-catch-finally](#try-catch-finally)
    * [try-with-resources](#try-with-resources)
    * [字符流](#字符流)
    * [字节缓冲输入输出流](#字节缓冲输入输出流)
    * [字符缓冲输入输出流](#字符缓冲输入输出流)
    * [字符输入输出转换流](#字符输入输出转换流)
    * [打印流](#打印流)
        * [输出语句重定向](#输出语句重定向)
    * [数据流](#数据流)
    * [对象流](#对象流)
* [Common-IO](#common-io)
    * [FileUtils](#fileutils)
    * [IOUtils](#ioutils)
* [Properties](#properties)
* [dom4j 解析XMl工具](#dom4j-解析xml工具)
    * [**Documents**提供的方法：](#documents提供的方法)
    * [**Element**提供的方法：](#element提供的方法)
* [日志](#日志)
    * [Logback 日志框架](#logback-日志框架)
* [多线程](#多线程)
    * [第一种方式 继承Thread类](#第一种方式-继承thread类)
    * [第二种方式 实现Runnable接口](#第二种方式-实现runnable接口)
    * [第三种方式 实现Callable接口](#第三种方式-实现callable接口)
    * [Thread 类的常用方法](#thread-类的常用方法)
    * [线程安全问题](#线程安全问题)
        * [同步化方法](#同步化方法)
        * [同步化代码块](#同步化代码块)
        * [lock 锁](#lock-锁)
    * [线程通信](#线程通信)
* [线程池](#线程池)
    * [ThreadPoolExecutor 构造器](#threadpoolexecutor-构造器)
    * [ExecutorSerive 线程池的常用方法](#executorserive-线程池的常用方法)
* [并发 并行](#并发-并行)
* [线程的生命周期](#线程的生命周期)
    * [线程的6种状态相互转换](#线程的6种状态相互转换)
* [乐观锁 线程安全且并行](#乐观锁-线程安全且并行)
* [网络通信](#网络通信)
    * [InetAddress 类](#inetaddress-类)
    * [UDP 与 TCP](#udp-与-tcp)
    * [**UDP 通信**](#udp-通信)
    * [Tcp 通信](#tcp-通信)
        * [**一对一 多发多收 TCP 通信**](#一对一-多发多收-tcp-通信)
        * [**多对一 多发多收 TCP 通信**](#多对一-多发多收-tcp-通信)
        * [**多对多（群聊） 多发多收 TCP 通信**](#多对多群聊-多发多收-tcp-通信)
        * [BS 通信](#bs-通信)
* [Junit 单元测试](#junit-单元测试)
    * [Junit 常用注解](#junit-常用注解)
    * [Junit 常用断言方法](#junit-常用断言方法)
* [反射](#反射)
    * [Class 类](#class-类)
    * [**获取Class对象的方式：**](#获取class对象的方式)
    * [**反射获取构造器对象并使用**](#反射获取构造器对象并使用)
    * [**反射获取方法对象并使用**](#反射获取方法对象并使用)
    * [**反射获取属性对象并使用**](#反射获取属性对象并使用)
    * [反射应用 ： 框架 获取对象的所有成员变量写入文件](#反射应用--框架-获取对象的所有成员变量写入文件)
* [注解](#注解)
    * [**自定义注解**](#自定义注解)
    * [**元注解**](#元注解)
    * [**解析注解**](#解析注解)
    * [**注解的应用**](#注解的应用)
* [动态代理](#动态代理)

<!-- vim-markdown-toc -->

## override  重写

* **重写：**
    * 重写是指子类对父类的方法进行重新实现
    * 重写的方法名、参数列表、返回值类型必顿要与父类的方法一致
    * 重写的方法不能比父类的方法权限更低
    * 重写的方法不能比父类的方法抛出更多的异常
    
利用@Override注解可以检查是否重写成功

**重写toString 方法** IDEA 可以使用ALt + Insert 选择toString方法 自动生成重载方法 ## 多态
* **多态：**
    * **多态是指同一个方法调用，由于对象不同可能会有不同的行为**
    * **多态的前提：**
        * 要有继承
        * 要有重写
        * 要有父类引用指向子类对象
    * **多态的好处：**
        * 提高了程序的扩展性
        * 提高了程序的维护性
    * **多态的弊端：**
        * 不能使用子类的**特有属性和方法**
        * 多态的向上转型是安全的，向下转型是不安全的
    * **多态的应用场景：**
        * 方法的形参是父类类型，实参是子类类型
        * 方法的返回类型是父类类型，实际返回子类类型
        * 父类的引用指向子类的对象

**示例：**

* People 是父类
* Student 和 Teacher 是子类 重写了父类People的run方法
* Student 特有的方法是study
* Teacher 特有的方法是teach

**People 类**


```Java
public class People {

    public void run() {
        System.out.println("People run");
    }
}
```


**Student 类**
```Java
public class Student extends People {
    @Override
    public void run() {
        System.out.println("Student run");
    }
    public void study() {
        System.out.println("Student study");
    }
}
```

**Teacher 类**

```Java
public class Teacher extends  People{
    @Override
    public void run()
    {
        System.out.println("Teacher run");
    }
    public void teach()
    {
        System.out.println("Teacher teach");
    }
}
```

**Test 类**
```Java

        distinctiveMethod(p1);
    }
    // 父类类型作为形参
    // 强转为子类类型 调用子类特有方法
    public static void distinctiveMethod(People p) {
        // 公共方法 可以直接调用
        p.run();
        // 子类特有方法 不能直接调用
        // p.study();
        if (p instanceof Student) {
            Student s1 = (Student) p;
            s1.study();
        } else if (p instanceof Teacher) {
            Teacher t1 = (Teacher) p;
            t1.teach();
        }
    }

}
```
## interface 接口

* **接口：**
    * 接口是一种规范，是一种特殊的抽象类，是抽象方法和常量值的集合
    * 接口是一种引用数据类型，编译后也是生成.class文件
    * 接口是完全抽象的，不能有构造方法，不能有普通方法
    * 接口的定义格式：
        * public interface 接口名 {}
    * 接口的实现：
        * 类实现接口：class 类名 implements 接口名 {}
        * 接口继承接口：interface 接口名 extends 接口名 {}
    * 接口的特点：
        * 接口中只有常量和抽象方法
        * 接口中的方法都是public abstract
        * 接口中的属性都是public static final
        * 接口不能实例化
        * 类与接口之间是实现关系，**一个类可以实现多个接口**
        * 接口与接口之间是继承关系，**一个接口可以继承多个接口**
    * 接口的实现：
        * **类实现接口，需要重写接口中的所有抽象方法**
    * 接口的应用场景：
        * 一个类可以实现多个接口
        * 一个类可以继承一个类的同时实现多个接口
        * 接口可以继承多个接口

**示例：**

**接口B**


```Java
public interface B {
    // 接口中的变量 默认是常量
    // String name ;
    String name =  "liu";
    // 接口中的方法 默认是抽象方法
    //void show1(){}; // 报错
    void show();
}

```

**接口C**

```Java
public interface C {
    void showC();
}
```

**实现类A**
```Java
public class A implements B,C{

    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void showC() {
        System.out.println("showC");
    }

    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.showC();
    }
}
```
## 面向接口编程

* **一个接口可以有多个实现类**
* **灵活切换实现类定义对象，使用该对象的方法以实现相似功能**
* **接口可以定义多个实现类的共同方法，实现类可以根据自己的需求重写接口的方法**

**示例：**

* 接口A 有两个实现类 Almpl1 和 Almpl2
* Almpl1 和 Almpl2 都实现了接口A的方法
* Almpl1 输出学生信息和平均分
* Almpl2 输出学生信息和男女生数量和去掉最高分和最低分的平均分

**接口A**


```Java
public interface A {
    void printInfo(ArrayList<Student> students); // 打印学生信息
    void printAverageScore(ArrayList<Student> students); // 打印学生平均分
}
```

**Almpl1 类**



```Java
public class AImpl1 implements A {
    @Override
    public void printInfo(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double sum = 0.0;
        for (Student student : students) {
            sum += student.getScore();
        }
        System.out.println("Average score: " + sum / students.size());
    }

}
```

**Almpl2 类**



```Java
public class AImpl2 implements A {
    @Override
    public void printInfo(ArrayList<Student> students) {
        int malecount = 0;
        int femalecount = 0;
        for (Student student : students) {
            System.out.println(student);
            if (student.getSex() == '男')
                malecount++;
            else
                femalecount++;

        }
        System.out.println("男生数量：" + malecount);
        System.out.println("女生数量：" + femalecount);;
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double sum = 0;
        int minScore = students.get(0).getScore();
        int maxScore = students.get(0).getScore();
        for (Student student : students) {
            sum += student.getScore();
            if (student.getScore() < minScore)
                minScore = student.getScore();
            if (student.getScore() > maxScore)
                maxScore = student.getScore();
        }
        System.out.println("Average score: " +(sum - minScore - maxScore) / (students.size() -2));

    }
}
```

**Test**


```Java
public class Test {
    public static void main(String[] args) {
        School school = new School();
        school.changeMethod(1);
        System.out.println("方案1");
        school.printInfo();
        school.printAverageScore();

        school.changeMethod(2);
        System.out.println("方案2");
        school.printInfo();
        school.printAverageScore();
    }
}
```

## template 模板设计模式

* **模板设计模式：**
    * 模板设计模式是一种行为设计模式，**它定义了一个算法的骨架，而将一些步骤延迟到子类中实现**
    * 模板设计模式使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
    * 模板设计模式是通过把不变行为搬移到超类，去除子类中的重复代码，从而体现了代码的复用性
* **模板设计模式的实现方式：**
    * 定义一个抽象类，抽象类中定义一个模板方法，模板方法中定义了算法的骨架
    * 模板方法中调用了一些抽象方法，这些抽象方法由子类实现
    * 子类继承抽象类，实现抽象方法，从而实现了算法的某些特定步骤
* **模板设计模式的优点：**
    * 提高代码的复用性
    * 提高代码的扩展性
    * 符合开闭原则
* **模板设计模式的缺点：**
    * 增加了代码的阅读难度
    * 增加了代码的复杂度

**示例：**

* People类是抽象类 定义了模板方法``write`` 以及抽象方法`writeMain`
* Student 和 Teacher 是People的子类 重写了`writeMain`方法

**People 类**


```Java
public abstract class People {
    // 把模板写成final  防止被重写
    public final void write()
    {
        System.out.println("People write start");
        System.out.println(writeMain());
        System.out.println("People write end");
    }
    // 抽象方法不能有方法体  由子类重写实现
    public abstract String writeMain();
}
```

**Student 类**


```Java
public class Student extends People {
    @Override
    public String writeMain()
    {
        return "Student write main";
    }
}
```

**Teacher 类**


```Java
public class Student extends People {
    @Override
    public String writeMain()
    {
        return "Student write main";
    }
}
```

**Test**


```Java
public class Test {
    public static void main(String[] args) {
        // 抽象类不能实例化 只能作为父类被继承
        // People people = new People();
        People p1 = new Student();
        People p2 = new Teacher();
        // 把write（） 写成模板设计模式 节省代码量
        p1.write();
        System.out.println("------------");
        p2.write();
    }
}
```




## super 与 this 关键字

* **super关键字：**
    * super关键字是一个引用变量，它可以用来引用父类的成员变量和成员方法
    * super关键字的用法：
        * **调用父类的属性：**
            * super.父类属性
        * **调用父类的方法：**
            * super.父类方法
        * **调用父类的构造方法：**
            * super(参数列表)
* **this关键字：**
    * this关键字是一个引用变量，它可以用来引用本类的成员变量和成员方法
    * this关键字的用法：
        * **调用本类的属性：**
            * this.本类属性
        * **调用本类的方法：**
            * this.本类方法
        * **调用本类的构造方法：**
            * this(参数列表)

** this 和 super 都必须在构造方法的第一行 并且不能同时出现 **

**示例：**

* Student 是 People 的子类
* Student 通过super(name,age) 调用父类People的有参构造方法

**可以将super就当做父类Person的引用**

**People 类**
```Java
    private String name;
    private int age;
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

```

**Student 类**
```Java
class Student extends People {
    private String school;

    public Student(String name)
    {
        this(name,18,"UESTC");
    }
    public Student(String name, int age,String school)
    {
        // 调用父类构造方法 this 和 super 都必须在第一行 同时只能存在一个
        super(name, age);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", school='" + school + '\'' +
                '}';
    }
}
```

**Test**
```Java
public class TestSuper {
    public static void main(String[] args) {
        // 继承父类构造
        Student student1 = new Student("liu", 18, "school");
        //调用兄弟构造和父类构造
        Student student2 = new Student("liu");
        System.out.println(student1);
        System.out.println(student2);
    }
}

```


## SingleStance 单例模式

* **单例模式：**
    * 单例模式是一种常用的设计模式，保证一个类仅有一个实例，并提供一个访问它的全局访问点
    * 单例模式的实现方式：
        * **饿汉式：**
            * **在类加载的时候就创建对象，线程安全
            * **缺点：如果类加载后，对象没有被使用，会造成内存浪费
        * **懒汉式：**
            * 在类加载的时候不创建对象，当需要使用时才创建对象，线程不安全
            * 缺点：多线程环境下，可能会创建多个对象

**饿汉式**
```Java
/**
 饿汉式单例模式   --- 避免浪费内存  适合变量多次用到
 取对象时，对象早就创建好了
 */
public class A {
    //2. 定义一个类变量记住类的一个对象
    private static A a = new A();

    //1. 必须私有类的构造器
    private A()
    {

    }
    // 3. 定义一个类方法返回类的对象
    public static A getObject()
    {
        return a;
    }
}

```

**懒汉式**

```Java
/**
 懒汉式单例模式  -- 适合变量少量用到
 拿对象时，才开始创建对象
 */
public class B {

    //2. 定义一个类变量用于存储对象
    private static B b;
    //1. 将类的构造器私有化
    private B()
    {

    }
    //3. 提供一个静态方法，用于返回类的同一个对象
    public static B getObject()
    {
        if (b == null)
        {
            System.out.println("创建对象成功~~~");
            b = new B();
        }
        return b;
    }
}
```

**Test**


```Java
public class Test {
    public static void main(String[] args) {
        A a1 = A.getObject();
        A a2 = A.getObject();

        System.out.println(a1);
        System.out.println(a2);
        // 地址一样 说明是同一个对象

        B b1 = B.getObject();
        B b2 = B.getObject();
        System.out.println(b1);
        System.out.println(b2);
    }
}

```



## clone 浅拷贝与深拷贝 重写clone方法

* **重写clone 需要类实现Cloneable接口 **
* **浅拷贝：**
    * 浅拷贝是指在拷贝对象时，只拷贝对象本身和对象中的基本数据类型的属性，而不拷贝对象中的引用类型的属性
    * 浅拷贝只是拷贝了对象的引用，而没有拷贝对象的内容
* **深拷贝：**
    * 深拷贝是指在拷贝对象时，不仅拷贝对象本身和对象中的基本数据类型的属性，还要拷贝对象中的引用类型的属性
    * 深拷贝是完全拷贝了对象的内容

**无论是浅拷贝还是深拷贝 对象地址都是不同的**

**User 类**
```Java
// 使用clone 需要类实现Cloneable接口
public class User implements Cloneable {
    private String name;
    private int age;
    private double[] score;
    private String mode = "shallow";

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    // 重写clone方法
    // 因为clone方法是protected的，所以需要重写
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅拷贝
        if (mode.equals("shallow")) {
            return super.clone();
        }
        else { // 深拷贝
            User user = (User) super.clone();
            // 将引用类型再拷贝一次
            user.score = this.score.clone();
            return user;
        }
    }

    public double[] getScore() {
        return score;
    }

    public void setScore(double[] score) {
        this.score = score;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", score=" + Arrays.toString(score) +
//                '}';
//    }

    public User(String name, int age, double[] score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
```

**Test 类**
```Java
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("liu", 18,new double[]{1.0,2.0});
        // 使用clone时 要实现Cloneable接口
        // 浅拷贝
        User user1 = (User) user.clone();
        System.out.println(user);
        System.out.println(user1);
        // 比较两个对象的地址
        // 浅拷贝时两个对象的引用类型的地址是一样的
        System.out.println(user.getScore());
        System.out.println(user1.getScore());
        user.setMode("deep");
        // 深拷贝
        User user2 = (User) user.clone();
        System.out.println(user);
        System.out.println(user2);
        // 比较两个对象的地址
        // 深拷贝时两个对象的引用类型的地址是不一样的
        System.out.println(user.getScore());
        System.out.println(user2.getScore());

        // 无论是浅拷贝还是深拷贝，都是在堆内存中开辟新的空间，所以两个对象的地址是不一样的

        char a= '0';
        String s = "0";
        System.out.println((char)(a+1));
        System.out.println(s + 1);

    }
}

```

## equals 与 toString  Object方法 重写

* **equals方法：**
    * **equals方法是Object类的方法，所有类都继承了Object类，所以所有类都有equals方法**
    * **equals方法的作用是用来比较两个对象是否相等**
    * **equals方法默认比较的是两个对象的内存地址，即比较的是两个对象是否是同一个对象**
    * **equals方法可以根据自己的需求进行重写，一般重写equals方法时，会比较两个对象的属性值是否相等**
    * **equals方法的重写一般需要重写hashCode方法**
* **toString方法：**
    * **toString方法是Object类的方法，所有类都继承了Object类，所以所有类都有toString方法**
    * **toString方法的作用是返回对象的字符串表示形式**
    * **toString方法默认返回的是对象的内存地址，即类名@对象的内存地址**
    * **toString方法可以根据自己的需求进行重写，一般重写toString方法时，会返回对象的属性值**
    * **toString方法的重写一般用于输出对象的属性值**

**Student 类**
```Java
public class Student {
    public String getName() {
        return name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // 1. 判断是否是同一个对象
        if (this == o) return true;
        // 2. 判断是否是同一个类
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        // 3. 判断属性是否相等
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name ;
    private int  age;
}
```

**Test 主类**
```Java  
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("liu", 18);
        Student stu2 = new Student("liu", 18);
        Student stu3 = new Student("zhang", 19);

        // equals 默认是比较地址值
        // 主要作用：
        // 重写equals方法后，比较的是对象的属性值
        System.out.println(stu1.equals(stu2));
        System.out.println(stu1.equals(stu3));

        // toString 默认是返回地址值
        // 主要作用：
        // 重写toString方法后，返回对象的属性值
        System.out.println(stu1);
    }
}
```
## stringBuilder 与 stringJoiner

* **StringBuilder类的常用方法：**
    * public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身
    * public String toString()：将StringBuilder对象转换为String对象
    * public StringBuilder reverse()：将StringBuilder对象逆序
* **StringJoiner类的常用方法：**
    * public StringJoiner add(String str)：添加一个字符串
    * public StringJoiner merge(StringJoiner other)：合并另一个StringJoiner对象
    * public String toString()：返回拼接好的字符串



```Java
public class Test {
    public static void main(String[] args) {
        // StringBuilder
        // StringBuilder是可变的字符序列，可以对字符串进行修改
        // StringBuilder是线程不安全的，效率高
        // StringBuilder是JDK1.5之后出现的，用于替代StringBuffer
        // StringBuilder的方法和StringBuffer的方法基本一样
        // StringBuilder可以对任意类型进行append操作  而StringJoiner 只能对字符串进行操作

        int[] arr = {1,2,3,4,5};
        System.out.println(getStrByBuilder(arr));
        System.out.println(getStrByJoiner(arr));
    }
    static String getStrByBuilder(int[] arr){
        if (arr == null || arr.length == 0){
            return "";
        }
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]);
            if (i != arr.length - 1){
                str.append(",");
            }
        }
        str.append("]");
        return str.toString();
    }

    static String getStrByJoiner(int[] arr){
        if (arr == null || arr.length == 0){
            return "";
        }
        // StringJoiner的三个参数分别是：分隔符，前缀，后缀
        StringJoiner str = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            // StringJoiner只能对字符串进行操作
            str.add(String.valueOf(arr[i]));
        }
        return str.toString();
    }
}
```

## packing_class 包装类

* **包装类的作用：**
    * 将基本数据类型封装为对象
    * 在对象中定义了属性和方法操作基本数据类型
    * 使得基本数据类型具有了对象的特征

* **包装类的分类：**
    * **整数型包装类：**
        * Byte
        * Short
        * Integer  
        * Long
    * **浮点型包装类：**
        * Float
        * Double
    * **字符型包装类：**
        * Character
    * **布尔型包装类：**
        * Boolean

* **包装类的常用方法：**
    * **基本数据类型与字符串之间的转换：**
        * **基本数据类型转换为字符串：**
            * public static String toString(int i)
            * public static String valueOf(int i)
        * **字符串转换为基本数据类型：**
            * public static int parseInt(String s)  // 字符串转int
            * public static Integer valueOf(String s)  // 字符串转Integer



```Java
public class Test {
    public static void main(String[] args) {
        // 基本数据类型与包装类之间可以自动装箱与拆箱
        int  a = 10;
        Integer b = 10;
        int c = b; // 不报错

        // toString 将包装类转换为字符串
        System.out.println(b.toString());
        System.out.println(Integer.toString(b));

        // 将字符串转换成包装类
        String str = "123";
        //paserInt()方法将字符串转换成int类型
        // 不常用
        Integer integer = Integer.parseInt(str);
        System.out.println(integer);
        // valueof()方法将字符串转换成Integer类型
        Integer integer1 = Integer.valueOf(str);
        System.out.println(integer1);

    }

}
```





## Runtime 与操作系统交互 代表单个JVM进程

* **Runtime类代表单个JVM进程，是单例模式**
* **Runtime类的常用方法：**
    * public static Runtime getRuntime()：返回与当前Java应用程序相关的运行时对象
    * public Process exec(String command)：在单独的进程中执行指定的字符串命令
    * public Process exec(String[] cmdarray)：在单独的进程中执行指定的命令和变量
    * public Process exec(String[] cmdarray, String[] envp)：在指定环境的独立进程中执行指定的命令和变量
    * public Process exec(String[] cmdarray, String[] envp, File dir)：在指定环境和工作目录的独立进程中执行指定的命令和变量
    * public int availableProcessors()：返回Java虚拟机可用的处理器数量
    * public long freeMemory()：返回Java虚拟机中的空闲内存量
    * public long totalMemory()：返回Java虚拟机中的内存总量
    * public long maxMemory()：返回Java虚拟机试图使用的最大内存量
    * public void gc()：运行垃圾回收器
    * public void exit(int status)：终止当前运行的Java虚拟机



```Java
public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 单例类 不能创建对象
        Runtime runtime = Runtime.getRuntime(); // 获取Runtime对象
        System.out.println(runtime.availableProcessors()); // 获取处理器数量
        System.out.println(runtime.freeMemory()/1024.0/1024.0 + "MB"); // 获取Java虚拟机空闲内存
        System.out.println(runtime.totalMemory()/1024.0/1024.0 + "MB"); // 获取Java虚拟机总内存

        // 可以执行操作系统命令
        Process p = runtime.exec("D:\\QQNT\\QQ.exe"); // 打开QQ
        Thread.sleep(5000); // 等待5秒
        p.destroy(); // 关闭进程

    }
}
```


## BigDecimal 用于高精度计算

* **BigDecimal类的构造方法：**
    * public BigDecimal(String val)
    * public BigDecimal(double val) // 不推荐使用
    * public BigDecimal(int val) // 不推荐使用
* **BigDecimal类的常用方法：**
    * public BigDecimal add(BigDecimal value)
    * public BigDecimal subtract(BigDecimal value)
    * public BigDecimal multiply(BigDecimal value)
    * public BigDecimal divide(BigDecimal value)
    * public BigDecimal divide(BigDecimal value, int scale, int roundingMode) // scale保留几位小数 roundingMode指定的舍入模式
    * public BigDecimal setScale(int newScale, int roundingMode) // 设置精度，返回新的BigDecimal对象
    * public double doubleValue()
    * public long longValue()
    * public String toString()



```Java
public class Test {
    public static void main(String[] args) {
        Double a = 0.01;
        Double b = 0.05;
        System.out.println(a + b); // 0.060000000000000005

        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        System.out.println(a1.add(b1)); // 0.06
        // BigDecimal的加减乘除方法
        System.out.println(a1.add(b1)); 
        System.out.println(a1.subtract(b1));
        System.out.println(a1.multiply(b1));
        //System.out.println(a1.divide(b1));
        // 除法时，可以指定精度，以及舍入模式  防止不能精确除尽的情况报错
        System.out.println(a1.divide(b1, 2, BigDecimal.ROUND_HALF_UP)); // 0.20 保留两位小数，四舍五入

        // 比较大小
        System.out.println(a1.compareTo(b1)); // -1
        System.out.println(a1.compareTo(a1)); // 0
        System.out.println(b1.compareTo(a1)); // 1

        // 把BigDecimal转换为double
        System.out.println(a1.doubleValue());
    }
}
```



## Date 测试日期类

*SimpleDateFormat类的使用*

* **SimpleDateFormat类是一个以语言环境敏感的方式来格式化和解析日期的类**
* **构造方法:**
    * public SimpleDateFormat()：构造一个SimpleDateFormat，使用默认模式和日期格式
    * public SimpleDateFormat(String pattern)：构造一个SimpleDateFormat，使用给定的模式和默认的日期格式<br>
* **格式化：**
    * public final String format(Date date)：将日期格式化成日期/时间字符串
* **解析：**
    * public Date parse(String source)：从给定字符串的开始解析文本，以生成一个日期 
    * 要求字符串必须是符合SimpleDateFormat识别的格式
* **格式化和解析日期的模式：**
    * y   年
    * M   月
    * d   日
    * H   时
    * m   分
    * s   秒


```Java
public class Test {

    public static void main(String[] args) throws ParseException {
        // 创建Date对象 无参构造 创建当前时间
        Date date = new Date();
        System.out.println(date);

        // 创建Date对象 有参构造 创建指定时间  从1970年1月1日 00:00:00开始计算 有参为毫秒数
        Date date1 = new Date(1000);
        System.out.println(date1);

        // 获取当前时间的毫秒数
        System.out.println(date.getTime());

        // 日期格式化
        // SimpleDateFormat类的使用
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        sdt.format(date);
        System.out.println(sdt.format(date));
        // 字符串转日期
        String str = "2021-08-01 12:12:12";
        System.out.println(sdt.parse(str));
    }

}

```

## Calendar 日历类
    
*Calendar类是一个抽象类，不能直接创建对象使用，里面有一个静态方法getInstance，该方法返回了Calendar类的子类对象*

* **Calendar类中常用的方法：**
    * public int get(int field)：返回给定日历字段的值
    * public void set(int field, int value)：将给定的日历字段设置为给定值
    * public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量
    * public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象
* **Calendar类中的常量：**
    * public static final int YEAR = 1; 年
    * public static final int MONTH = 2; 月
    * public static final int DATE = 5; 月中的某一天
    * public static final int DAY_OF_MONTH = 5; 月中的某一天
    * public static final int HOUR = 10; 时
    * public static final int MINUTE = 12; 分
    * public static final int SECOND = 13; 秒

```Java
/**
 * 测试Calendar类
 * 可变对象
 */
public class Test {
    public static void main(String[] args) {
        //    Calender calender = new Calender();  // 报错，因为Calendar是抽象类，不能实例化
        Calendar  calender = Calendar.getInstance(); // 获取Calendar对象
        System.out.println(calender);
        // Calender 用常量来记录信息
        System.out.println(Calendar.YEAR); // 1
        System.out.println(calender.get(1)); // 年
        System.out.println(calender.get(Calendar.YEAR));
        // 拿到日历中记录的Date对象
        System.out.println(calender.getTime());
        // 修改日历中的时间
        calender.set(Calendar.YEAR, 2022);
        System.out.println(calender.get(Calendar.YEAR));

        // 为某个字段增加值
        calender.add(Calendar.YEAR, 1);
        System.out.println(calender.get(Calendar.YEAR));
        System.out.println(calender.getTime());
    }


}
```

## LocalDate 年月日时间

* **LocalDate类：**
    * **LocalDate类是一个不可变的类，用来表示日期**

**LocalDate类的常用方法：**

| 方法名                                          | 说明 |
| ---                                             | --- |
| public static LocalDate now()                   | 获取当前日期 |
| public int getYear()                            | 获取年份 |
| public int getMonthValue()                      | 获取月份 |
| public int getDayOfMonth()                      | 获取日 |
| public LocalDate getYear()                      | 返回指定年份的日期 |
| public LocalDate plusDays(long daysToAdd)       | 增加天数 |
| public LocalDate minusDays(long daysToSubtract) | 减少天数 |
| public boolean isAfter(LocalDate other)         | 判断日期是否在指定日期之后 |
| public boolean isBefore(LocalDate other)        | 判断日期是否在指定日期之前 |
| public boolean Equals(LocalDate other)          | 判断日期是否在指定日期相等 |

## LocalTime 时分秒时间

* **LocalTime类：**
    * **LocalTime类是一个不可变的类，用来表示时间**

* **LocalTime类的常用方法：**
    * 与LocalDate类的方法类似

| 方法名                                   | 说明 |
| ---                                      | --- |
| public static LocalTime now()            | 获取当前时间 |
| public int getHour()                     | 获取小时 |
| public LocalTime plusMinutes()           | 增加分钟 |
| punlic LocalTime minusMinutes()          | 减少分钟 |
| public boolean isAfter(LocalTime other)  | 判断时间是否在指定时间之后 |
| public boolean isBefore(LocalTime other) | 判断时间是否在指定时间之前 |

## LocalDateTime 年月日时分秒时间

* **LocalDateTime类：**
    * **LocalDateTime类是一个不可变的类，用来表示日期时间**

* **LocalDateTime类的常用方法：**
    * 与LocalDate类和LocalTime类的方法类似

| 方法名                                                   | 说明 |
| ---                                                      | --- |
| public static LocalDateTime now()                        | 获取当前日期时间 |
| public LocalDateTime plusDays(long daysToAdd)            | 增加天数 |
| public LocalDate of(int year, int month, int dayOfMonth) | 返回指定年月日的日期时间 |
| public LocalTime of(int hour, int minute, int second)    | 返回指定时分秒的日期时间 |
| public LocakDateTime of(LocalDate date, LocalTime time)  | 返回指定日期和时间的日期时间 |
| public LocalDate toLocalDate()                           | 返回LocalDate对象 |
| public LocalTime toLocalTime()                           | 返回LocalTime对象 |

* **剩下方法与LocalDate和LocalTime类的方法类似,不一一列举**

## ZoneID 时区

* **ZoneId类：**
    * **ZoneId类是一个不可变的类，用来表示时区**
    * **ZoneId类中定义了很多静态常量，表示不同的时区**

* **ZoneId类的常用方法：**

| 方法名                                   | 说明 |
| ---                                      | --- |
| public static ZoneId of(String zoneId)   | 根据时区ID获取ZoneId对象 |
| public static ZoneId systemDefault()     | 获取系统默认时区 |
| public String getId()                    | 获取时区ID |
| public static Set<String> getAvailableZoneIds() | 获取所有可用的时区ID |

## ZonedDateTime 时区日期时间

* **ZonedDateTime类：**
    * ZonedDateTime类是一个不可变的类，用来表示带时区的日期时间
    * ZonedDateTime类是LocalDateTime类的子类,所以ZonedDateTime类中包含了LocalDateTime类的所有方法

* **ZonedDateTime类的常用方法：**

| 方法名                                                                      | 说明 |
| ---                                                                         | --- |
| public static ZonedDateTime now()                                           | 获取当前日期时间 |
| public static ZonedDateTime now(ZoneId zone)                                | 获取指定时区的当前日期时间 |
| public static ZonedDateTime of(LocalDate date, LocalTime time, ZoneId zone) | 返回指定日期时间时区的 ZonedDateTime对象 |

**示例：**

**Test 类**
```Java
public class Test {
    public static void main(String[] args) {
        // 获取系统默认时区的当前日期时间
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        // 获取指定时区的当前日期时间
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(zoneId);
        System.out.println(zonedDateTime1);

        // 获取世界标准时间
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(zonedDateTime2);

    }
}
```

## Instant 时间戳

* **Instant类：**
    * Instant类是一个不可变的类，用来表示时间戳
    * 时间戳是一个不受时区影响的时间，以Unix元年（传统的设定为UTC时区1970年1月1日午夜时分）开始所经历的秒数来表示
    * 替代Date类 Date类是可变的，线程不安全的

* **Instant类的作用：**
    * Instant类的主要作用是用于代码的性能分析或记录用户的操作时间点，它包含了秒和纳秒

* **Instant类的常用方法：**

| 方法名                                   | 说明 |
| ---                                      | --- |
| public static Instant now()              | 获取当前时间戳 |
| public long getEpochSecond()   | 获取秒数 |
| public int getNano()            | 获取纳秒 |
| public Instant plusSeconds(long secondsToAdd) | 增加秒数 |
| public Instant minusSeconds(long secondsToSubtract) | 减少秒数 |
| public Boolean isAfter(Instant other) | 判断时间戳是否在 指定时间戳之后 |

## DateTimeFormatter 格式化时间

* **DateTimeFormatter类：**
    * **DateTimeFormatter类是用来格式化和解析日期时间的类**
    * **DateTimeFormatter类是线程安全的**

* **DateTimeFormatter类的常用方法：**

| 方法名                                   | 说明 |
| ---                                      | --- |
| public static DateTimeFormatter ofPattern(String pattern) | 使用指定的模式创建DateTimeFormatter对象 |
| public String format(TemporalAccessor temporal) | 格式化日期时间 |
| public TemporalAccessor parse(CharSequence text) | 解析日期时间 |

* 实际应用：
    * 可以使用DateTimeFormatter类的静态方法ofPattern创建DateTimeFormatter对象
    * 然后使用format方法格式化日期时间
    * 使用parse方法解析日期时间

**示例：**


```Java
public class Test {
    public static void main(String[] args) {
        // 创建DateTimeFormatter对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        // 格式化日期时间
        LocalDateTime ldt = LocalDateTime.now();
        String str = dtf.format(ldt);
        System.out.println(str);

        // 解析日期时间
        String str1 = "2021年08月01日 12:12:12";       
        LocalDateTime ldt1=  LocalDateTime.paser(str1,dtf);
        System.out.println(ldt1);
    }
}
```

## Period 日期间隔

* **Period类：**
    * Period类是用来表示日期间隔的类
    * Period类是一个不可变的类，用来表示两个日期之间的间隔

**Period类的常用方法：**

| 方法名                                                   | 说明 |
| ---                                                      | --- |
| public static Period between(LocalDate startDateInclusive, LocalDate endDateExclusive) | 创建两个日期之间的间隔 |
| public int getYears()                                    | 获取年份 |
| public int getMonths()                                   | 获取月份 |
| public int getDays()                                     | 获取天数 |

**示例：**

**Test 类**
```Java
public class Test {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, 1, 1);
        LocalDate end = LocalDate.of(2020, 12, 31);
        Period period = Period.between(start, end);

        System.out.println("相差" + period.getYears() + "年" + period.getMonths() + "月" + period.getDays() + "天");
    }
}
```

## Duration 时间间隔

* **Duration类：**
    * Duration类是用来表示时间间隔的类
    * Duration类是一个不可变的类，用来表示两个时间之间的间隔
    * 支持LocalTime、LocalDateTime 和 Instant
    * Duration类**计算的时间间隔是向上累计的**，与Period类不同

**Duration类的常用方法：**

| 方法名                                                   | 说明 |
| ---                                                      | --- |
| public static Duration between(Temporal startInclusive, Temporal endExclusive) | 创建两个时间之间的间隔 |
| public long toDays()                                     | 获取天数 |
| public long toHours()                                    | 获取小时数 |
| public long toMinutes()                                  | 获取分钟数 |
| public long toMillis()                                   | 获取毫秒数 |
| public long toNanos()                                    | 获取纳秒数 |

**示例：**

**Test 类**


```Java
public class Test {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2022,1,1,11,11,11);
        LocalDateTime end = LocalDateTime.of(2022,2,3,11,11,12);

        Duration duration = Duration.between(start, end);
        // Duration计算的时间差是向上累计的
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }
}
```
 
## Arrays 数组工具类 

* **Arrays类：**
    * Arrays类是一个工具类，用来操作数组
    * Arrays类中的所有方法都是静态的

* **Arrays类的常用方法：**

| 方法名                                                        | 说明 |
| ---                                                           | --- |
| public static String toString(int[] a)                        | 返回指定数组的内容的字符串表示形式 |
| public static void sort(Object[] a)                           | 对指定的Object类型数组按升序进行排序 |
| public static void sort(Object[] a, Comparator comparator)     | 对指定的Object类型数组按指定的Comparator进行排序 |
| public static int[] copyOf(int[] original, int newLength)     | 复制指定的数组，截取或用0填充（如有必要），以使副本具有指定的长度 |
| public static int binarySearch(int[] a, int key)              | 使用二分搜索算法搜索指定的int类型数组，以获得指定的值 |
| public static setAll(int[] array, IntUnaryOperator generator) | 使用提供的生成器函数设置指定数组的所有元素 array类型也可以是double[]等 |

**示例：**

**Test 类**


```Java
public class Test {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        // 打印的是数组的地址
        System.out.println(arr);
        // 打印数组
        System.out.println(Arrays.toString(arr));
        // 复制数组
        int[] arr1 = Arrays.copyOf(arr, 5); // 复制数组并扩充数组长度
        System.out.println(Arrays.toString(arr1));
        // 修改数组并存进去
        double[] price = {99.8,113,12.5};
        Arrays.setAll(price, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                // value = 0,1,2
                //return price[value]*0.8;
                // 为了防止精度问题 使用BigDecimal
                return BigDecimal.valueOf(price[value]).multiply(BigDecimal.valueOf(0.8)).doubleValue();
            }
        });
        System.out.println(Arrays.toString(price));
        // 对数组排序
        Arrays.sort(price);
        System.out.println(Arrays.toString(price));


    }
}
```

### Arrays 重写sort方法 

* 如果数组中存储的是自定义类型的对象，那么需要重写sort方法

**方法一** 对象实现Comparable接口，并重写compareTo方法
* **Comparable接口：**
    * Comparable接口是一个泛型接口，它只有一个方法compareTo
    * Comparable接口的作用是用来指定对象的排序规则 按照升序排序
    * 重写compareTo方法时，**返回正数表示当前对象大，返回负数表示当前对象小，返回0表示相等**

**示例：**

**Student 类**
```Java
public class Student implements Comparable<Student> {
    private String name ;
    private int age;
    private double height;

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
    // 重写compareTo方法
    @Override
    public int compareTo(Student o) {
        return this.age - o.age; // 按照年龄升序排序
    }
}
```

**Test 类**


```Java
public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("张三", 18, 180);
        students[1] = new Student("李四", 20, 170);
        students[2] = new Student("王五", 16, 175);

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("排序后：");
        java.util.Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
```
**方法二** 使用Comparator接口

* **Comparator接口：**
    * Comparator接口是一个函数式接口，创建匿名内部类对象 
    * 可以使用lambda表达式来实现Comparator接口
    * 重写compare方法时，**返回正数表示当前对象大，返回负数表示当前对象小，返回0表示相等**

**示例：** 按照学生对象的身高升序排序

注意： 身高类型是double类型，不能直接使用减法比较大小，需要使用Double.compare方法


```Java
// 使用Lambda表达式 重写Comparator接口的compare方法
        java.util.Arrays.sort(students, (o1, o2) -> Double.compare(o1.getHeight(),o2.getHeight())); // 按照身高升序排序
        for (Student student : students) {
            System.out.println(student);
        }
```

## lambda表达式

* **Lambda表达式：**
    * Lambda表达式是一个匿名函数，可以理解为一段可以传递的代码
    * Lambda表达式可以替代只有一个抽象方法的接口 也就是**函数式接口**
    * Lambda表达式的语法：(参数列表) -> {代码块}
    * Lambda表达式的参数列表可以省略数据类型，如果只有一个参数，可以省略括号
    * Lambda表达式的代码块如果只有一行，可以省略大括号和return关键字
    * Lambda表达式的参数列表和代码块可以省略，但是不能只省略参数列表

**示例：**


```Java
public class Test {
    public static void main(String[] args) {
        Animal a = () -> System.out.println("dog run");
        a.run();
        // 不是所有抽象方法都可以使用Lambda表达式 必须是函数式接口
//        Bird b = () -> System.out.println("bird fly"); // 报错
    }
}

// 定义一个函数式接口 --> 只有一个抽象方法的接口
@FunctionalInterface
interface Animal {
    void run();
}
abstract  class Bird
{
    abstract void  fly();
}
```

## 方法引用

* **方法引用：**
    * 方法引用是Lambda表达式的一种简写形式
    * 当Lambda表达式中的代码只是调用一个方法时，可以使用方法引用

### 静态方法的方法引用

* **静态方法的方法引用：**
    * 语法：类名::静态方法名
    * 例如：Student::run

**示例：**

**Test 类**
```Java
public class Test {
    public static void main(String[] args) {
//        Animal a = () -> System.out.println("dog run");
        // 使用静态方法引用进一步简化
        Animal a = Test::run;
        a.run();
    }
    // 静态方法
    public static void run() {
        System.out.println("dog run");
    }
}
  }}
}
```

### 实例方法的方法引用

* **实例方法的方法引用：**
    * 语法：实例对象::实例方法名
    * 例如：new Motion()::run2
    * 使用场景：当Lambda表达式中的代码只是调用一个实例方法时，可以使用实例方法引用

**示例：**

**Motion 类**


```Java
public class Motion {
    public void run2() {
        System.out.println("dog run");
    }
}
```

**Test 类**


```Java
public class Test {
    public static void main(String[] args) {
        Motion motion = new Motion();
        // 使用实例方法引用进一步简化
        Animal a = motion::run2;
        a.run();
    }
}
```

### 特定类型的方法引用

* **特定类型的方法引用：**
    * 语法：特定对象::实例方法名
    * 例如：String::compareToIgnoreCase
    * 使用场景：当Lambda表达式中的代码只是调用一个特定对象的实例方法时，可以使用特定类型的方法引用

**示例：**

**Test 类**


```Java
public class Test3 {
    public static void main(String[] args) {
        String[] name = {"liu", "zhang", "wang", "zhao","Liu", "Zhang", "Wang", "Zhao"};
        // 不区分字母大小写排序
        // compareToIgnoreCase() 比较两个字符串并忽略大小写 是String类的方法
//        Arrays.sort(name, (o1,o2) -> o1.compareToIgnoreCase(o2) );
        // 特定方法引用
        Arrays.sort(name,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(name));
    }
}
```

### 构造器的方法引用

* **构造器的方法引用：**
    * 语法：类名::new
    * 例如：Student::new
    * 使用场景：当Lambda表达式中的代码只是调用一个构造方法时，可以使用构造器的方法引用

**示例：**

**Student 类**


```Java
class Student {
    private String name ;
    private int age;
    private double height;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
```

**StudentBuilder 接口**


```Java
@FunctionalInterface
interface StudentBuilder {
    Student build(String name, int age, double height);
}
```

**Test 类**


```Java
public class Test4 {
    public static void main(String[] args) {
//        StudentBuilder sb = new StudentBuilder() {
//            @Override
//            public Student build(String name, int age, double height) {
//                return new Student(name, age, height);
//            }
//        };
        // 构造器引用
        StudentBuilder sb = Student::new;
        System.out.println(sb.build("liu", 18, 1.78));
    }
}

```

## Regex 正则表达式

* **正则表达式：**
    * 正则表达式是一个用来描述或者匹配一系列符合某个句法规则的字符串的单个字符串
    * 正则表达式是一种通用的字符串表达框架
    * 在Java中，使用`String`类的``matches``方法来判断字符串是否匹配正则表达式
    * 在Java中，使用`Pattern`类和`Matcher`类来实现正则表达式的匹配

**正则表达式的语法：**

| 符号 | 说明 |
| --- | --- |
| . | 匹配任意字符 |
| \d | 匹配数字：[0-9] |
| \D | 匹配非数字：[^0-9] |
| \s | 匹配空白字符：[ \t\n\x0B\f\r] |
| \S | 匹配非空白字符：[^\s] |
| \w | 匹配单词字符：[a-zA-Z_0-9] |
| \W | 匹配非单词字符：[^\w] |
| \b | 匹配单词边界 |
| \B | 匹配非单词边界 |
| ^ | 取反 |
| [abc] | 匹配a、b或c |
| [^abc] | 匹配除了a、b和c以外的任意字符 |
| \| | 或者 |
| ? | 匹配0次或1次 |
| * | 匹配0次或多次 |
| + | 匹配1次或多次 |
| {n} | 匹配n次 |
| {n,} | 匹配至少n次 |
| {n,m} | 匹配n到m次 |
| () | 分组 |
| \ | 转义字符 |
| && | 逻辑与 |
| \|\| | 逻辑或 |

**示例：** 

1.判断一个字符串是否是一个合法的手机号码

* **要求：** 11位数字，以1开头

2.判断一个字符串是否是一个合法的邮箱地址

**Test 类**


```Java
public class Test {
    public static void main(String[] args) {
        String phone = "13812345678";
        // 正则表达式
        String regex = "1[0-9]{10}";
        System.out.println(phone.matches(regex));

        String email = "1323sdd@qq.com";
        String email2 = "1323sdd@qqcom";

        String regex2 = "\\w{2,}@\\w{2,20}(\\.\\w{2,3}){1,2}";
        System.out.println(email.matches(regex2));
        System.out.println(email2.matches(regex2));
    }
}
```

3。从字符串中爬取出手机、邮箱、座机、400电话信息

**Test 类**


```Java
public class Test {
    public static void main(String[] args) {
        String str = "我的手机号是13812345678，座机号是010-12345678，邮箱是2wewe@qq.com，400电话是400-123-5678,400-3233232";

//        1. 定义爬取规则
        String regex = "1[0-9]{10}|\\d{3,4}-\\d{7,8}|\\w{2,}@\\w{2,20}(\\.\\w{2,3}){1,2}|400-?\\d{3,7}-?\\d{3,7}";

//        2. 把正则表达式编译成Pattern对象
        Pattern pattern = Pattern.compile(regex);

//        3. 通过Pattern对象得到Matcher对象
        Matcher matcher = pattern.matcher(str);

//        4. 定义循环，查找符合规则的字符串
        while (matcher.find()) {
            String rs = matcher.group(); // 获取找到的字符串
            System.out.println(rs);
        }
    }
}
```

4. 字符串的分割与替换

* **split方法：**
    * split方法是String类的方法，用来分割字符串
    * split方法的参数是一个正则表达式，可以使用正则表达式来分割字符串

* **replaceAll方法：**
    * replaceAll方法是String类的方法，用来替换字符串
    * replaceAll方法的参数是一个正则表达式，可以使用正则表达式来替换字符串

**Test 类**


```Java
public class Test {
    public static void main(String[] args) {
        // 将字符全部替换为-
        String s1 = "哈哈2323嘻嘻dsa嘿嘿";
        System.out.println(s1.replaceAll("\\w+", "-"));

        // 将重复的字符优化
        String s2 = "我我我我喜欢编编编程程程";
        System.out.println(s2.replaceAll("(.)\\1+", "$1"));
        // 将字符串按照字符分割
        String[] str =  s1.split("\\w+");
        System.out.println(Arrays.toString(str));
    }
}

```

## Exception 异常

* **异常：**
    * 异常是程序在执行过程中遇到的不正常情况
    * 异常是Java程序的一部分，用来处理程序运行过程中出现的错误
    * 异常处理是程序设计中的一种重要机制，可以保证程序的稳定性和健壮性
    * 异常分为两种：**编译时异常**和**运行时异常**

* **编译时异常**
    * 编译时异常是程序在编译阶段会出现的异常，如果程序中抛出了编译时异常，那么程序在编译时会报错 例如：解释器异常

* **运行时异常**
    * 运行时异常是程序在运行阶段会出现的异常，如果程序中抛出了运行时异常，那么程序在编译时不会报错，但是在运行时会抛出异常 例如：数组访问越界 


* **异常处理：**
    * 异常处理是程序设计中的一种重要机制，可以保证程序的稳定性和健壮性
    * 异常处理的方式有两种：**捕获异常**和**抛出异常**

* **捕获异常**
    * 捕获异常是指在程序中捕获并处理异常
    * 捕获异常的方式有两种：**try-catch**和**try-catch-finally**

**示例：**

**Test**


```Java
public class Test {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // ctrl + alt + t --> try catch
        try {
            String str = "2022-01-01 11:11";
            LocalDateTime a = LocalDateTime.parse(str, dtf);

            System.out.println(a);
        } catch (Exception e) {
            System.out.println("解析异常");
            e.printStackTrace();
        }
    }
}

```

* **抛出异常**
    * 抛出异常是指在程序中抛出异常
    * 抛出异常的方式是使用**throw**关键字

**示例：**

**Test**


```Java
public class Test {
    public static void main(String[] args) throws ParseException{
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // ctrl + alt + t --> try catch
        String str = "2022-01-01 11:11";
        LocalDateTime a = LocalDateTime.parse(str, dtf);

        System.out.println(a);
}
    
```

###  自定义异常

* **自定义异常：**
    * 自定义异常是指用户自己定义的异常
    * 自定义异常类继承自Exception类（**编译时异常**）或者RuntimeException类（**运行时异常**）
    * 通常异常严重程度较高时，继承Exception类；异常严重程度较低时，继承RuntimeException类
    * ``throw  new 异常类对象("异常信息")")`` 抛出异常对象
    * `throws 异常类` 用在方法上，抛出方法内部的异常给上一级， **自定义编译时异常需要使用**
  
**示例：**


```Java
public class DiyExceptionTest {

    public static void main(String[] args) {
//        setAge(300);
//         使用try-catch捕获异常 否则程序会终止
        try {
            setAge(300);
        } catch (AgeIllegalRuntimeException e) {
            e.printStackTrace();
        }

        try {
            setAge2(300);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
        }

        System.out.println("程序继续执行");
    }
    // 自定义运行时异常
    public static void setAge(int age) {
        if (age < 0 || age > 200) {
            System.out.println("抛出运行时异常, 年龄不合法");
            throw new AgeIllegalRuntimeException("年龄不合法");

        }
        System.out.println("年龄为：" + age);

    }

    // 自定义编译时异常
    public static void setAge2(int age) throws AgeIllegalException
    {
        if (age < 0 || age > 200) {
            System.out.println("抛出编译时异常, 年龄不合法");
            throw new AgeIllegalException("年龄不合法");
        }
        else {
            System.out.println("年龄为：" + age);
        }
    }
}

```

### 捕获异常后处理方式

* **捕获异常后处理方式：**
    * 记录异常并响应合适的信息给用户
    * 尝试重新修复

1.  **记录异常并响应合适的信息给用户**
**示例：**


```Java
public class Test {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // ctrl + alt + t --> try catch
        try {
            String str = "2022-01-01 11:11";
            LocalDateTime a = LocalDateTime.parse(str, dtf);

            System.out.println(a);
        } catch (Exception e) {
            System.out.println("解析异常");
            e.printStackTrace();
```

2. **尝试重新修复**

**示例：**

* 用户输入价格，如果价格<0，提示价格不能为负数，重新输入
* 如果价格不是数字，则为异常，尝试重新修复



```Java
public class ExceptionRepairTest {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println(getMoney());
                break;
            } catch (Exception e) {
                System.out.println("输入金额格式有误，请重新输入");
            }
        }
    }

    public static double getMoney() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入金额：");
            double money = scanner.nextDouble();
            if (money < 0) {
                System.out.println("金额不能为负数");
            } else
                return money;
        }
    }
}
```

## Collection 集合

* **集合：**

    * 集合是Java中的一种容器，可以用来存储多个数据
    * 集合是一个接口，Java中提供了很多集合类，如List、Set、Map等
    * 集合类的特点是可以动态增长和缩减

* **Collection接口：**

    * Collection接口是Java集合框架中的根接口，它是单列集合类的父接口，**它规定的方法是全部单列集合都会继承的**.
    * Collection接口中定义了集合类的基本操作，如添加、删除、遍历等

* **Collection接口的常用方法：**

| 方法名                                   | 说明 |
| ---                                      | --- |
| public boolean add(E e)                  | 添加元素 |
| public boolean remove(Object o)          | 删除元素 |
| public void clear()                      | 清空集合 |
| public boolean contains(Object o)        | 判断集合中是否包含指定元素 |
| public boolean isEmpty()                 | 判断集合是否为空 |
| public int size()                        | 获取集合中元素的个数 |
| public Object[] toArray()                | 将集合转换为数组 |

**Collection 遍历**

1. **增强for** `for(元素类型 变量名 : 集合对象) { }`

2. **lambda表达式** `集合对象.forEach(元素 -> { })`
    * 如果是遍历输出，可以使用方法引用 `集合对象.forEach(System.out::println)`
    
### List 集合

* **List集合：**
    * ``List``集合是``Collection``接口的子接口，List集合中的元素是有序的，且可以重复
    * ``List``集合中的元素可以通过索引来访问，索引从0开始
    * ``List``集合中的元素可以根据需要动态增长和缩减

* **List接口有两个常用的实现类：**
    * ``ArrayList``：底层是**数组**结构，查询快，增删慢
    * ``LinkedList``：底层是**链表**结构，查询慢，增删快
        * 利用`LinkedList`的`addFirst`和`addLast`方法可以实现栈和队列`Stack`和`Queue`
        * ``addFirst`` 等价于`Push`
        * ``removeFirst`` 等价于`Pop`
        * ``removeLast`` 等价于`Poll`


### Set 集合

* **Set集合：**
    * ``Set``集合是``Collection``接口的子接口，Set集合中的元素是无序的，且不可以重复、没有索引
    * ``Set``集合中的元素是不能重复的，如果向Set集合中添加重复的元素，Set集合会自动去除重复的元素（**Hash**）

* **Set接口有三个常用的实现类：**

    * ``HashSet``：无序、不重复、无索引
    * ``LinkedHashSet``：**有序**、不重复、无索引
    * ``TreeSet``：**排序**、不重复、无索引

#### HashSet

* **HashSet：**
    * 实现方式： 数组 + 链表 + 红黑树
    * Java中每个对象都有一个hashCode值，hashCode值是一个整数，可以通过对象的hashCode方法获取
    * HashSet集合会根据元素的hashCode值来决定元素在集合中的存储位置
    * 不同的对象可能有相同的hashCode值，这种现象称为**哈希冲突**



![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20241206153456.png)

* 如果数组超过长度×0.75，数组会扩容为原来的2倍

**如果数组中的链表长度超过8，数组长度超过64，链表会转换为红黑树**

##### **红黑树**

* 红黑树是一种**自平衡的二叉查找树**
    * 红黑树的每个节点上都有存储位表示节点的颜色，可以是红色或黑色
    * 红黑树的特性：
        * 每个节点要么是红色，要么是黑色
        * 根节点是黑色
        * 每个叶子节点（NIL节点，空节点）是黑色的
        * 不能有相邻的两个红色节点
        * 从任一节点到其每个叶子的所有路径都包含相同数目的黑色节点

[平衡树的写法](https://www.acwing.com/activity/content/code/content/8744603/)

* **HashSet集合默认不能对自定义对象去重，需要重写hashCode和equals方法** ：否则默认按照地址去重

**示例：**

**Test 类**
```Java
package com.liu.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Student> student = new HashSet<>();

        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 20);
        Student s3 = new Student("王五", 16);
        Student s4 = new Student("李四", 20);
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s2);
        student.add(s4);


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s4.hashCode());

        for (Student student1 : student) {
            System.out.println(student1);
        }
    }
}

```
**Student 类**

需要重写hashCode和equals和toString方法


```Java
package com.liu.HashSet;

import java.util.Objects;

public class Student
{
    private String name ;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}


```

#### LinkedHashSet

* **LinkedHashSet：**
    * LinkedHashSet是HashSet的子类，LinkedHashSet集合中的元素是有序的，且不可以重复
    * LinkedHashSet集合中的元素是按照添加的顺序进行排序的

**实现原理**：底层是**哈希表**和**链表**实现的
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412061711806.png)

* **优点**：有序 
* **缺点**：浪费内存

#### TreeSet

* **TreeSet：**
    * TreeSet是Set接口的实现类，TreeSet集合中的元素是有序的，且不可以重复
    * TreeSet集合中的元素是按照**红黑树**进行升序排序的
    * TreeSet集合中的自定义对象元素需要实现``Comparable``接口，重写``compareTo``方法 或者 重写``comparator``匿名内部类

* **注意**：如果自定义对象**只按照年龄排序**，年龄相同的对象只能添加一个，因为TreeSet会认为是重复的对象

**示例：**

**Student 类**

实现Comparable接口，重写compareTo方法
```Java
public class Student implements Comparable<Student>
{
    private String name ;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}


```
**Test 类**

```Java
public class TreeSetTest {
    public static void main(String[] args) {
        Set<Student> student = new TreeSet<>();

        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 20);
        Student s3 = new Student("王五", 16);
        Student s4 = new Student("李四", 20);
        Student s5 = new Student("嘻嘻", 20);   // 会被去重
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s2);
        student.add(s4);
        student.add(s5);


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s4.hashCode());

        System.out.println(student);
        // 输出： [Student{name='王五', age=16}, Student{name='张三', age=18}, Student{name='李四', age=20}]
    }

}
```
### 并发修改异常

* **并发修改异常：**
    * 并发修改异常是指在使用迭代器遍历集合的过程中，对集合进行了增删操作，导致迭代器遍历集合时，集合的结构发生了变化，抛出异常
    * 解决方法：使用迭代器的remove方法删除元素,而不是集合的remove方法


```Java
public class ConcurrentModificationExceptionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("李四")) {
                it.remove(s);
            }
        }
    }
}
```

## Collections 集合工具类

* **Collections集合工具类：**
    * Collections是一个工具类，提供了一系列静态方法，用于对集合进行操作
    * Collections中的方法都是静态方法，可以直接通过类名调用
    * Collections中的方法都是对List、Set、Map等集合进行操作的

* **Collections集合工具类的常用方法：**

| 方法名                                   | 说明 |
| ---                                      | --- |
| public static <T> void sort(List<T> list)                  | 对List集合中的元素进行排序 |
| public static <T> void shuffle(List<T> list)               | 对List集合中的元素进行随机排序 |
| public static <T> void reverse(List<T> list)               | 对List集合中的元素进行逆序 |
| public static <T> void fill(List<? super T> list, T obj)   | 使用指定元素替换List集合中的所有元素 |
| public static <T> void copy(List<? super T> dest, List<? extends T> src) | 将src集合中的元素复制到dest集合中 |
| public static <T> boolean replaceAll(List<T> list, T oldVal, T newVal) | 使用新值替换List集合中的所有指定旧值 |
| public static <T> boolean addAll(Collection<? super T> c, T... elements) | 将所有指定元素添加到指定集合中 |

## Map 集合

* **Map集合：**
    * Map集合是一个**键值对集合**，每个元素包含一个键对象和一个值对象
    * Map集合中的键是唯一的，值可以重复
    * Map集合中的键和值都可以是任意类型的对象
    * Map集合中的键是无序的，值是有序的

* **Map接口的常用方法：**

| 方法名                                   | 说明 |
| ---                                      | --- |
| public V put(K key, V value)              | 将指定的值与指定的键关联 |
| public V get(Object key)                  | 返回指定键所映射的值 |
| public V remove(Object key)               | 删除指定键所映射的值 |
| public boolean containsKey(Object key)    | 判断集合中是否包含指定的键 |
| public boolean containsValue(Object value)| 判断集合中是否包含指定的值 |
| public int size()                         | 返回集合中键值对的个数 |
| public Set<K> keySet()                    | 返回集合中所有键的Set集合 |
| public Collection<V> values()             | 返回集合中所有值的Collection集合 |
| public Set<Map.Entry<K, V>> entrySet()    | 返回集合中所有键值对的Set集合 |
| public void clear()                       | 清空集合 |

### map遍历

1. **增强for** `for(元素类型 变量名 : 集合对象) { }`

2. **lambda表达式** `集合对象.forEach(元素 -> { })`
    * 如果是遍历输出，可以使用方法引用 `集合对象.forEach(System.out::println)`

3. **entrySet遍历** `Set<Map.Entry<K, V>> entrySet = map.entrySet();`

### HashMap

* **HashMap：**
    * HashMap是Map接口的一个实现类，HashMap集合中的元素是无序的，且键值对是一一对应的
    * HashMap集合中的键是唯一的，值可以重复
    * HashMap集合中的键和值都可以是任意类型的对象
    * HashMap集合中的键是无序的，值是有序的
    * HashMap集合中的键是通过hashCode方法计算出来的，可以通过equals方法判断键是否相等
    * 自定义对象作为键，需要重写hashCode和equals方法

* **HashMap的底层实现：**
    * HashSet 就是基于HashMap实现的，只取了HashMap的key值
    * HashMap底层是**数组** + **链表** + **红黑树**实现的

### LinkedHashMap 与 TreeMap

**与HashMap同理**

## Stream 流

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412071554017.png)

* **Stream流：**
    * Stream流是Java8中的新特性，可以对集合进行**函数式操作**
    * Stream流可以对集合进行**过滤、映射、排序、聚合**等操作
    * Stream流的操作分为**中间操作**和**终结操作**
    * Stream流的操作是**延迟执行**的，只有遇到终结操作时，中间操作才会执行

### Stream流的创建

* **Stream流的创建：**
    * Stream流的创建有两种方式：**集合创建流**和**数组创建流**

1. **集合创建流** `集合对象.stream()`

2. **数组创建流** `Arrays.stream(数组)`
    * `Stream.of(数组)`
    * `Stream.of(元素1, 元素2, 元素3)`

**示例：**

**Test 类**



```Java
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        // 集合创建流
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        // 数组创建流
        String[] arr = {"张三", "李四", "王五"};
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(System.out::println);

        // Stream.of创建流
        Stream<String> stream2 = Stream.of("张三", "李四", "王五");
        stream2.forEach(System.out::println);
    }
}
```

### **Stream流的常用方法：**
``
| 方法名                                                                | 说明 |
| ---                                                                   | --- |
| public Stream<T> filter(Predicate<? super T> predicate)               | 过滤集合中的元素 |
| public <R> Stream<R> map(Function<? super T, ? extends R> mapper)     | 映射集合中的元素 |
| public Stream<T> sorted()                                             | 对集合中的元素进行排序 |
| public Stream<T> limit(long maxSize)                                  | 截取集合中的前N个元素 |
| public Stream<T> skip(long n)                                         | 跳过集合中的前N个元素 |
| public Stream<T> distinct()                                           | 去除集合中的重复元素, 自定义对象需要重写equal和Hashcode方法 |
| public long count()                                                   | 统计集合中的元素个数 |
| public Optional<T> findFirst()                                        | 返回集合中的第一个元素 |
| public Optional<T> findAny()                                          | 返回集合中的任意一个元素 |
| public T reduce(T identity, BinaryOperator<T> accumulator)            | 对集合中的元素进行聚合操作 |
| public <R> R collect(Collector<? super T, A, R> collector)            | 将集合中的元素收集到一个容器中  **流只能收集一次**|
| public Object[] toArray()                                             | 将集合转换为数组 |
| public void forEach(Consumer<? super T> action)                      | 遍历集合中的元素 |
| public Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b) | 合并两个流 |
| public Optional<T> max(Comparator<? super T> comparator)              | 获取最大值 |
| public Optional<T> min(Comparator<? super T> comparator)              | 获取最小值 |

** 返回值为Stream的方法称为中间操作，返回值不为Stream的方法称为终结操作**

### **collect方法的使用**

**示例：**
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412081738287.png)

* toMap方法 
    * 第一个参数是key的提取方法
    * 第二个参数是value的提取方法
    * 使用前加一个distinct去重

### **toArray方法的使用**

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412081741827.png)

**需要转换成特定类型的数组时，需要传入构造器引用**
    
## File 文件

* **File类：**
    * File类是Java中的一个类，用来表示文件或目录
    * File类可以用来操作文件或目录，如创建、删除、重命名等
    * File类的对象可以表示文件或目录的路径，可以获取文件或目录的属性

* **File类的常用方法：**

| 方法名                                   | 说明 |
| ---                                      | --- |
| File(String pathname)                   | 根据路径名创建File对象 |
| File(String parent, String child)       | 根据父路径和子路径创建File对象 |
| File(File parent, String child)         | 根据父File对象和子路径创建File对象 |
| public boolean exists()                  | 判断文件或目录是否存在 |
| public boolean isFile()                  | 判断File对象是否是文件 |
| public boolean isDirectory()             | 判断File对象是否是目录 |
| public String getName()                  | 获取文件或目录的名称 |
| public String getPath()                  | 获取文件或目录的路径 |
| public long length()                     | 获取文件的大小 |
| public long lastModified()               | 获取文件的最后修改时间 |
| public boolean createNewFile()           | 创建文件 |
| public boolean mkdir()                   | 创建一级目录 |
| public boolean mkdirs()                  | 创建多级目录 |
| public String[] list()                   | 获取目录中的所有文件或目录的名称 |
| public File[] listFiles()                | 获取目录中的所有文件或目录的File对象 **包含隐藏文件**|
| public boolean delete()                  | 删除文件或目录 **只能删除空文件、目录**|
| public boolean renameTo(File dest)       | 重命名文件或目录 |

 ## 字符集 

* **字符集：**
    * 字符集是一个字符编码的集合，用来表示字符和字节之间的对应关系

* **常用字符集：**
    * **GBK**：国标编码，是中国的中文编码标准
    * **UTF-8**：是一种针对Unicode的可变长度字符编码，是一种多字节编码

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412082033956.png)
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412082038222.png)


## IO 流


![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412091008398.png)

* **IO流：**
    * IO流是Java中的一种输入输出流，用来处理设备之间的数据传输
    * IO流是Java中的一个重要的特性，可以用来读写文件、网络通信等
    * IO流分为**输入流**和**输出流**，输入流用来读取数据，输出流用来写入数据
    * IO流分为**字节流**和**字符流**，字节流用来处理二进制文件，字符流用来处理文本文件

* **IO流的分类：**
    * **字节流**：以字节为单位进行读写，适合处理二进制文件
        * **InputStream**：字节输入流的抽象类
        * **OutputStream**：字节输出流的抽象类
    * **字符流**：以字符为单位进行读写，适合处理文本文件
        * **Reader**：字符输入流的抽象类
        * **Writer**：字符输出流的抽象类

### try-catch-finally

* **try-catch-finally：**
    * try-catch-finally是Java中的异常处理机制，用来捕获和处理异常
    * finally块中的代码无论是否发生异常，都会执行,除非在try块中使用了System.exit(0)终止程序
    * finally块中的代码通常用来释放资源，如关闭文件、关闭数据库连接等
    * **不要在finally块中使用return语句，因为finally块中的return语句会覆盖try块中的return语句**

### try-with-resources

* **try-with-resources：**
    * try-with-resources是Java7中的新特性，用来自动关闭资源
    * try-with-resources可以自动关闭实现了AutoCloseable接口的资源，如文件、数据库连接等
    * try-with-resources的语法是在try关键字后面加上一对圆括号，圆括号中定义资源，资源会在try块执行完毕后自动关闭

**示例：**

文件复制案例

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412091524654.png)

### 字符流

* **字符流：**
    * 字符流是Java中的一种输入输出流，用来处理文本文件
    * 字符流是Java中的一个重要的特性，可以用来读写文本文件
    * 字符流分为**字符输入流**和**字符输出流**，字符输入流用来读取文本文件，字符输出流用来写入文本文件

* **字符流的常用类：**
    * **Reader**：字符输入流的抽象类
        * **FileReader**：文件字符输入流
        * **BufferedReader**：缓冲字符输入流
    * **Writer**：字符输出流的抽象类
        * **FileWriter**：文件字符输出流
        * **BufferedWriter**：缓冲字符输出流

| 方法名                                          | 说明 |
| ---                                             | --- |
| public int read()                               | 读取单个字符 |
| public int read(char[] cbuf)                    | 读取字符数组 |
| public void write(int c)                        | 写入单个字符 |
| public void write(char[] cbuf)                  | 写入字符数组 |
| public void write(String str)                   | 写入字符串 |
| public void write(String str, int off, int len) | 写入字符串的一部分 |
| public void flush()                             | 刷新流 |
| public void close()                             | 关闭流 |

### 字节缓冲输入输出流

* **字节缓冲输入输出流：**
    * 字节缓冲输入输出流是Java中的一种输入输出流，用来处理字节文件
    * 字节缓冲输入输出流是Java中的一个重要的特性，可以用来读写字节文件
    * 字节缓冲输入输出流分为**字节缓冲输入流**和**字节缓冲输出流**，字节缓冲输入流用来读取字节文件，字节缓冲输出流用来写入字节文件
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412100915529.png)



```Java
public class BufferInputStreamTest1 {
    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("oop-prac-file/src/com/liu/buffer/test.txt");
                OutputStream os = new FileOutputStream("oop-prac-fil e/src/com/liu/buffer/test_copy.txt");
                InputStream bis = new BufferedInputStream(is);
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("Copy done!");
        } catch ( Exception e)
        {
            e.printStackTrace();
        }
    }
}
```

### 字符缓冲输入输出流

* **字符缓冲输入输出流：**
    * 字符缓冲输入输出流是Java中的一种输入输出流，用来处理文本文件
    * 字符缓冲输入输出流是Java中的一个重要的特性，可以用来读写文本文件
    * 字符缓冲输入输出流分为**字符缓冲输入流**和**字符缓冲输出流**，字符缓冲输入流用来读取文本文件，字符缓冲输出流用来写入文本文件

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412100948825.png)

* 新增方法
    * public string readLine() 读取一行数据 无数据返回null
    * public void newLine() 写入一个换行符  

### 字符输入输出转换流

* **字符输入输出转换流：**
    * 字符输入输出转换流是Java中的一种输入输出流，用来处理文本文件
    * 字符输入输出转换流分为**字符输入转换流**和**字符输出转换流**，字符输入转换流用来读取文本文件，字符输出转换流用来写入文本文件
    * 字符输入输出转换流可以指定字符集，用来处理不同编码的文本文件

| 方法名                                          | 说明 |
| ---                                             | --- |
| public InputStreamReader(InputStream is, Stromh charset)         | 创建字符输入转换流 |
| public OutputStreamWriter(OutputStream os, Stromh charset)      | 创建字符输出转换流 |

**示例：**

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412101018504.png)

### 打印流

* **打印流：**
    * 打印流是Java中的一种输出流，用来打印数据到控制台或文件

* **打印流的常用类：**
    * **PrintStream**：打印字节流
    * **PrintWriter**：打印字符流

| 方法名                                              | 说明 |
| ---                                                 | --- |
| public PrintStream(File file)                       | 创建打印流 |
| public PrintStream(String fileName,Charset charset) | 可以指定写出去的字符编码 |
| public PrintStream(OutputStream,boolean autoFlush)  | 可以指定实现自动刷新 |
| public void print(数据类型 data)                    | 打印数据 |
| public void println(数据类型 data)                  | 打印数据并换行 |

**PrintWriter 与 PrintStream 方法一样**

#### 输出语句重定向

* **输出语句重定向：**
    * 输出语句重定向是Java中的一种技术，用来将输出语句重定向到文件
    * 输出语句重定向可以将System.out.println输出的内容重定向到文件

| 方法名                                              | 说明 |
| ---                                                 | --- |
| public static void setOut(PrintStream out)          | 设置标准输出流 |

**示例：** 将输出语句重定向到文件

**Test 类**
```Java
public class test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        // 重定向到文件
        try (PrintStream ps = new PrintStream("oop-prac-file/src/com/liu/printstream/test.txt");){
            System.setOut(ps);
            System.out.println("Hello, World!");
            System.out.println("Hello, World!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
```

### 数据流 

* **数据流：** ``DataInputStream`` 和 ``DataOutputStream``
    * 数据流是Java中的一种输入输出流，用来处理基本数据类型和字符串
    * 可以把特定的数据类型直接写入文件或读取文件

| 方法名                                              | 说明 |
| ---                                                 | --- |
| public void writeInt(int v)                         | 写入int数据 |
| public int readInt()                                | 读取int数据 |
| public void writeDouble(double v)                   | 写入double数据 |
| public double readDouble()                          | 读取double数据 |
| public void writeBoolean(boolean v)                 | 写入boolean数据 |
| public boolean readBoolean()                        | 读取boolean数据 |
| public void writeUTF(String v)                      | 写入String数据 |
| public String readUTF()                             | 读取String数据 |

### 对象流

* **对象流：** ``ObjectInputStream`` 和 ``ObjectOutputStream``
    * 对象流是Java中的一种输入输出流，用来处理对象
    * 可以把对象直接写入文件或读取文件
    * 对象序列化用来将对象转换为字节序列，对象反序列化用来将字节序列转换为对象
    * 需要实现``Serializable``接口,才能序列化
    * **``transient``修饰的属性不会被序列化**，用于敏感数据的隐藏

* **如果想一次性序列化多个对象，可以使用集合（ArrayList）存储多个对象，然后序列化集合**

| 方法名                                              | 说明 |
| ---                                                 | --- |
| public void writeObject(Object obj)                 | 写入对象 |
| public Object readObject()                          | 读取对象 |

**示例：**

**User 类**
```Java
public class User implements Serializable {
    public User() {
    }

    public User(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String name;
    private int age;
    private transient String password; // 该数据不需要序列化
}
```

**ObjectOutputStreamTest 类**
```Java
public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oop-prac-file/src/com/liu/objectstream/test.txt"));) {
            User user = new User("liu", 18, "123456");
            oos.writeObject(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
```

**ObjectInputStreamTest 类**
```Java
public class ObjectInputStreamTest {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oop-prac-file/src/com/liu/objectstream/test.txt"));){
            User user = (User) ois.readObject();
            System.out.println(user);


        } catch (Exception e) {
            throw new RuntimeException(e);
        };
    }
}
```

## Common-IO

* **Common-IO：**
    * Common-IO是Apache的一个开源项目，提供了一系列的IO操作工具类
    * Common-IO中的工具类可以简化IO操作，提高开发效率
    * Common-IO中的工具类可以处理文件、流、字节数组等

* **Common-IO的常用工具类：**
    * **FileUtils**：文件操作工具类
    * **IOUtils**：流操作工具类
    * **ByteArrayUtils**：字节数组操作工具类

### FileUtils

* **FileUtils：**
    * FileUtils是Common-IO中的一个工具类，用来处理文件
    * FileUtils中的方法可以复制、移动、删除、读取文件等

| 方法名                                              | 说明 |
| ---                                                 | --- |
| public static void copyFile(File srcFile, File destFile) | 复制文件 |
| public static void moveFile(File srcFile, File destFile) | 移动文件 |
| public static void deleteQuietly(File file)             | 删除文件 |
| public static List<String> readLines(File file)         | 读取文件内容 |
| public static void writeStringToFile(File file, String data) | 写入文件内容 |
| public static void writeLines(File file, List<String> lines) | 写入文件内容 |
| public statci void deleteDirectory(File directory)      | 删除目录 |
| public static String readFileToString(File file)        | 读取文件内容 |

### IOUtils

* **IOUtils：**
    * IOUtils是Common-IO中的一个工具类，用来处理流
    * IOUtils中的方法可以复制、移动、删除、读取流等

| 方法名                                                                         | 说明 |
| ---                                                                            | --- |
| public static void copy(InputStream input, OutputStream output)                | 复制流 |
| public static void closeQuietly(Closeable closeable)                           | 关闭流 |
| public static int copy(Reader input, Writer output)                            | 复制字符流 |
| public static void write(String data, OutputStream output,String charsetName) | 写入数据 |

## Properties

* **Properties：**
    * Properties是Java中的一个类，用来处理属性文件
    * Properties是Hashtable的子类，可以用来读取和写入属性文件
    * Properties中的方法可以读取和写入属性文件
    * 属性文件是以键值对的形式存储的文件，可以用来存储配置信息
    * Properties是Map接口的实现类


| 方法名                                              | 说明 |
| ---                                                 | --- |
| public void load(InputStream in)                     | 读取属性文件 |
| public void store(OutputStream out, String comments) | 写入属性文件 |
| public String getProperty(String key)                | 获取属性值 |
| public String setProperty(String key, String value)  | 设置属性值 |
| public Set<String> stringPropertyNames()             | 获取所有属性名 |

**示例：**

读取配置文件

**Test 类**
```Java
public class ReadTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("oop-prac-properties/src/com/liu/properties/test.properties"));
            // 输出properties
            System.out.println(properties);

            // 根据key获取value
            System.out.println(properties.getProperty("张三"));

            // 遍历properties
            properties.forEach((k,v) -> {
                System.out.println(k + " = " + v);
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
```

写入配置文件

**Test 类**
```Java
public class WriteTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("张三", "18");
        properties.setProperty("李四", "20");
        properties.setProperty("王五", "16");

        try {
            properties.store(new FileWriter("oop-prac-properties/src/com/liu/properties/test.properties"), "test");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
```

## dom4j 解析XMl工具

* **dom4j：**
    * dom4j是一个Java中的XML解析工具，用来解析XML文件
    * dom4j可以解析XML文件，获取XML文件中的元素、属性、文本等
    * dom4j可以创建XML文件，生成XML文件中的元素、属性、文本等

* **dom4j的常用类：**
    * **Document**：XML文档对象
    * **Element**：XML元素对象
    * **Attribute**：XML属性对象
    * **Text**：XML文本对象

### **Documents**提供的方法：

| 方法名                                      | 说明 |
| ---                                         | --- |
| public static Document read(InputStream in) | 读取XML文件 |
| public static Document read(Reader reader)  | 读取XML文件 |
| public static Document read(File file)      | 读取XML文件 |

### **Element**提供的方法：

| 方法名                          | 说明 |
| ---                             | --- |
| public Element getRootElement() | 获取根元素 |
| public List<Element> elements() | 获取所有子元素 |
| public Element element(String name) | 获取指定名称的子元素 |
| public List<Attribute> attributes() | 获取所有属性 |
| public Attribute attribute(String name) | 获取指定名称的属性 |
| public String getText() | 获取文本内容 |
| public String elementText(String name) | 获取指定名称的子元素的文本内容 |
| public String getName () | 获取元素名称 |

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412111246408.png)
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412111244957.png)

## 日志

* **日志：**
    * 日志是Java中的一个重要的特性，用来记录程序运行时的信息
    * 日志可以记录程序运行时的异常、错误、警告等信息
    * 日志可以用来调试程序、分析程序运行时的问题
    * Java中的日志有很多种，如JDK自带的日志、Log4j、Logback等

* **日志的级别：** 从低到高

| 日志级别       | 说明 |
| ---            | --- |
| trace          | 跟踪信息 |
| debug          | 调试信息 |
| info           | 输出重要的运行信息，数据连接、网络链接、IO操作等 |
| warn           | 警告信息，程序可以正常运行，但是可能存在潜在的问题 |
| error          | 错误信息，程序出现异常 |

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412111543353.png)

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412111439703.png)

### Logback 日志框架

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412111442930.png)

**示例：**

写日志之前，要先配置logback.xml文件，以及引入logback依赖

**日志会输出到控制台和文件中**
 
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412111522093.png)

**Test 类**
```Java
public class LogTest {
    public static final Logger logger = LoggerFactory.getLogger("LogBackTest");
    public static void main(String[] args) {

        try {
            logger.info("程序启动");
            divider(10,2);
            logger.info("程序正常运行");
        } catch (Exception e) {
            logger.error("程序异常");
            throw new RuntimeException(e);
        }
    }
    public static void divider(int a,int b)
    {
        logger.debug("参数a:"+a); ;
        logger.debug("参数b:"+b);
        int c = a/b;
        logger.info("结果c:"+c);
    }
}
```

**日志写入结果** ：会持续更新
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412111523450.png)

## 多线程

* **多线程：**
    * 多线程是Java中的一个重要的特性，可以同时执行多个线程
    * 多线程可以提高程序的运行效率，提高程序的响应速度
    * 多线程可以用来处理耗时的操作，如网络通信、文件读写等
    * 多线程可以用来处理并发问题

### 第一种方式 继承Thread类

* **继承Thread类：**
    * 继承Thread类是Java中创建线程的一种方式
    * 继承Thread类需要重写run方法，run方法中是线程的执行体
    * 继承Thread类创建的线程可以直接调用start方法启动线程

**示例：**

**MyThread 类**
```Java
public class MyThread  extends Thread{
    @Override
    public void run() {
        for(int i = 1;i<=5;i++)
        {
            System.out.println("子线程MyThread第" + i + "次执行！");
        }
    }
}
```

**Test 类**
```Java
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for(int i = 1;i<=5;i++)
        {
            System.out.println("主线程第" + i + "次执行！");
        }
    }
}
```
**结果每次执行结果不一定相同，因为线程执行是异步的**

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412111602898.png)

### 第二种方式 实现Runnable接口

* **实现Runnable接口：**
    * 实现Runnable接口是Java中创建线程的一种方式
    * 实现Runnable接口需要重写run方法，run方法中是线程的执行体
    * 实现Runnable接口创建的线程需要创建Thread对象，然后将Runnable对象作为参数传递给Thread对象

**示例：**

**MyRunnable 类**
```Java
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 1;i<=5;i++)
        {
            System.out.println("子线程MyRunnable第" + i + "次执行！");
        }
    }
}
```

**Test 类**
```Java
public class Test {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        for(int i = 1;i<=5;i++)
        {
            System.out.println("主线程第" + i + "次执行！");
        }
    }
}
```

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412111613273.png)

### 第三种方式 实现Callable接口

* **实现Callable接口：**
    * 实现Callable接口是Java中创建线程的一种方式
    * 实现Callable接口需要重写call方法，call方法中是线程的执行体
    * 实现Callable接口创建的线程需要创建FutureTask对象，然后将Callable对象作为参数传递给FutureTask对象，再将FutureTask对象作为参数传递给Thread对象
    * 实现Callable接口创建的线程**可以使用``FutureTask``的``get()``方法获取线程的执行结果**

**示例：**

**MyCallable 类**
```Java
public class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }


    @Override
    public String call() throws Exception {
        // 计算1 - n 的 和
        int rs = 0;
        for (int i = 1; i <= n; i++) {
            rs += i;
        }
        return "从1 " + n + " 的和为：" + rs;
    }
}
```

**Test 类**
```Java
public class ThreadTest3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建Callable接口实现类对象
        Callable mycallable = new MyCallable(100);
        // 把Callable接口实现类对象包装成FutureTask对象

        FutureTask<String> f1 = new FutureTask<String>(mycallable);
        new Thread(f1).start();


        Callable mycallable2 = new MyCallable(200);
        // 把Callable接口实现类对象包装成FutureTask对象

        FutureTask<String> f2 = new FutureTask<String>(mycallable2);
        new Thread(f2).start();
        String rs1 = f1.get();
        System.out.println(rs1);
        String rs2 = f2.get();
        System.out.println(rs2);

    }
}
```
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412111705920.png)

### Thread 类的常用方法

| 方法名                                              | 说明 |
| ---                                                 | --- |
| public void start()                                 | 启动线程 |
| public void run()                                   | 线程的执行体 |
| public static void sleep(long millis)               | 线程休眠 |
| public final void join()                            | 等待线程终止 |
| public final void setPriority(int newPriority)      | 设置线程的优先级 |
| public final void setName(String name)              | 设置线程的名称 |
| public final String getName()                       | 获取线程的名称 |
| public static Thread currentThread()                | 获取当前线程 |

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412111715468.png)

### 线程安全问题

* **线程安全问题：**
    * 线程安全问题是多线程编程中的一个重要问题，需要特别注意
    * 线程安全问题是指多个线程同时访问共享资源时可能出现的问题
    * 线程安全问题可能导致程序出现异常、数据丢失等问题
    * 线程安全问题可以通过加锁、使用线程安全的集合等方式解决

**示例：**

小明和小红同时在同一个账户中取钱，账户余额可能为负数

**Account 类**
```Java
public class Account {
    private double money;

    public Account() {
    }

    public Account(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void drawMoney(int i) {
            if (money < i) {
                System.out.println(Thread.currentThread().getName() + "余额不足，取款失败");
                return;
            }
            System.out.println(Thread.currentThread().getName()+ "取款"+i+"元");
            money -= i;
            System.out.println(Thread.currentThread().getName()+ "取款成功，余额"+money+"元");
    }
}

```

**DrawThread 类**
```Java
public class DrawThread extends Thread{

    private Account account;

    public DrawThread(Account account,String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        account.drawMoney(100000);
    }
}
```

**Test 类**
```Java
public class Test {
    public static void main(String[] args) {
        Account acc = new Account(100000);
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();

    }
}
```

**结果：**
```Java
小明取款100000元
小红取款100000元
小明取款成功，余额0.0元
小红取款成功，余额-100000.0元
```

**解决方法：**

* **加锁：**
    * 加锁是解决线程安全问题的一种常用方式
    * 加锁可以保证同一时刻只有一个线程访问共享资源
    * 加锁可以使用synchronized关键字实现

#### 同步化方法

**Account 类**
```Java
public synchronized void drawMoney(int i) {
            if (money < i) {
                System.out.println(Thread.currentThread().getName() + "余额不足，取款失败");
                return;
            }
            System.out.println(Thread.currentThread().getName()+ "取款"+i+"元");
            money -= i;
            System.out.println(Thread.currentThread().getName()+ "取款成功，余额"+money+"元");
    }
```

#### 同步化代码块

**Account 类**
```Java
public void drawMoney(int i) {
    synchronized (this) {
        if (money < i) {
            System.out.println(Thread.currentThread().getName() + "余额不足，取款失败");
            return;
        }
        System.out.println(Thread.currentThread().getName()+ "取款"+i+"元");
        money -= i;
        System.out.println(Thread.currentThread().getName()+ "取款成功，余额"+money+"元");
    }
}
```

#### lock 锁

需要使用try-catch-finally 释放锁

**Account 类**
```Java
public void drawMoney(int i) {
    lock.lock();
    try {
        if (money < i) {
            System.out.println(Thread.currentThread().getName() + "余额不足，取款失败");
            return;
        }
        System.out.println(Thread.currentThread().getName()+ "取款"+i+"元");
        money -= i;
        System.out.println(Thread.currentThread().getName()+ "取款成功，余额"+money+"元");
    } finally {
        lock.unlock();
    }
}
```

### 线程通信

* **线程通信：**
    * 线程通信是多线程编程中的一个重要问题，需要特别注意
    * 线程通信是指多个线程之间的协作，通过协作可以实现线程之间的数据交换
    * 线程通信可以通过wait、notify、notifyAll等方法实现

**示例：**
有三个厨师和两个吃货，厨师每次做一个汉堡，吃货每次吃一个汉堡，当汉堡数量为0时，厨师开始做汉堡，吃货等待，当汉堡数量为1时，吃货开始吃汉堡，厨师等待

**Desk 类**
```Java
public class Desk {
    private List&lt;String&gt; list = new ArrayList&lt;&gt;();

    // 放1个包子的方法
    // 厨师1 厨师2 厨师3
    public synchronized void put() {
        try {
            String name = Thread.currentThread().getName();
            // 判断是否有包子。
            if(list.size() == 0){
                list.add(name + "做的肉包子");
                System.out.println(name + "做了一个肉包子~~");
                Thread.sleep(2000);

                // 唤醒别人, 等待自己
                this.notifyAll();
                this.wait();
            }else {
                // 有包子了，不做了。
                // 唤醒别人, 等待自己
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 吃货1 吃货2
    public synchronized void get() {
        try {
            String name = Thread.currentThread().getName();
            if(list.size() == 1){
                // 有包子，吃了
                System.out.println(name  + "吃了：" + list.get(0));
                list.clear();
                Thread.sleep(1000);
                this.notifyAll();
                this.wait();
            }else {
                // 没有包子
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

**Test 类**
```Java
public class ThreadTest {
    public static void main(String[] args) {
        //   需求：3个生产者线程，负责生产包子，每个线程每次只能生产1个包子放在桌子上
        //      2个消费者线程负责吃包子，每人每次只能从桌子上拿1个包子吃。
        Desk desk  = new Desk();

        // 创建3个生产者线程（3个厨师）
        new Thread(() -&gt; {
            while (true) {
                desk.put();
            }
        }, "厨师1").start();

        new Thread(() -&gt; {
            while (true) {
                desk.put();
            }
        }, "厨师2").start();

        new Thread(() -&gt; {
            while (true) {
                desk.put();
            }
        }, "厨师3").start();

        // 创建2个消费者线程（2个吃货）
        new Thread(() -&gt; {
            while (true) {
                desk.get();
            }
        }, "吃货1").start();

        new Thread(() -&gt; {
            while (true) {
                desk.get();
            }
        }, "吃货2").start();
    }
}
```

## 线程池

* **线程池：**
    * 线程池是Java中的一个重要的特性，用来管理线程
    * 线程池可以重复利用线程，减少线程的创建和销毁
    * 线程池可以控制线程的数量，防止线程过多导致系统资源耗尽
    * 线程池可以提高程序的运行效率，提高程序的响应速度

### ThreadPoolExecutor 构造器 

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412122006693.png)

### ExecutorSerive 线程池的常用方法

| 方法名                                              | 说明 |
| ---                                                 | --- |
| public Future<?> submit(Callable task)               | 提交一个Callable任务,用于获取线程返回的结果 |
| public void execute(Runnable command)                | 提交一个Runnable任务 |
| public void shutdown()                               | 关闭线程池 |
| public List<Runnable> shutdownNow()                  | 关闭线程池，立即关闭 |

**示例：**

**Test 类**
```Java
public class Test {
    public static void main(String[] args) {
        // 创建线程池
        ExecutorService pool = new ThreadPoolExecutor(3,5,8,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(4),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        // 线程池核心线程数3，最大线程数5，线程空闲时间8秒，阻塞队列容量4，线程工厂，拒绝策略

        // 创建Runnable接口实现类对象
        MyRunnable myRunnable = new MyRunnable();
        // 线程池核心线程运行
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        // 线程池核心线程运行，将任务放入阻塞队列
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        // 线程池临时线程运行
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        // 拒绝新任务
        pool.execute(myRunnable);
        pool.shutdown();
    }
}
```

**MyRunnable 类**
```Java
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " is running!");
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
```

## 并发 并行

* **并发和并行：**
    * 并发和并行是计算机中的两个重要概念
    * 并发是指多个任务交替执行，多个任务之间有时间片轮转，但因为CPU的速度非常快，所以看起来是同时执行
    * 并行是指多个任务同时执行，多个任务之间没有时间片轮转


## 线程的生命周期    

* **线程的生命周期：**
    * 线程的生命周期是指线程从创建到销毁的整个过程
    * 线程的生命周期包括New、Runnable、Blocked、Waiting、Timed Waiting、Terminated等状态
    * 线程的生命周期是线程的重要概念，了解线程的生命周期有助于更好的控制线程

| 状态                                              | 说明 |
| ---                                               | --- |
| New                                               | 新建状态，线程创建后，还未调用start方法 |
| Runnable                                          | 就绪状态，线程调用start方法后，等待CPU调度 |
| Blocked                                           | 阻塞状态，线程等待锁 |
| Waiting                                           | 等待状态，线程调用wait方法后，等待其他线程唤醒 |
| Timed Waiting                                     | 限时等待状态，线程调用sleep方法后，等待一定时间 |
| Terminated                                        | 终止状态，线程执行完毕或者调用stop方法后 |

### 线程的6种状态相互转换

**`sleep`方法不会释放锁，`wait`方法会释放锁**

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412130935281.png)

## 乐观锁 线程安全且并行

* **乐观锁：**
    * 乐观锁是一种线程安全的锁，可以保证线程安全且并行
    * 乐观锁可以通过版本号、时间戳等方式实现
    * 乐观锁可以通过CAS（Compare And Swap）算法实现 **原子类**
    * 一开始不上锁，在出现线程安全问题时，重新获取版本号，再进行计算


**不加锁的情况下，多线程并发操作会出现数据不一致的情况**

**Test 类**
```Java
public class Test {
    public static void main(String[] args) {
        MyRunnable target = new MyRunnable();

        for (int i = 0; i < 100; i++) {
            new Thread(target).start();
        }
    }
}
```

**MyRunnable 类**
```Java
public class MyRunnable implements Runnable{
    private int count;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + ++count
            );
        }
    }
}
```

**结果：**
```Shell
Thread-68 9985
Thread-91 9973
Thread-91 9986
Thread-91 9987
Thread-91 9988
Thread-91 9989
Thread-91 9990
Thread-91 9991
Thread-91 9992
Thread-91 9993
Thread-91 9994
Thread-91 9995
Thread-91 9996
Thread-91 9997   // 没有计算到10000 
```

**使用乐观锁解决**

**原理：**

incrementAndGet()方法是原子操作,当线程调用incrementAndGet()方法时，如果计算后的版本号与原本的不一致，会重新获取版本号，再进行计算。


**Test 类**
```Java
public class MyRunnable implements Runnable{
    // 使用原子类
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + count.incrementAndGet());
        }
    }
}
```

## 网络通信

* **网络通信：**
    * 网络通信是Java中的一个重要的特性，用来实现网络通信
    * 网络通信可以实现客户端和服务器之间的通信
    * 网络通信可以实现数据的传输、文件的传输等
    * 网络通信可以使用Socket、ServerSocket等类实现

### InetAddress 类

* **InetAddress：**
    * InetAddress是Java中的一个类，用来表示IP地址
    * InetAddress可以获取本机IP地址、主机名、远程主机IP地址等
    * InetAddress可以通过getByName方法获取InetAddress对象

| 方法名                                              | 说明 |
| ---                                                 | --- |
| public static InetAddress getLocalHost()            | 获取本机IP地址 |
| public static InetAddress getByName(String host)    | 获取远程主机IP地址 |
| public String getHostName()                         | 获取主机名 |
| public String getHostAddress()                      | 获取IP地址 |
| public boolean isReachable(int timeout)             | 判断主机是否可达 |

**示例：**

**Test 类**
```Java
public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());

        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());
        System.out.println(ip2.isReachable(6000));
    }
}
```

### UDP 与 TCP

* **UDP 与 TCP：**
    * UDP（User Datagram Protocol）是一种无连接的协议，数据包大小限制在64KB以内
    * UDP适用于实时性要求高的场景，如视频、音频等
    * TCP（Transmission Control Protocol）是一种面向连接的协议，数据包大小没有限制
    * TCP适用于数据传输要求高的场景，如文件传输、邮件传输等

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412131118841.png)
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412131120029.png)

### **UDP 通信**

* **UDP 通信：**
    * UDP通信是一种无连接的通信方式，数据包大小限制在64KB以内
    * UDP通信适用于实时性要求高的场景，如视频、音频等
    * UDP通信可以使用DatagramSocket、DatagramPacket等类实现

**DatagramSocket 类**

| 方法名                                              | 说明 |
| ---                                                 | --- |
| public void send(DatagramPacket p)                  | 发送数据包 |
| public void receive(DatagramPacket p)               | 接收数据包 |
| public void close()                                 | 关闭套接字 |

**DatagramPacket 类**

| 方法名                                              | 说明 |
| ---                                                 | --- |
| public DatagramPacket(byte[] buf, int length)       | 创建发送数据包 |
| public DatagramPacket(byte[] buf, int length, InetAddress address, int port) | 创建接受数据包 |
| public byte[] getData()                             | 获取数据 |
| public int getLength()                              | 获取数据长度 |
| public InetAddress getAddress()                     | 获取IP地址 |
| public int getPort()                                | 获取端口号 |

**示例：**

**一发一收 UDP 通信**


**Server 类**
```Java
public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket =  new DatagramSocket(7777);

        byte[] receiveData = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(receiveData, receiveData.length);

        // 接受一次数据
        socket.receive(packet);
        int len = packet.getLength();
        System.out.println(new String(receiveData, 0, len));
        System.out.println(packet.getAddress().getHostAddress());
        // 获取发送端的端口号
        System.out.println(packet.getPort());

        socket.close();
    }
}
```

**Client 类**
```Java
public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket client = new DatagramSocket(6789);

        byte[] data = "Hello, I'm Client".getBytes();
        DatagramPacket packet = new DatagramPacket(data,data.length, InetAddress.getLocalHost(),7777);

        client.send(packet);

        client.close();
        System.out.println("Client has sent the message");
    }
}
```

**多发多收 UDP 通信**

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412131302932.png)

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412131302129.png)

### Tcp 通信

* **TCP 通信：**
    * TCP通信是一种面向连接的通信方式，数据包大小没有限制
    * TCP通信适用于数据传输要求高的场景，如文件传输、邮件传输等
    * TCP通信可以使用Socket、ServerSocket等类实现

**Socket 类** ：客户端

| 方法名            | 说明 |
| ---               | --- |
| public OutputStream getOutputStream() | 获取输出流 |
| public InputStream getInputStream()   | 获取输入流 |
| public Socket(String host, int port)  | 创建Socket对象 |

**ServerSocket 类** ：服务器端

| 方法名            | 说明 |
| ---               | --- |
| public Socket accept() | 接受客户端连接 |

#### **一对一 多发多收 TCP 通信**

**Server 类**
```Java
public class Server {
    public static void main(String[] args) throws Exception {
        // 1. 创建ServerSocket对象,同时指定端口号
        ServerSocket serversocket = new ServerSocket(8888);
        // 2. 调用accept方法，接受客户端的请求
        Socket socket = serversocket.accept();
        // 3. 通过socket对象获取输入流
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        while (true) {
            try {
                String str = dis.readUTF();
                System.out.println(str);
                System.out.println("-----------------");
            } catch (Exception e) {
                // CLient断开连接时，会抛出EOFException,可以作为断开连接的标志
                System.out.println(socket.getRemoteSocketAddress()+"已断开连接");
                dis.close();
                socket.close();
                break;
            }
        }
    }
}
```

**Client 类**
```Java
public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("Localhost", 8888);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("请输入：");
            String str = sc.nextLine();
            if("exit".equals(str))
            {
                System.out.println("客户端退出！");|
                dos.close();
                socket.close();
                break;
            }
            dos.writeUTF(str);
            dos.flush();

        }
    }
}
```

#### **多对一 多发多收 TCP 通信**

**主线程接受客户端请求，利用线程池创建子线程处理客户端请求**

**Server 类**
```Java
public class Server {
    public static void main(String[] args) throws Exception {
        // 1. 创建ServerSocket对象,同时指定端口号
        ServerSocket serversocket = new ServerSocket(8888);
        // 创建线程池
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS, new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        // 2. 调用accept方法，接受客户端的请求
        Socket socket = null;
        while (true) {
            socket = serversocket.accept();
            ServerReaderThread srt = new ServerReaderThread(socket);
            pool.execute(srt);
        }

    }
}
```

**ServerReaderThread 类**
```Java
public class ServerReaderThread extends Thread {

    Socket socket;
    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // 3. 通过socket对象获取输入流
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println(socket.getRemoteSocketAddress()+"已连接");
            while (true) {
                try {
                    String str = dis.readUTF();
                    System.out.println(str);
                    System.out.println("-----------------");
                } catch (Exception e) {
                    // CLient断开连接时，会抛出EOFException,可以作为断开连接的标志
                    System.out.println(socket.getRemoteSocketAddress()+"已断开连接");
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
```

**Client 类**
```Java
public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("Localhost", 8888);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("请输入：");
            String str = sc.nextLine();
            if("exit".equals(str))
            {
                System.out.println("客户端退出！");
                dos.close();
                socket.close();
                break;
            }
            dos.writeUTF(str);
            dos.flush();

        }
    }
}
```

#### **多对多（群聊） 多发多收 TCP 通信**

**原理：**

* `Server`端用`onlineSocket`保存所有**活跃的**`Client`端的`Socket`对象
* `ServerReaderThread`线程接受到`Client`端的消息后，将消息通过`onlineSocket`转发给所有`client`端
* `Client`端用`ClientReaderThread`线程接受`server`端的消息

**Server 类**
```Java
public class Server {
    public static Socket socket;
    public static List<Socket> onlineSocket = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        // 1. 创建ServerSocket对象,同时指定端口号
        ServerSocket serversocket = new ServerSocket(8888);
        // 创建线程池
        ExecutorService pool = new ThreadPoolExecutor(5, 8, 8, TimeUnit.SECONDS, new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        // 2. 调用accept方法，接受客户端的请求

        while (true) {
            socket = serversocket.accept();
            ServerReaderThread srt = new ServerReaderThread(socket);
            pool.execute(srt);
            onlineSocket.add(socket);
        }

    }
}
```

**ServerReaderThread 类**
```Java
public class ServerReaderThread extends Thread {

    Socket socket;
    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // 3. 通过socket对象获取输入流
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println(socket.getRemoteSocketAddress()+"已连接");
            while (true) {
                try {
                    String str = dis.readUTF();
                    System.out.println(str);
                    SendMSGToAll(str);
                    System.out.println("-----------------");
                } catch (Exception e) {
                    // CLient断开连接时，会抛出EOFException,可以作为断开连接的标志
                    System.out.println(socket.getRemoteSocketAddress()+"已断开连接");
                    Server.onlineSocket.remove(socket);
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void SendMSGToAll(String str) {
        for (Socket socket1 : Server.onlineSocket) {
            try {
                OutputStream os = socket1.getOutputStream();
                DataOutputStream dos = new DataOutputStream(os);
                dos.writeUTF(str);
                dos.flush();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
}
```

**Client 类**
```Java
public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("Localhost", 8888);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        ClientReaderThread crt = new ClientReaderThread(socket);
        crt.start();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("请输入：");
            String str = sc.nextLine();
            if("exit".equals(str))
            {
                System.out.println("客户端退出！");
                dos.close();
                socket.close();
                break;
            }
            dos.writeUTF(str);
            dos.flush();

        }
    }
}
```

**ClientReaderThread 类**
```Java
public class ClientReaderThread extends Thread {
    Socket socket;

    public ClientReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // 3. 通过socket对象获取输入流
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println("自己已连接");
            while (true) {
                try {
                    String str = dis.readUTF();
                    System.out.println(str);
                    System.out.println("-----------------");
                } catch (Exception e) {
                    // CLient断开连接时，会抛出EOFException,可以作为断开连接的标志
                    System.out.println("自己断开连接");
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
```

#### BS 通信

* **BS 通信：**
    * BS（Browser Server）通信是一种基于浏览器和服务器的通信方式
    * BS通信可以实现浏览器和服务器之间的通信
    * BS通信可以实现数据的传输、文件的传输等

**示例：**

**Server 类**
```Java
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8888);
        ExecutorService pool = new ThreadPoolExecutor(32, 32, 8, TimeUnit.SECONDS, new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        while(true)
        {
            Socket socket = server.accept();
            System.out.println(socket.getRemoteSocketAddress()+"连接成功");
            ServerReaderThread srt = new ServerReaderThread(socket);
            pool.execute(srt);
        }
    }
}
```

**ServerReaderThread 类**
```Java
public class ServerReaderThread implements Runnable{
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=utf-8");
            ps.println();
            ps.println("<div style='color:red;font-size:120px;text-align:center'>Hello World!</div>");

            socket.close();
            ps.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
```

## Junit 单元测试

* **Junit：**
    * Junit是Java中的一个单元测试框架，用来测试Java程序的正确性
    * Junit可以通过注解@Test标记测试方法
    * Junit可以通过断言方法assertEquals、assertTrue等判断测试结果是否正确
    * Junit可以通过@Before、@After等注解标记测试方法的执行顺序

**示例：**

**StringUtil 类**
```Java
public class StringUtil {
    public static String reverse(String str) {
//        if(str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }
}
```

**StringUtilTest 类**
```Java
public class StringUtilTest {

    @Test
    public void testReverse() {
        String res = StringUtil.reverse("happy");
        String a = StringUtil.reverse(null); // 没有处理null的情况 会报错
        System.out.println(res);
        Assert.assertEquals("有误！", "yppah", res);
    }
}
```

### Junit 常用注解

| 注解                                              | 说明 |
| ---                                               | --- |
| @Test                                             | 标记测试方法 |
| @Before                                           | 标记在测试方法之前执行 |
| @After                                            | 标记在测试方法之后执行 |
| @BeforeClass                                      | 标记在测试类之前执行 |
| @AfterClass                                       | 标记在测试类之后执行 |
| @Ignore                                           | 标记测试方法忽略 |

### Junit 常用断言方法

| 方法                                              | 说明 |
| ---                                               | --- |
| assertEquals(expected, actual)                     | 判断两个对象是否相等 |
| assertNotEquals(unexpected, actual)               | 判断两个对象是否不相等 |
| assertTrue(condition)                              | 判断条件是否为真 |
| assertFalse(condition)                             | 判断条件是否为假 |
| assertNull(object)                                 | 判断对象是否为空 |
| assertNotNull(object)                              | 判断对象是否不为空 |

## 反射

* **反射：**
    * 反射是Java中的一个重要特性，可以动态获取类的信息、调用类的方法、创建类的对象等
    * 反射可以实现框架、插件、动态代理等功能
    * 反射可以通过Class类实现，Class类是Java中的一个类，用来表示类的信息

### Class 类

* **Class：**
    * Class是Java中的一个类，用来表示类的信息
    * Class可以获取类的信息、调用类的方法、创建类的对象等
    * Class可以通过类的全限定名、类的对象、类的字节码文件等方式获取

| 方法名                                              | 说明 |
| ---                                                 | --- |
| public static Class<?> forName(String className)    | 根据类的全限定名获取Class对象 |
| public Constructor<?> getConstructor(Class<?>... parameterTypes) | 获取指定参数类型的构造方法 |
| public Method getMethod(String name, Class<?>... parameterTypes) | 获取指定参数类型的方法 |
| public Field getField(String name)                  | 获取指定名称的属性 |
| public Object newInstance()                         | 创建类的对象 |
| public Object invoke(Object obj, Object... args)    | 调用类的方法 |



### **获取Class对象的方式：**
* 通过类名.class方式
* 通过Class的静态方法forName(String className)
* 通过对象的getClass()方法

**示例：**

**Test 类**
```Java
public class Test1Class {
    public static void main(String[] args) throws Exception {
        // 1.通过.class方式
        Class c1 = Student.class;
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        // 2.调用Class的静态方法：forName(String className)
        Class c2 = Class.forName("com.liu.reflect.Student");
        System.out.println(c2.getName());

        // 3.通过对象的getClass()方法
        Student s1 = new Student();
        Class c3 = s1.getClass();
        System.out.println(c3.getName());
    }
}
```

### **反射获取构造器对象并使用**

注意： 
* **``getDeclaredConstructor()``** 获取所有构造器，包括私有构造器
* **``setAccessible(true)``** 设置为true，可以访问私有构造器
* **``newInstance()``** 创建对象

**Test 类**
```Java
public class Test2Constructor {
    @Test
    public void testGetConstructor() throws Exception {
        Class c =  Cat.class;
        Constructor constructor = c.getDeclaredConstructor();
        // 禁止检查访问权限
        constructor.setAccessible(true);
        Cat cat =  (Cat) constructor.newInstance();
        System.out.println(cat);
    }
}
```
**Cat 类**
```Java
public class Cat {
    private String name;
    private int age;

    private Cat() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

### **反射获取方法对象并使用**

* 与构造器类似，通过``getDeclaredMethod()``获取方法对象，通过``invoke()``调用方法
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412141636964.png)

### **反射获取属性对象并使用**

* 通过``getField()``获取属性对象，通过``setAccessible(true)``设置为true，可以访问私有属性
* 通过``get()``获取属性值，通过``set()``设置属性值
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412141637029.png)

### 反射应用 ： 框架 获取对象的所有成员变量写入文件

**Test 类**
```Java
public class Test3Frame {
    @Test
    public void testObjectFrame() throws Exception {
        Student student = new Student("UESTC", "liu", 20,"男");
        Cat cat = new Cat("Tom", 3);

        ObjectFrame.saveObject(student);
        ObjectFrame.saveObject(cat);
        }
}
```

**ObjectFrame 类**
```Java
public class ObjectFrame {
    public static void saveObject(Object obj) throws Exception {
        System.out.println("保存对象：" + obj);
        PrintStream ps = new PrintStream
                (new FileOutputStream("D:\\JavaProjects\\Javapromax\\JavaPractice\\junit-reflect\\src\\com\\liu\\reflect\\obj.txt",true));

        Class c1 = obj.getClass();
        String cName = c1.getSimpleName();
        ps.println("---------------" + cName+"----------------");

        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
            String val = field.get(obj) + "";
            ps.println(name + "=" + val);

        }
        ps.close();

    }
}
```

**输出文件 obj.txt**
```Shell
---------------Student----------------
school=UESTC
name=liu
age=20
sex=男
---------------Cat----------------
name=Tom
age=3
```


## 注解

* **注解：**
    * 注解是Java中的一个重要特性，用来标记类、方法、变量等
    * 注解可以通过@符号标记，如@Override、@Test等
    * 注解可以通过元注解@Target、@Retention等实现
    * 注解可以通过反射获取注解信息

### **自定义注解**

* **自定义注解：**
    * 自定义注解可以通过@interface关键字定义
    * 自定义注解可以通过元注解@Target、@Retention等实现
    
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412151747850.png)

* **注解的原理** 
    * 注解本质上是一个接口，继承Annotation接口  
    * 注解的属性本质上是接口的抽象方法
    * 注解的属性可以有默认值，可以通过default关键字指定
    * 注解的属性可以是基本数据类型、String、枚举、注解、数组等

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412151752674.png)

### **元注解**

* **元注解：**
    * 元注解是Java中的一个重要特性，用来标记注解的注解
    * 元注解可以通过@Target、@Retention等实现
    * 元注解可以通过ElementType、RetentionPolicy等指定注解的作用范围、生命周期等

| 元注解                                              | 说明 |
| ---                                                 | --- |
| @Target(ElementType.TYPE)                            | 标记注解的作用范围 |
| @Retention(RetentionPolicy.RUNTIME)                   | 标记注解的生命周期 |
| @Documented                                         | 标记注解是否包含在JavaDoc中 |
| @Inherited                                          | 标记注解是否可以被继承 |

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412151754780.png)

### **解析注解**

* **解析注解：**
    * 可以通过反射获取注解信息

**示例：**

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412151823670.png)

**MyTest1 类**
```Java
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest1 {
    String value();
    double aaa() default  100;
    String[] bbb();
}
```

**AnnotationTest1 类**
```Java
public class AnnotationTest1 {
    public static void main(String[] args) throws Exception {
        Class<Demo> c = Demo.class;
        // 解析类的全部注解
        Annotation[] a = c.getDeclaredAnnotations();
        for (Annotation annotation : a) {
            System.out.println(annotation);
        }
        // 解析类中test1方法的注解
        Method test1 = c.getDeclaredMethod("test1");

        Annotation[] test1Annotation = test1.getDeclaredAnnotations();
        for (Annotation annotation : test1Annotation) {
            System.out.println(annotation);
        }
    }
}
```

**Demo 类**
```Java
@MyTest1(value = "sss",bbb={"ss","111"})
public class Demo {
    @MyTest1(value = "sds",bbb={"s12","444"})
    public void test1() {
        System.out.println("test1");
    }
}
```

### **注解的应用**

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412151830016.png)

**MyTest 类**
```Java
public class Test {
    @MyTest
    public void test1() {
        System.out.println("test1");
    }

    public void test2() {
        System.out.println("test2");
    }
    @MyTest
    public void test3() {
        System.out.println("test3");
    }
    @MyTest
    public void test4() {
        System.out.println("test4");
    }

    public static void main(String[] args) throws Exception {
        Class<Test> testClass = Test.class;
        Test a = new Test();
        Method[] declaredMethods = testClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if(declaredMethod.isAnnotationPresent(MyTest.class))
                    declaredMethod.invoke(a);
        }
    }
}
```

## 动态代理

* **动态代理：**
    * 动态代理是Java中的一个重要特性，用来实现AOP、RPC等功能
    * 动态代理可以通过Proxy类实现
    * 动态代理可以通过InvocationHandler接口实现

newProxyInstance()方法的参数：
* ClassLoader loader：类加载器
* Class<?>[] interfaces：接口数组
* InvocationHandler h：实现InvocationHandler接口的代理类


**示例：**
* **BigStar 类**：被代理类
* **Star 类**：接口
* **ProxyUtil 类**：代理类
* **Test 类**：测试类



**BigStar 类**
```Java
public class BigStar implements Star {
    public BigStar(String name) {
        this.name = name;
    }

    private String name;

    public String sing() {
        System.out.println(name + " is singing");
        return "感谢大家！";
    }

    public void dance() {
        System.out.println(name + " is dancing");
    }
}
```

**Star 类**
```Java
public interface Star {
    String sing();
    void dance();
}
```

**ProxyUtil**
```Java
public class ProxyUtil {
    public static Star createProxy(BigStar bigStar) {
        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{Star.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("sing")) {
                    System.out.println("代理人谈合同");
                } else if (method.getName().equals("dance")) {
                    System.out.println("代理人收钱");
                }
                return method.invoke(bigStar, args);
            }
        });
        return starProxy;
    }
}
```

**Test 类**
```Java
public class Test {
    public static void main(String[] args) {
        BigStar bigStar = new BigStar("杨超越");
        Star proxy = ProxyUtil.createProxy(bigStar);

        String sing = proxy.sing();
        System.out.println(sing);

        proxy.dance();
    }
}
```

