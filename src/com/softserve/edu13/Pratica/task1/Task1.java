package com.softserve.edu13.Pratica.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("a:");
        LocalDate date = LocalDate.now();
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println("b:");
        var firstMonday = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstMonday);
        System.out.println(firstMonday.getDayOfWeek());
        System.out.println("c:");
        int[] nums = {11,15,12,16,36,25,65,38,96,5};
        System.out.println("Print numbers more then 40:");
        System.out.println(count(nums, i -> i > 40));
        System.out.println("Print even numbers:");
        System.out.println(count(nums, i -> i%2 == 0));
        System.out.println("All numbers:");
        System.out.println(count(nums, i -> true));
        List<String> nature = new ArrayList<>();
        nature.add("Flower");
        nature.add("Tree");
        nature.add("Bird");
        nature.add("Animal");
        Collections.sort(nature);

        System.out.println(nature);


    }
    public static void sort(List<String> list) {

        list.sort(Comparator.naturalOrder());

    }
    public static int count(int[] numbers, IntPredicate condition) {
        int counter = 0;
        for (int i : numbers) {
            if (condition.test(i)) counter++;
        }
        return counter;
    }
}
