package com.liu.base;

public class Student extends People {
    @Override
    public void run() {
        System.out.println("Student run");
    }
    public void study() {
        System.out.println("Student study");
    }
}
