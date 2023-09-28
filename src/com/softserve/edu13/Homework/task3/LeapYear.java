package com.softserve.edu13.Homework.task3;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //boolean year = scanner.nextBoolean();
        Year year = Year.of(2025);
        System.out.println(year.isLeap());
    }
}
