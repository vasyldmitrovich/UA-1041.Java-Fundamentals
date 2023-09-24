package com.softserve.edu12.hw;

import java.util.Random;
import java.util.Scanner;

public class App {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");

        while (true) {
            try {
                System.out.print("Enter a: ");
                int a = Integer.parseInt(SCANNER.nextLine());
                System.out.print("Enter b: ");
                int b = Integer.parseInt(SCANNER.nextLine());
                double div = Task_1.div(a, b);
                System.out.format("Result of division: %.2f", div);
                System.out.println();
                System.out.println();
                break;
            } catch (NullPointerException e) {
                System.out.println("Cannot be divided by zero.");
            } catch (NumberFormatException e) {
                System.out.println("Please input the integer number.");
            }
        }

        // Task 2
        System.out.println("Task 2");
        while (true) {
            try {
                var rangeList = Task_2.getRange();
                System.out.println("Range " + rangeList);
                int start = (Integer) rangeList.get(0);
                int end = (Integer) rangeList.get(rangeList.size() - 1);
                var num = Task_2.readNumber(start, end);
                if (num >= start && num <= end) {
                    System.out.println("Number " + num + " is in the range [" + start + "; " + end + "]");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input the integer number.");
            }
        }
    }
}
