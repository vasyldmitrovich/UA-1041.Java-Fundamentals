package com.softserve.edu5.HW;

import java.util.Scanner;

public class HW1 {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter month number: ");
        int month = SCANNER.nextInt();
        Integer[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println(month + " month have " + daysInMonth[month - 1] + " days.");
    }
}
