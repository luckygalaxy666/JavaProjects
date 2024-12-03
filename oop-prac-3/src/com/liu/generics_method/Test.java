package com.liu.generics_method;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new BMW());
        cars.add(new Benz());

        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());

        ArrayList<Benz> benzs = new ArrayList<>();
        benzs.add(new Benz());
        benzs.add(new Benz());
        // 不会报错
        // BMW Benz继承Car 所以可以传入
        // 注意 BMW 继承 Car 但是 ArrayList<BMW> 不继承 ArrayList<Car>
        //go1(bmw); // 报错
        go(cars);
        go(bmws);
        go(benzs);

         ArrayList<Dog> dogs = new ArrayList<>();
         dogs.add(new Dog());
         dogs.add(new Dog());
         // Dog 不继承Car 所以不能传入
//        go(dogs); // 报错
    }

//    public static<T extends Car> void go(ArrayList<T> cars) {
//    }
    // 可以简化
    // ? 通配符
// ? extends Car 表示可以传入Car的子类   ? super Car 表示可以传入Car的父类
    public static void go(ArrayList<? extends Car> cars) {
    }
    public static void go1(ArrayList<Car> cars) {
    }
}
