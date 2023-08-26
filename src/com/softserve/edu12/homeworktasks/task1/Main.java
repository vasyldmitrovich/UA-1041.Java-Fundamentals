package com.softserve.edu12.homeworktasks.task1;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("Enter first number: ");
                double a = Double.parseDouble(SCANNER.nextLine());
                System.out.println("Enter second number: ");
                double b = Double.parseDouble(SCANNER.nextLine());
                double div = div(a, b);
                System.out.println("The result is: " + div);
            } catch (NumberFormatException | NullPointerException e) {
                throw new RuntimeException("Number can't be string or null");
            }
        }
    }

    public static double div(double a, double b) {

        try {
            if (a == 0 && b == 0) {
                throw new ArithmeticException("NaN");
            }
            if ( b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        } catch (InfinityException e) {
            throw new InfinityException("Write proper numbers");
        }
    }
}
