package com.liu.Runtime_test;

import java.io.IOException;

/**
 * 测试Runtime类
 * Runtime类是一个单例类
 * 代表单个JVM，与操作系统进行交互
*/
public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 单例类 不能创建对象
        Runtime runtime = Runtime.getRuntime(); // 获取Runtime对象
        System.out.println(runtime.availableProcessors()); // 获取处理器数量
        System.out.println(runtime.freeMemory()/1024.0/1024.0 + "MB"); // 获取Java虚拟机空闲内存
        System.out.println(runtime.totalMemory()/1024.0/1024.0 + "MB"); // 获取Java虚拟机总内存

        // 可以执行操作系统命令
        Process p = runtime.exec("D:\\QQNT\\QQ.exe"); // 打开QQ
        Thread.sleep(5000); // 等待5秒
        p.destroy(); // 关闭进程

    }
}
