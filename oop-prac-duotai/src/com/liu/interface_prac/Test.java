package com.liu.interface_prac;
/**
 *  接口应用案例
 *  灵活切换两种方案
 *  方案1 输出所有学生的个人信息， 输出所有学生的平均分
 *  方案2 输出所有学生的个人信息和男女数量 输出所有学生去掉最高分和最低分的平均分
 */
public class Test {
    public static void main(String[] args) {
        School school = new School();
        school.changeMethod(1);
        System.out.println("方案1");
        school.printInfo();
        school.printAverageScore();

        school.changeMethod(2);
        System.out.println("方案2");
        school.printInfo();
        school.printAverageScore();




        /*
         JDK8 以后接口新特性
         1. 接口中可以有默认方法
         对象的方法
        JDK8NewFeature.showDefault(); // 报错
        */
        B b  = new B();
        b.showDefault();
        /*
         2. 接口中可以有静态方法
         类的方法
        */
        JDK8NewFeature.showStatic();
        // 3. 接口中可以有私有方法
        // JDK8NewFeature.showPrivate(); // 报错
        // private 只能在类中访问 因此需要通过类中其他方法调用
    }
}
