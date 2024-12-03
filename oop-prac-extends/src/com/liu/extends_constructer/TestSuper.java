package com.liu.extends_constructer;

public class TestSuper {
    public static void main(String[] args) {
        // 继承父类构造
        Student student1 = new Student("liu", 18, "school");
        //调用兄弟构造和父类构造
        Student student2 = new Student("liu");
        System.out.println(student1);
        System.out.println(student2);
    }
}
/**
 子类构造方法中可以通过super关键字调用父类的构造方法
 */
class Student extends People {
    private String school;

    public Student(String name)
    {
        this(name,18,"UESTC");
    }
    public Student(String name, int age,String school)
    {
        // 调用父类构造方法 this 和 super 都必须在第一行 同时只能存在一个
        super(name, age);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", school='" + school + '\'' +
                '}';
    }
}
class People
{
    private String name;
    private int age;
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
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


}
