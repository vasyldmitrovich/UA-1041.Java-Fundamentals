package com.softserve.edu13.hw;

import java.time.Year;
import java.util.Scanner;

public class Hw03 {

    public static Scanner SC = new Scanner(System.in);

    public static boolean isLeap(int year) {
        return Year.isLeap(year);
    }

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("Enter year: ");
                var year = Integer.parseInt(SC.nextLine());
                var leap = isLeap(year);
                if (leap) {
                    System.out.println(year + " is a leap");
                } else {
                    System.out.println(year + " is not leap");
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Number should be an integer\n");
            }
        }
    }
}