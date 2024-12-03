package com.liu.BigDecimal_test;

import java.math.BigDecimal;

/**
 * 测试BigDecimal类
 * 用于高精度计算
 * 不会丢失精度
 */
public class Test {
    public static void main(String[] args) {
        Double a = 0.01;
        Double b = 0.05;
        System.out.println(a + b); // 0.060000000000000005

        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        System.out.println(a1.add(b1)); // 0.06
        // BigDecimal的加减乘除方法
        System.out.println(a1.add(b1));
        System.out.println(a1.subtract(b1));
        System.out.println(a1.multiply(b1));
        //System.out.println(a1.divide(b1));
        // 除法时，可以指定精度，以及舍入模式  防止不能精确除尽的情况报错
        System.out.println(a1.divide(b1, 2, BigDecimal.ROUND_HALF_UP)); // 0.20 保留两位小数，四舍五入

        // 比较大小
        System.out.println(a1.compareTo(b1)); // -1
        System.out.println(a1.compareTo(a1)); // 0
        System.out.println(b1.compareTo(a1)); // 1

        // 把BigDecimal转换为double
        System.out.println(a1.doubleValue());
    }
}
