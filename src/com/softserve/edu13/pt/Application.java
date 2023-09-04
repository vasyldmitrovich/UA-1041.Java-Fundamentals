package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.function.Predicate;

public class Application {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Today: " + LocalDate.now().getDayOfWeek());
        System.out.println("Date of first Monday for current month: " +
                firstMonday().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        List<String> stringList = new ArrayList<>(List.of("Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"));
        sortStrings(stringList);
        System.out.println("Days sorted by length: " + stringList);

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 11; i++){
            System.out.format("Enter %d number: ", i);
            list.add(sc.nextInt());
        }
        System.out.println("Count of positive elements: " + count(list, a -> a > 0));
        System.out.println("Count of odd elements: " + count(list, a -> a % 2 == 1));
        System.out.println("Count of even elements: " + count(list, a -> a % 2 == 0));

    }

    public static LocalDate firstMonday(){
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        LocalDate firstMonday = LocalDate.now().with(temporalAdjuster);
        return firstMonday;
    }

    public static void sortStrings(List<String> list){
       // Collections.sort(list, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        Collections.sort(list, Comparator.comparingInt(String::length));
    }



    public static int count(List<Integer> list, FuncInterface funcInterface){
        int count = 0;
        for (int a : list){
            if(funcInterface.calculate(a)){
                count++;
            }
        }
       return count;
    }
}