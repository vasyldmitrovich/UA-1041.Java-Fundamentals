package com.softserve.edu05.hw.task2;

import java.util.Scanner;

public class Task2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        getSum();
    }

    public static double getNumber(String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }

    public static void getSum() {
        String answer;
        do {
            double num1 = getNumber("Enter the first number: ");
            double num2 = getNumber("Enter the second number: ");
            double sum = num1 + num2;
            System.out.println("The sum of two numbers is: " + sum);
            System.out.println("Do you want to repeat the operation? (Yes / No)");
            sc.nextLine();
            answer = sc.nextLine();
        } while (answer.toLowerCase().equals("yes"));
    }
}
