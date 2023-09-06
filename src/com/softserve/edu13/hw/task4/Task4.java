package com.softserve.edu13.hw.task4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Task4 {


    public static void main(String[] args) {


        LocalDate birthDay = LocalDate.of(2003, 3, 25);

        System.out.println("Day of the week: " + birthDay.getDayOfWeek());


        System.out.println("Day of the week after six month: " + getDayAfterMonths(birthDay, 6));


        System.out.println("Day of the week after 12 months: " + getDayAfterMonths(birthDay, 12));


    }

    public static DayOfWeek getDayAfterMonths(LocalDate birthDay, int months) {
        return birthDay.plusMonths(months).getDayOfWeek();
    }
}
