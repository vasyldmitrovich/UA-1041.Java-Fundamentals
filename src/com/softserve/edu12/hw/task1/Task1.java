package com.softserve.edu12.hw.task1;

import java.util.Scanner;

public class Task1 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {


        try {
            double a = getNum("Enter first number:");
            double b = getNum("Enter second number:");

            System.out.println("Result diving is " + div(a, b));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    private static double getNum(String message) {
        while (true) {

            try {
                System.out.print(message);


                return Double.parseDouble(SCANNER.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Please enter number");
            }

        }
    }

    private static double div(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Second number cannot be zero");

        return a / b;
    }
}
