package com.liu.student;

import java.util.Scanner;

public class GetInfo {
    private Student student = new Student();
    Scanner sc = new Scanner(System.in);
    public void setInfo() {
        System.out.println("请输入学生姓名：");
        String name =sc.next();
        student.setName(name);
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        student.setAge(age);
    }

    public void getInfo() {
        System.out.println("学生姓名：" + student.getName());
        System.out.println("学生年龄：" + student.getAge());
    }
}
