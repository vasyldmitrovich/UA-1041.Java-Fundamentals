package com.softserve.edu03.practicaltask1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum = getNumber("Enter the first number: ", scanner);
        scanner.nextLine();
        double secondNum = getNumber("Enter the second number: ", scanner);

        System.out.printf("\nThe sum of %s and %s is %s", firstNum, secondNum, getTotal(firstNum, secondNum));
        System.out.printf("\nThe average of %s and %s is %s", firstNum, secondNum, getAverage(firstNum, secondNum));
    }

    static double getAverage(double firstNum, double secondNum) {
        return (firstNum + secondNum) / 2;
    }

    static double getTotal(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    static double getNumber(String prompt, Scanner scanner) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input!");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
