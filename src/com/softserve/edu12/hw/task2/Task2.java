package com.softserve.edu12.hw.task2;

import java.util.Scanner;

public class Task2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int start = 1;
        int end = 100;

        int[] numbers = new int[10];


        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = readNum(i == 0 ? start : numbers[i - 1], end);
        }

        System.out.println("Numbers:");
        displayArray(numbers);

    }

    private static int readNum(int start, int end) {
        while (true) {
            try {
                System.out.print("Enter number(between " + start + " and " + end + " ):");


                int num = Integer.parseInt(SCANNER.nextLine());

                if (num <= start || num >= end) {
                    throw new IllegalArgumentException("Number must be between " + start + " and " + end + "!");
                }
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    private static void displayArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + ":" + numbers[i]);
        }
    }
}
