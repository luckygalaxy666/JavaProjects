package com.liu.override_clone;

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
