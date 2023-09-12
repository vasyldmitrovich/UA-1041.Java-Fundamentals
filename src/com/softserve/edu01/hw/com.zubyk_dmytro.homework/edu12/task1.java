package edu12;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        try {
            double num1 = readDouble("Enter the first double number: ");
            double num2 = readDouble("Enter the second double number: ");

            double result = div(num1, num2);
            System.out.println("Result of division: " + result);

            System.out.println("Enter 10 integers between 1 and 100:");
            int[] numbers = new int[10];
            for (int i = 0; i < 10; i++) {
                numbers[i] = readNumber(1, 100);
            }

            System.out.print("Entered numbers: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static double div(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    public static double readDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number >= start && number <= end) {
                    return number;
                } else {
                    throw new IllegalArgumentException("Number is not in the specified range.");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Enter an integer: ");
            } catch (IllegalArgumentException e) {
                System.out.print("Number is not in the range [1...100]. Enter a valid number: ");
            }
        }
    }
}
