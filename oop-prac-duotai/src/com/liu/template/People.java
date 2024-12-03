package com.liu.template;

/**
 模板设计模式
 */
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
