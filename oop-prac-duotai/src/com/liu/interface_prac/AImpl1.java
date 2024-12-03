package com.liu.interface_prac;

import java.util.ArrayList;
/**
 *  实体类
 *  1. 成员变量 是常量
 *  2. 成员方法 是抽象方法
 */
public class AImpl1 implements A {
    @Override
    public void printInfo(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double sum = 0.0;
        for (Student student : students) {
            sum += student.getScore();
        }
        System.out.println("Average score: " + sum / students.size());
    }

}
