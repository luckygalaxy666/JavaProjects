package com.liu.array_01;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.function.IntToDoubleFunction;


/**
 * Arrays类
 * 1. 数组是相同数据类型的有序集合
 * 2. 可以用toString()方法打印数组
 * 3. copyOf()方法可以复制数组 并扩充数组长度
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        // 打印的是数组的地址
        System.out.println(arr);
        // 打印数组
        System.out.println(Arrays.toString(arr));
        // 复制数组
        int[] arr1 = Arrays.copyOf(arr, 5); // 复制数组并扩充数组长度
        System.out.println(Arrays.toString(arr1));
        // 修改数组并存进去
        double[] price = {99.8,113,12.5};
        Arrays.setAll(price, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                // value = 0,1,2
                //return price[value]*0.8;
                // 为了防止精度问题 使用BigDecimal
                return BigDecimal.valueOf(price[value]).multiply(BigDecimal.valueOf(0.8)).doubleValue();
            }
        });
        System.out.println(Arrays.toString(price));
        // 对数组排序
        Arrays.sort(price);
        System.out.println(Arrays.toString(price));


    }
}
