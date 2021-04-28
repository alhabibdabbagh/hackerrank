package com.project.hackerrank.third;

import java.time.LocalDate;

/**
 * @author habib
 * @on 29.04.2021 01:53
 */
public class LocalDateExamples {
    private static LocalDate s;

    public static void main(String[] args) {


        s = LocalDate.of(2000,2,4);
        System.out.println(s.getDayOfYear());
        System.out.println( s.getDayOfWeek().name());
    }

}
