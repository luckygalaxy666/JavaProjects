package com.liu.base;
/**
  目标： 认识多态 1. 对象多态 2. 行为多态
 */
public class Test {
    public static void main(String[] args) {

        // 1. 对象多态
        People p1 = new Student();
        People p2 = new Teacher();

        // 2. 行为多态  识别技巧 编译看左边 运行看右边
        // 重写：子类重写了父类的方法  即 多态的前提是要有继承关系和方法重写  关系
        p1.run();
        p2.run();

        distinctiveMethod(p1);
    }
    // 父类类型作为形参
    // 强转为子类类型 调用子类特有方法
    public static void distinctiveMethod(People p) {
        // 公共方法 可以直接调用
        p.run();
        // 子类特有方法 不能直接调用
        // p.study();
        if (p instanceof Student) {
            Student s1 = (Student) p;
            s1.study();
        } else if (p instanceof Teacher) {
            Teacher t1 = (Teacher) p;
            t1.teach();
        }
    }

}
