package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Pt010203 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        // Show which today is a day of a week
        System.out.println("Today is a " + date.getDayOfWeek().toString().toLowerCase());

        //Show a date of first Monday for current month
        var firstMonday = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("Date of first Monday for current month: " + firstMonday);

        //Write a method for sorting list of Strings using Java 8
        List<String> list = new ArrayList<>();
        var rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(rnd.nextInt(-10, 10)));
        }
        System.out.println("Random collection: " + list);
        sort(list);
        System.out.println("Sorted collection: " + list);


    }

    public static void sort(List<String> list) {
        list.sort(Comparator.naturalOrder());
    }
}
