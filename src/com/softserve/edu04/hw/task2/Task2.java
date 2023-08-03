package com.softserve.edu04.hw.task2;

import java.util.Scanner;

public class Task2 {
    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {


        int a = getNum("Enter your first number: ");


        int b = getNum("Enter your second number: ");


        int c = getNum("Enter your third number: ");


        System.out.println("The minimum number is " + findMinimum(a, b, c));

        System.out.println("The maximum number is " + findMaximum(a, b, c));
    }

    private static int getNum(String message) {
        System.out.print(message);
        int num = SCANNER.nextInt();

        SCANNER.nextLine();

        return num;
    }
    private static int findMinimum(int a, int b, int c) {
        int minimum = a;

        if (b < minimum) {
            minimum = b;
        }

        if (c < minimum) {
            minimum = c;
        }

        return minimum;
    }

    private static int findMaximum(int a, int b, int c) {
        int maximum = a;

        if (b > maximum) {
            maximum = b;
        }

        if (c > maximum) {
            maximum = c;
        }

        return maximum;
    }
}
