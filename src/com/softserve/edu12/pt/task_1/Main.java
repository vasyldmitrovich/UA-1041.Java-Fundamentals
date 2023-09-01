package com.softserve.edu12.pt.task_1;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("input 1st side of rectangle:");
                int a = getNumber();
                System.out.println("input 2st side of rectangle:");
                int b = getNumber();
                System.out.printf("rectangle area is %d", squareRectangle(a, b));
                break;
            } catch (NumberFormatException e) {
                System.out.println("side must be integer, try again");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("You input is negative, try again");
        }
        return a * b;
    }

    public static int getNumber() {
        return Integer.parseInt(SCANNER.nextLine());
    }
}
