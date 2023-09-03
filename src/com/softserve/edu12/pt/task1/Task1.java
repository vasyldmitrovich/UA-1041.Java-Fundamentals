package com.softserve.edu12.pt.task1;

import java.util.Scanner;

public class Task1 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.print("Enter a:");
                int a = Integer.parseInt(SCANNER.nextLine());
                System.out.print("Enter b:");
                int b = Integer.parseInt(SCANNER.nextLine());

                int area = squareRectangle(a, b);

                System.out.println("Area is " + area);

                break;
            } catch (NumberFormatException e) {
                System.out.println("You should enter an integer");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) throw new IllegalArgumentException("Argument a or b should be positive");

        return a * b;
    }
}
