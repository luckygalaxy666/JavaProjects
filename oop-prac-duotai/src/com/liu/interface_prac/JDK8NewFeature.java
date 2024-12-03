package com.liu.interface_prac;

public interface JDK8NewFeature {
    //  默认构造
    default void showDefault() {
        System.out.println("default show");
        showPrivate();
    }

    // 静态方法
    // 接口中的静态方法只能通过接口名调用
    static void showStatic() {
        System.out.println("static show");

    }

    // 私有方法
    // 接口中的私有方法只能在接口中调用
    private void showPrivate() {
        System.out.println("private show");
    }
}
