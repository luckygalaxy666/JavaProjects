package com.liu.Period;

import java.time.LocalDate;
import java.time.Period;

public class Test {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, 1, 1);
        LocalDate end = LocalDate.of(2020, 12, 31);
        Period period = Period.between(start, end);

        System.out.println("相差" + period.getYears() + "年" + period.getMonths() + "月" + period.getDays() + "天");

    }
}
