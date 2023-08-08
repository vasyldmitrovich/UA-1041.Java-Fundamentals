package com.softserve.edu05.hw.task1;

import java.util.Scanner;

public class CountDays {
    public static Scanner sc = new Scanner(System.in);
    public final static int[] countDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        int numberOfMonth = getNumber("Input number of month: ");
        System.out.println("Month " + numberOfMonth + " has " + culcDays(numberOfMonth) + " days");
    }

    public static int culcDays(int monthNumber){
        if(monthNumber > 12 || monthNumber < 1) return 0;
        return countDays[monthNumber - 1];
    }

    public static int getNumber(String prompt){
        System.out.print(prompt);
        return sc.nextInt();
    }

}