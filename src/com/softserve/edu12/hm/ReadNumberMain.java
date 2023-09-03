package com.softserve.edu12.hm;

public class ReadNumberMain {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            int input;
            if (i == 0) {
                System.out.print("Enter the first number (1 < a1 < 100): ");
                input = ReadNumber.readNumber(1, 100);
            } else {
                System.out.print("Enter number a" + (i + 1) + " (a" + i + " < a" + (i + 1) + " < 100): ");
                input = ReadNumber.readNumber(numbers[i - 1], 100);
            }
            numbers[i] = input;
        }

        System.out.println("Entered numbers satisfying the condition:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
