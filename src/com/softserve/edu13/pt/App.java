package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;


public class App {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        // Task 1
        System.out.println(date.getDayOfWeek());

        // Task 2
        System.out.println(date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));

        // Task 4
        int[] arr = {1, 3, 4, 6, 2, 8, 10, 3, 7, 3};
        System.out.println(count(arr, i -> i > 4));
        System.out.println(count(arr, i -> i % 2 == 0));
        System.out.println(count(arr, i -> true));
    }

    // Task 3
    public static void sort(List<String> list) {
        list.sort(Comparator.naturalOrder());
    }

    public static int count(int[] arr, IntPredicate condition) {
        int counter = 0;
        for (int i : arr) {
            if (condition.test(i)) counter++;
        }
        return counter;
    }
}
