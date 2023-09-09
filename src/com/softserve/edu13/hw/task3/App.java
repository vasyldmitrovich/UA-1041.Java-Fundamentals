package com.softserve.edu13.hw.task3;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(isLeap(date));
    }

    public static boolean isLeap(LocalDate date) {
        return date.isLeapYear();
    }
}
