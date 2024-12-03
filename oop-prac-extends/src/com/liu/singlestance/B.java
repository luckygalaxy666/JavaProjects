package com.liu.singlestance;
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
