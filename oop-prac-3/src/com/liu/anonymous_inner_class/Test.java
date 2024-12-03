package com.liu.anonymous_inner_class;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();
        // 使用子类重写父类方法
        animal.cry();

        // 使用匿名内部类
        // 本质就是创建一个匿名子类 但是 可以在创建对象时直接重写方法
        Animal animal2 = new Animal() {
            @Override
            public void cry() {
                System.out.println("狗叫");
            }
        };
        animal2.cry();

        // 匿名内部类的应用
        // 作为参数 传递给方法
//        Swimming s1 = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("小鱼游泳");
//            }
//        };
//        go(s1);
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("小狗游泳");
            }
        });
        // 当接口中只有一个方法时 且方法需要参数时， 可以使用lambda表达式
        // 核心目的 用匿名类简化代码
        go( s -> System.out.println("小鸟飞行"));

    }
    public static void go(Swimming s) {
        s.swim();
    }

    public static void go(Flying f) {
        int a = 10;
        f.fly(a);
    }

}
