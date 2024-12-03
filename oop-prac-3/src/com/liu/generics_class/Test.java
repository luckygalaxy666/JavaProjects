package com.liu.generics_class;
/**
 * 泛型类
 *
 */
public class Test {
    public static void main(String[] args) {
        // MyarrayList<> list = new MyArrayList<>();  // 不限制类型

        // 限制类型为String
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Str 1");
        list.add("Str 2");
        System.out.println(list.get(1));


        // 限制泛型类型必须可以继承Animal类
        MyClass<Animal> list2 = new MyClass<>();

        //MyCLass<String> list3 = new MyClass<>(); // 报错
        MyClass<Dog> list3 = new MyClass<>(); // 可以
    }
}
