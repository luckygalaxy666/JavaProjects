package com.liu.singlestance;
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
