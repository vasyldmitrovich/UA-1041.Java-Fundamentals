package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.function.IntPredicate;

public class Main {
    public final static Scanner SCANNER = new Scanner(System.in);
    public final static LocalDate now = LocalDate.now();
    public final static int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12};
    public static List<String> strings = Arrays.asList("Banana","Laptop","Ivan","BMW","Linux","AWS","Java");
    public final static IntPredicate greaterThanZero= (i)->i>0;
    public final static IntPredicate ifEven= (i)->i%2==0;
    public final static IntPredicate ifOdd= (i)->i%2!=0;
    public static void main(String[] args) {
        run();
    }
    private static void run() {
        int numOfTask = -1;
        do {
            printList();
            System.out.print("\nPlease input the number of the task: ");
            numOfTask = SCANNER.nextInt();
            System.out.println("\nWelcome to " + numOfTask + " task");

            switch (numOfTask) {
                case 1 -> printTodayDay();
                case 2 -> printFirstDayOfWeek(DayOfWeek.MONDAY);
                case 3 -> showWorkOfSort();
                case 4 -> showWorkOfCount();
                case 0 -> System.out.println("Goodbye");
                default -> System.out.println("Invalid number of the task. Please select the correct one");
            }
        } while (numOfTask != 0);
    }

    public static void printList() {
        System.out.print
                ("\nPlease choose one of the tasks :" +
                        "\n\t1 - Print today day" +
                        "\n\t2 - Print first Monday of this month" +
                        "\n\t3 - Sort list of strings" +
                        "\n\t4 - Show count in work" +
                        "\n\t0 - Exit\n");
    }
    public static void printTodayDay() {
        String todayDay = now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("uk-ua"));
        System.out.format("Today is:%s%n", todayDay);
    }

    public static void printFirstDayOfWeek(DayOfWeek day) {
        LocalDate firstDay = now.with(TemporalAdjusters.firstInMonth(day));
        System.out.format("First %s of %s is %s", day, now.getMonth(), firstDay);
    }
    public static void sort(List<String> list){
        list.sort(Comparator.naturalOrder());
    }
    public static int count(int[] numbers, IntPredicate condition){
        int counter = 0;
        for (int i :numbers
             ) {
            if(condition.test(i)) counter++;
        }
        return counter;
    }
    public static void showWorkOfCount(){
        System.out.println(Arrays.toString(nums));
        System.out.println("Num of even elements in array:"+count(nums,ifEven));
        System.out.println("Num of odd elements in array:"+count(nums,ifOdd));
        System.out.println("Num of elements in array which are greater than zero:"+count(nums,greaterThanZero));
    }
    public static void showWorkOfSort(){
        System.out.println("First array:"+ strings);
        sort(strings);
        System.out.println("Second array:"+strings );
    }
}
