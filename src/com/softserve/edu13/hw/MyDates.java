package com.softserve.edu13.hw;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class MyDates {
    public static void main(String[] args) {
        printDays(LocalDate.now());
        System.out.print("Is 2023 leap? " + isLeap(Year.now()));
        LocalDate myBirthday = createMyBirthday();
        System.out.println("\nMy birthday in format \"MM.dd.yy\": " + toFormatDate(myBirthday));
    }

    public static String toFormatDate(LocalDate localDate){
        return localDate.format(DateTimeFormatter.ofPattern("MM.dd.yy"));
    }
    public static boolean isLeap(Year year){
        return year.isLeap();
    }

    public static LocalDate createMyBirthday(){
        return LocalDate.of(2003, 6, 14);
    }

    public static void printDays(LocalDate localDate){
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.plusMonths(6).getDayOfWeek());
        System.out.println(localDate.plusMonths(12).getDayOfWeek());
    }
}
