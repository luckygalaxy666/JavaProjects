package com.liu.template;

public class Test {
    public static void main(String[] args) {
        // 抽象类不能实例化 只能作为父类被继承
        // People people = new People();
        People p1 = new Student();
        People p2 = new Teacher();
        // 把write（） 写成模板设计模式 节省代码量
        p1.write();
        System.out.println("------------");
        p2.write();
    }
}
