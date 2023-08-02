package com.softserve.edu05.hm;

import java.util.Scanner;

public class DayCalc {
    public static void main(String[] args) {
    int[] DayArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of month");
        int months = sc.nextInt();
        System.out.println(DayArray[months-1]);
    }
}
