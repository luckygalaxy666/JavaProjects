
# 目录

<!-- vim-markdown-toc GFM -->

* [override  重写](#override--重写)
* [多态](#多态)
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
    * [* **Stream流的常用方法：**](#-stream流的常用方法)

<!-- vim-markdown-toc -->

## override  重写

* **重写：**
    * 重写是指子类对父类的方法进行重新实现
    * 重写的方法名、参数列表、返回值类型必顿要与父类的方法一致
    * 重写的方法不能比父类的方法权限更低
    * 重写的方法不能比父类的方法抛出更多的异常
    
利用@Override注解可以检查是否重写成功

**重写toString 方法**

IDEA 可以使用ALt + Insert 选择toString方法 自动生成重载方法


## 多态

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

### * **Stream流的常用方法：**

| 方法名                                   | 说明 |
| ---                                      | --- |
| public Stream<T> filter(Predicate<? super T> predicate) | 过滤集合中的元素 |
| public <R> Stream<R> map(Function<? super T, ? extends R> mapper) | 映射集合中的元素 |
| public Stream<T> sorted()                 | 对集合中的元素进行排序 |
| public Stream<T> limit(long maxSize)      | 截取集合中的前N个元素 |
| public Stream<T> skip(long n)             | 跳过集合中的前N个元素 |
| public void forEach(Consumer<? super T> action) | 遍历集合中的元素 |
| public Stream<T> distinct()               | 去除集合中的重复元素 |
| public long count()                       | 统计集合中的元素个数 |
| public Optional<T> findFirst()            | 返回集合中的第一个元素 |
| public Optional<T> findAny()              | 返回集合中的任意一个元素 |
| public T reduce(T identity, BinaryOperator<T> accumulator) | 对集合中的元素进行聚合操作 |
| public <R> R collect(Collector<? super T, A, R> collector) | 将集合中的元素收集到一个容器中 |






