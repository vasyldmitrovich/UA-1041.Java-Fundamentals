package com.softserve.edu13.hw.task3;

import java.time.LocalDate;

public class Task3 {


    public static void main(String[] args) {

        int year = LocalDate.now().getYear();

        System.out.println("Year " + year + " is " + (!isLeap(year) ? "not " : "") + "leap");
    }

    public static boolean isLeap(int year) {
        return LocalDate.of(year, 1, 1).isLeapYear();
    }
}
