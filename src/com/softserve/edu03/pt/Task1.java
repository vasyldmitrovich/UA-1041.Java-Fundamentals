package com.softserve.edu03.pt;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int firstNumber = getNumber("Enter first number: ");
        int secondNumber = getNumber("Enter second number: ");
        System.out.format("The sum of %d and %d is %d\n", firstNumber, secondNumber, getTotal(firstNumber, secondNumber));
        System.out.format("The average of %d and %d is %.2f\n", firstNumber, secondNumber, getAverage(firstNumber, secondNumber));
    }

    public static int getNumber(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static int getTotal(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public static double getAverage(int firstNumber, int secondNumber){
        return getTotal(firstNumber, secondNumber) / 2.0;
    }
}
