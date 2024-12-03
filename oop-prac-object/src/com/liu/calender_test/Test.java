package com.liu.calender_test;

import java.util.Calendar;

/**
 * 测试Calendar类
 * 可变对象
 */
public class Test {
    public static void main(String[] args) {
        //    Calender calender = new Calender();  // 报错，因为Calendar是抽象类，不能实例化
        Calendar  calender = Calendar.getInstance(); // 获取Calendar对象
        System.out.println(calender);
        // Calender 用常量来记录信息
        System.out.println(Calendar.YEAR); // 1
        System.out.println(calender.get(1)); // 年
        System.out.println(calender.get(Calendar.YEAR));
        // 拿到日历中记录的Date对象
        System.out.println(calender.getTime());
        // 修改日历中的时间
        calender.set(Calendar.YEAR, 2022);
        System.out.println(calender.get(Calendar.YEAR));

        // 为某个字段增加值
        calender.add(Calendar.YEAR, 1);
        System.out.println(calender.get(Calendar.YEAR));
        System.out.println(calender.getTime());
    }


}
