package com.liu.interface_prac;

import java.util.ArrayList;

public class School {
    private ArrayList<Student> students = new ArrayList();

    // 面向接口编程  只需要改变接口的实现类即可
    A a = new AImpl1();
    public void changeMethod(int flag)
    {
        if(flag == 1)
        {
            a = new AImpl1();
        }
        else
        {
            a = new AImpl2();
        }
    }
    public School() {
        students.add(new Student("liu", '男', 100));
        students.add(new Student("zhang", '女', 92));
        students.add(new Student("wang", '女', 80));
        students.add(new Student("zhao", '男', 70));
    }

    public void printInfo() {
        a.printInfo(students);
    }

    public void printAverageScore()
    {
        a.printAverageScore(students);
    }

}
