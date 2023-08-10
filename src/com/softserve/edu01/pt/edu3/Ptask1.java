package edu3;

import java.util.Scanner;

public class Ptask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = getNumber("Enter the first number: ");
        double num2 = getNumber("Enter the second number: ");

        double total = getTotal(num1, num2);
        double average = getAverage(num1, num2);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    public static double getTotal(double num1, double num2) {
        return num1 + num2;
    }

    public static double getAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static double getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}

