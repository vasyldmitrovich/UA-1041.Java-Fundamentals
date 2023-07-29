package com.softserve.edu03.pt;

import java.util.Scanner;

public class Pt01 {
    static final Scanner SCANNER = new Scanner(System.in);

    static int getTotal(int a, int b) {
        return a + b;
    }

    static double getAverage(int a, int b) {
        return (a + b) * 0.5;
    }

    static int getNumber(String prompt) {
        System.out.println(prompt);
        return SCANNER.nextInt();
    }

    public static void main(String[] args) {
        int first = getNumber("Enter the first number: ");
        int second = getNumber("Enter the second number: ");
        int sum = getTotal(first, second);
        double average = getAverage(first, second);
        System.out.printf("The sum of %s and %s is %s\n", first, second, sum);
        System.out.printf("The average of %s and %s is %s\n", first, second, average);

    }

}
