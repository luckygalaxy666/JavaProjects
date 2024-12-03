package com.liu.DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        // 创建DateTimeFormatter对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        // 格式化日期时间
        LocalDateTime ldt = LocalDateTime.now();
        String str = dtf.format(ldt);
        // 也可以用LocalDateTime的format方法
        String str2 =ldt.format(dtf);
        System.out.println(str);
        System.out.println(str2);

        // 解析日期时间
        String str1 = "2021年08月01日 12:12:12";
        LocalDateTime ldt1=  LocalDateTime.parse(str1,dtf);
        System.out.println(ldt1);
    }
}