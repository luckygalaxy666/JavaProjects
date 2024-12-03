package com.liu.override_equals_toString;

import java.util.Objects;

public class Student {
    public String getName() {
        return name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // 1. 判断是否是同一个对象
        if (this == o) return true;
        // 2. 判断是否是同一个类
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        // 3. 判断属性是否相等
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name ;
    private int  age;
}
