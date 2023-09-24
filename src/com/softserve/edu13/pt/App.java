package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class App {
    public static void main(String[] args) {
        // Task a
        // Show which today is a day of a week
        System.out.println("Task a");

        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.forLanguageTag("uk-ua")));
        System.out.println();

        // Task b
        // Show a date of first Monday for current month
        System.out.println("Task b");
        var month = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(month);
        System.out.println();

        // Task c
        // Write a method for sorting list of Strings using Java 8
        System.out.println("Task c");
        List<String> st = new ArrayList<>(Arrays.asList("sdf", "fgjs", "sdfds"));
        System.out.println("Array: " + st);
        st.sort(Comparator.naturalOrder());
        System.out.println("Sort array" + st);
        System.out.println();

        // Task d
        // Create array Integers which has 10 elements, create method count() that takes an array
        //of integers as the first parameter and functional interface as the second parameter,
        //that functional interface works with integers and defines a condition. Method count()
        //return count of elements in array that satisfy the condition defined by the second argument
        System.out.println("Task d");
        int[] arr = Task_d.getRandom();
        System.out.println("Array");
        System.out.println(Arrays.toString(arr));
        System.out.println(Task_d.count(arr, i -> true));
        System.out.println("Condition 1");
        System.out.println(Task_d.count(arr, i -> i > 0));
        System.out.println("Condition 2");
        System.out.println(Task_d.count(arr, i -> i % 2 == 0));
        System.out.println("Condition 3");
        System.out.println(Task_d.count(arr, i -> i <= 0));
    }
}
