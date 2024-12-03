package com.liu.date;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试日期类
 * Date类的使用
 * SimpleDateFormat类的使用
 */
public class Test {

    public static void main(String[] args) throws ParseException {
        // 创建Date对象 无参构造 创建当前时间
        Date date = new Date();
        System.out.println(date);

        // 创建Date对象 有参构造 创建指定时间  从1970年1月1日 00:00:00开始计算 有参为毫秒数
        Date date1 = new Date(1000);
        System.out.println(date1);

        // 获取当前时间的毫秒数
        System.out.println(date.getTime());

        // 日期格式化
        // SimpleDateFormat类的使用
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        sdt.format(date);
        System.out.println(sdt.format(date));
        // 字符串转日期
        String str = "2021-08-01 12:12:12";
        System.out.println(sdt.parse(str));
    }

}
