package com.softserve.edu13.practicaltasks;

import java.time.*;
import java.util.*;
import java.time.temporal.TemporalAdjusters;
import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {

//       Show which today is a day of a week
        getLocalDayOfWeek();

//        Show a date of first Monday for current month
        firstMondayOfCurrentMonth();

//        Write a method for sorting list of Strings
        var names = promptUserList();
        System.out.println("List before sorting: " + names);
        var sortedList = sort(names);
        System.out.println("List after sorting: " + sortedList);

//        Method userCounter() return count of elements in array that satisfy the condition defined by the second argument
        userCounter();
    }

    private static void userCounter() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(count(nums, i -> i < 6));
        System.out.println(count(nums, i -> i % 2 != 0));
        System.out.println(count(nums, i -> i >= 3 && i <= 6));
    }

    private static void firstMondayOfCurrentMonth() {
        LocalDate date = LocalDate.now();
        var firstMonday = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("Date of first Monday of the month is: " + firstMonday);
    }

    private static void getLocalDayOfWeek() {
        System.out.println("Day of the week: " + LocalDate.now().getDayOfWeek());
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

    public static List<String> promptUserList() {
        return new ArrayList<>(Arrays.asList("Bob", "Jane", "Alice", "Matt", "Robert", "Dan", "Mark", "Melony", "Lora"));
    }

    public static List sort(List<String> list) {
        list.sort(Comparator.naturalOrder());
        return list;
    }
}
