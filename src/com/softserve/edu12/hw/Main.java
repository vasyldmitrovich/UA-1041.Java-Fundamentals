package com.softserve.edu12.hw;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        int numOfTask = -1;
        do {
            printList();
            System.out.print("\nPlease input the number of the task: ");
            numOfTask = SCANNER.nextInt();
            System.out.println("\nWelcome to " + numOfTask + " task");

            switch (numOfTask) {
                case 1 -> runTask1();
                case 2 -> runTask2();
                case 0 -> System.out.println("Goodbye");
                default -> System.out.println("Invalid number of the task. Please select the correct one");
            }
        } while (numOfTask != 0);
    }

    public static void printList() {
        System.out.print
                ("\nPlease choose one of the tasks :" +
                        "\n\t1 - First task" +
                        "\n\t2 - Second task" +
                        "\n\t0 - Exit\n");
    }

    public static void runTask2() {
        final int origin = 1;
        final int bound = 20;
        try {
            for (int i = 0; i < 10; i++) {
                readNumber(origin, bound);
            }
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void runTask1() {
        try {
            System.out.println(div(0, 0));
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

    public static double div(double a, double b) {
        if (a == 0 && b == 0) {
            throw new ArithmeticException("Undefined");
        }
        if (b == 0) {
            throw new ArithmeticException("Infinity");
        }
        return a / b;
    }

    public static int readNumber(int start, int end) {
        System.out.println("Enter a number:");
        int answer = Integer.parseInt(SCANNER.nextLine());
        if (answer >= start && answer <= end) {
            return answer;
        } else {
            String msg = answer < start ? "Too small num" : "Too big num";
            throw new NumberFormatException(msg);
        }
    }
}
