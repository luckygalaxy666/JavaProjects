package com.liu.interface_prac;

import java.util.ArrayList;

public class AImpl2 implements A {
    @Override
    public void printInfo(ArrayList<Student> students) {
        int malecount = 0;
        int femalecount = 0;
        for (Student student : students) {
            System.out.println(student);
            if (student.getSex() == '男')
                malecount++;
            else
                femalecount++;

        }
        System.out.println("男生数量：" + malecount);
        System.out.println("女生数量：" + femalecount);;
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double sum = 0;
        int minScore = students.get(0).getScore();
        int maxScore = students.get(0).getScore();
        for (Student student : students) {
            sum += student.getScore();
            if (student.getScore() < minScore)
                minScore = student.getScore();
            if (student.getScore() > maxScore)
                maxScore = student.getScore();
        }
        System.out.println("Average score: " +(sum - minScore - maxScore) / (students.size() -2));

    }
}
