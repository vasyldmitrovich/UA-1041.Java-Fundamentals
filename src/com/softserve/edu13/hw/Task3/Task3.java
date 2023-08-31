package com.softserve.edu13.hw.Task3;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        var scaner=new Scanner(System.in);
        System.out.println("Enter a year: ");
        var year=scaner.nextInt();
        System.out.println(isLeapYear(year));
    }
    public static boolean isLeapYear(int year) {
        return LocalDate.ofYearDay(year, 1).isLeapYear();
    }
}
