package com.liu.inner_class1;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        // 创建内部类对象 需要先创建外部类对象
        Outer.Inner inner = outer.new Inner();
        inner.show();
        inner.getAge();
    }

}
