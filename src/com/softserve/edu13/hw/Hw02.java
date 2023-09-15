package com.softserve.edu13.hw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Hw02 {
    public static void dateFormat (TemporalAccessor date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        var format = formatter.format(date);
        System.out.println("After formatting: " + format);

    }
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Before formatting: " + date);
        dateFormat(date);
    }
}
