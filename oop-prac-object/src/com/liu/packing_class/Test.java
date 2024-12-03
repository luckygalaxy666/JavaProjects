package com.liu.packing_class;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

/**
 * 测试包装类
 * 八大基本数据类型 与 包装类之间的转换
 */
public class Test {
    public static void main(String[] args) {
        // 基本数据类型与包装类之间可以自动装箱与拆箱
        int  a = 10;
        Integer b = 10;
        int c = b; // 不报错

        // toString 将包装类转换为字符串
        System.out.println(b.toString());
        System.out.println(Integer.toString(b));

        // 将字符串转换成包装类
        String str = "123";
        //paserInt()方法将字符串转换成int类型
        // 不常用
        Integer integer = Integer.parseInt(str);
        System.out.println(integer);
        // valueof()方法将字符串转换成Integer类型
        Integer integer1 = Integer.valueOf(str);
        System.out.println(integer1);

    }

}
