package com.liu.enum_test;

import com.liu.inner_class1.Outer;

import java.util.ArrayList;

/**
 * 枚举类
 * 作用：限制变量的取值范围
 * 做信息标志和分类
 */
public class Test {

    public static void main(String[] args) {
        check(Constant.BOY);
        System.out.println("------------");
        //check(Constant.Gr); // 报错 只能输入枚举类中的值
        check(Constant.GIRL);

    }
    public static void  check(Constant constant) {
        switch (constant) {
            case BOY:
                System.out.println("男生");
                break;
            case GIRL:
                System.out.println("女生");
                break;
            default:
                System.out.println("未知");
                break;
        }
    }
}
