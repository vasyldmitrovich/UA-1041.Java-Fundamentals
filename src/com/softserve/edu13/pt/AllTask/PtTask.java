package com.softserve.edu13.pt.AllTask;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;

public class PtTask {
    public static void main(String[] args) {
        //Task1//Task1//Task1//Task1//Task1//Task1//Task1//Task1//Task1//Task1//Task1//Task1//Task1//Task1//Task1//Task1
        DayOfWeek currentTime = LocalDateTime.now().getDayOfWeek();
        System.out.println("First task Show which today is a day of a week");
        System.out.println(currentTime);
        System.out.println();
        //Task2//Task2//Task2//Task2//Task2//Task2//Task2//Task2//Task2//Task2//Task2//Task2//Task2//Task2//Task2//Task2
        TemporalAdjuster firstMonInMonth = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("Second task Show a date of first Monday for current month");
        System.out.println(firstMonInMonth);
        System.out.println();
        //Task3//Task3//Task3//Task3//Task3//Task3//Task3//Task3//Task3//Task3//Task3//Task3//Task3//Task3//Task3//Task3
        List<String >list=new ArrayList<>();
        list.add("d");
        list.add("a");
        list.add("c");
        list.add("v");
        list.add("b");
        list.add("n");
        sort(list);

        System.out.println("Third task Write a method for sorting list of Strings using Java 8");
        System.out.println(list);
        System.out.println();
        //Task4//Task4//Task4//Task4//Task4//Task4//Task4//Task4//Task4//Task4//Task4//Task4//Task4//Task4//Task4//Task4
        int[] array={2,3,4,5,6,7,8,9};
        System.out.println(count(array, i -> i >5));
        System.out.println(count(array, i -> i%3==0));//kratni 3
        System.out.println(count(array, i -> (i-1)%2==0));//ne parni
    }
    public static int count(int[]array, IntPredicate condition){
        int counter=0;
        for (int i = 0; i <= array.length; i++) {
            if(condition.test(i))counter++;

        }
        return counter;
    }


    public static void sort(List<String>list){
        list.sort(Comparator.naturalOrder());
    }
}
