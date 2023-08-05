package com.softserve.edu03.pt.task1;

import java.util.Scanner;

public class Task1 {
    public static double getTotal(double a, double b) {
        return a + b;
    }
//All is good
    public static double getAverage(double a, double b) {
        return (a + b) * 0.5;
    }

    public static double getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        double num1 = getNumber("Enter the first number: ");
        double num2 = getNumber("Enter the second number: ");
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + getTotal(num1, num2));
        System.out.println("The average of " + num1 + " and " + num2 + " is " + getAverage(num1, num2));

    }
}
