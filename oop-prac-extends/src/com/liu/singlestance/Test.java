package com.liu.singlestance;

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
