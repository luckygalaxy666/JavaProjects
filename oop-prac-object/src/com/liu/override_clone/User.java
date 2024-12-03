package com.liu.override_clone;

import java.util.Arrays;
// 使用clone 需要类实现Cloneable接口
public class User implements Cloneable {
    private String name;
    private int age;
    private double[] score;
    private String mode = "shallow";

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    // 重写clone方法
    // 因为clone方法是protected的，所以需要重写
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅拷贝
        if (mode.equals("shallow")) {
            return super.clone();
        }
        else { // 深拷贝
            User user = (User) super.clone();
            // 将引用类型再拷贝一次
            user.score = this.score.clone();
            return user;
        }
    }

    public double[] getScore() {
        return score;
    }

    public void setScore(double[] score) {
        this.score = score;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", score=" + Arrays.toString(score) +
//                '}';
//    }

    public User(String name, int age, double[] score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
