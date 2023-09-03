package com.softserve.edu13.pr;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;

public class AllPractical {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfWeek());
        System.out.println(date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));


        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(count(nums, i -> i>4));
        System.out.println(count(nums, i -> i%2==0));
        System.out.println(count(nums, i -> true));
    }

    public static void sort(List<String> list){
        list.sort(Comparator.naturalOrder());
    }

    public static int count(int[] numbers, IntPredicate condition){
        int counter = 0;
        for(int i:numbers){
            if (condition.test(i)) counter++;
        }
        return counter;
    }
}
