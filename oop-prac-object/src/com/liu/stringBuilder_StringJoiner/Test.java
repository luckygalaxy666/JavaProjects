package com.liu.stringBuilder_StringJoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        // StringBuilder
        // StringBuilder是可变的字符序列，可以对字符串进行修改
        // StringBuilder是线程不安全的，效率高
        // StringBuilder是JDK1.5之后出现的，用于替代StringBuffer
        // StringBuilder的方法和StringBuffer的方法基本一样
        // StringBuilder可以对任意类型进行append操作  而StringJoiner 只能对字符串进行操作

        int[] arr = {1,2,3,4,5};
        System.out.println(getStrByBuilder(arr));
        System.out.println(getStrByJoiner(arr));
    }
    static String getStrByBuilder(int[] arr){
        if (arr == null || arr.length == 0){
            return "";
        }
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]);
            if (i != arr.length - 1){
                str.append(",");
            }
        }
        str.append("]");
        return str.toString();
    }

    static String getStrByJoiner(int[] arr){
        if (arr == null || arr.length == 0){
            return "";
        }
        // StringJoiner的三个参数分别是：分隔符，前缀，后缀
        StringJoiner str = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            // StringJoiner只能对字符串进行操作
            str.add(String.valueOf(arr[i]));
        }
        return str.toString();
    }
}
