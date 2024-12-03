package com.liu.interfaceTest;

/**
    接口： 特殊的抽象类
    一个类可以实现多个接口
    实现类必须重写接口中的所有方法，或者定义为抽象类
 */
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
