package com.softserve.edu05.hw.task_1;

import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] daysInMonths={
               31,28,31,30,31,30,31,31,30,31,30,31
        };
        System.out.println("enter a months number: ");
        int monthsNumber=sc.nextInt();
        System.out.println("this month contains "+daysInMonths[monthsNumber-1] +" days");

    }
}
