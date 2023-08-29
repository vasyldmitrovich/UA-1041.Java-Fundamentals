package com.softserve.edu12.pt;

import java.util.InputMismatchException;
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
        while (true) {
            try {
                System.out.println("Enter size:");
                int size = Integer.parseInt(SCANNER.nextLine());
                System.out.println("Enter color:");
                String color = SCANNER.nextLine();
                System.out.println("Enter type:");
                String type = SCANNER.nextLine();

                Plant plant = new Plant(size, color, type);
                System.out.println(plant);
                break;
            } catch (ColorException | TypeException e) {
                System.err.println("Wrong input");
                System.err.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("Input should be integer");
                System.err.println(e.getStackTrace());
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void runTask1() {
        try {
            System.out.println("Enter A:");
            int a = SCANNER.nextInt();
            System.out.println("Enter B:");
            int b = SCANNER.nextInt();
            int area = squareRectangel(a, b);
            System.out.format("Area:%s", area);
        } catch (InputMismatchException e) {
            System.err.println("Input should be integer");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int squareRectangel(int a, int b) {
        if (a < 0 || b < 0) {
            String msg = a < 0 && b < 0 ? "First and second arguments must be greater than 0" : "One of the arguments needs to be greater than zero";
            throw new IllegalArgumentException(msg);
        }
        return a * b;
    }
}
