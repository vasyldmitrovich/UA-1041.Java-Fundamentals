package com.softserve.edu13.hw.Task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("MM.dd.yy");
        System.out.println(dateTimeFormatter.format(LocalDate.now()));

//        var today=dateTimeFormatter.parse(dateTimeFormatter.format(LocalDate.now()),LocalDate::from);
//        System.out.println(today);
    }
}
