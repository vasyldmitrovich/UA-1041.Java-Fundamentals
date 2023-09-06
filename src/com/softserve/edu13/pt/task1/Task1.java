package com.softserve.edu13.pt.task1;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

public class Task1 {

    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();

        System.out.println("Today is " + time.getDayOfWeek());

        System.out.println("First Monday of current month:" + time.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));

        System.out.println("=".repeat(10));

        List<String> fruits = new ArrayList<>(List.of("banana",
                "kiwi",
                "orange",
                "peach",
                "apple",
                "avocado",
                "strawberry"));

        System.out.println("Before sorting: " + fruits);
        sort(fruits);
        System.out.println("After sorting: " + fruits);

        System.out.println("=".repeat(10));

        int[] numbers = {3, 5, 6, 10, 15, 16, 18, 19, 20};

        System.out.println("Count of odd: " + count(numbers, i -> i % 2 == 1));
        System.out.println("Count of bigger than 10: " + count(numbers, i -> i > 10));
    }

    public static void sort(List<String> strings) {
        strings.sort(String::compareTo);
    }


    public static int count(int[] numbers, IntPredicate condition) {

        int counter = 0;

        for (int i : numbers) {
            if (condition.test(i)) {
                counter++;
            }
        }

        return counter;
    }
}
