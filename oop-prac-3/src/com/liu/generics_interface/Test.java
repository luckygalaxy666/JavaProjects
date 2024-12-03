package com.liu.generics_interface;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        StudentData studentData = new StudentData();
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("liu", 18));
        students.add(new Student("zhang", 19));
        System.out.println(studentData.getName(students));

    }
}
