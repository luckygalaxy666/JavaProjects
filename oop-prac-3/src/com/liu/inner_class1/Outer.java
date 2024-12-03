package com.liu.inner_class1;

public class Outer {
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Outer.name = name;
    }

    private int age = 66;
    private static String name = "liu";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
        * 1. 成员内部类
     */
    public class Inner
    {
        private int age = 88;
        public void getAge()
        {
            int age = 99;
            System.out.println("外部类的年龄：" + Outer.this.age);
            System.out.println("内部类的年龄：" + this.age);
            System.out.println("局部变量的年龄：" + age);
        }

        // 内部类可以访问外部类的属性
        // 类似于成员方法
        public void show()
        {
            System.out.println("外部类的名字：" + name);
        }
    }
}
