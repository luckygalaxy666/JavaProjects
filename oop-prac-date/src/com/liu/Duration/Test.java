package com.liu.Duration;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Duration类的使用
 * Duration类表示两个瞬时时间之间的时间段，精确到纳秒
 * Duration类提供了多个静态方法来获取Duration对象
 */
public class Test {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2022,1,1,11,11,11);
        LocalDateTime end = LocalDateTime.of(2022,2,3,11,11,12);

        Duration duration = Duration.between(start, end);
        // Duration计算的时间差是向上累计的
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }
}
