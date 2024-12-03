package com.liu.override_equals_toString;

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
