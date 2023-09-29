package com.softserve.edu13.Homework.task4;

import java.time.DayOfWeek;
import java.time.LocalDate;

import java.time.temporal.TemporalAdjusters;

public class Birthday {
    public static void main(String[] args) {
        LocalDate mybirthday = LocalDate.of(1990,04,01);
        System.out.println(mybirthday);
        printDayofWeek(mybirthday);
        printplusDays(mybirthday);


    }
    public static void printDayofWeek(LocalDate date) {
        DayOfWeek dayofWeek = LocalDate.parse("1990-04-01").getDayOfWeek();
        System.out.println(dayofWeek);

    }
    public static void printplusDays(LocalDate date) {
        LocalDate plusSixM = LocalDate.of(1990,04,01).plusMonths(6);
        LocalDate plusTwelveM = LocalDate.of(1990,04,01).plusMonths(12);
        DayOfWeek SixM = LocalDate.parse("1990-10-01").getDayOfWeek();
        DayOfWeek TwelveM = LocalDate.parse("1991-04-01").getDayOfWeek();
        System.out.println(plusSixM);
        System.out.println(SixM);
        System.out.println(plusTwelveM);
        System.out.println(TwelveM);
    }
}
