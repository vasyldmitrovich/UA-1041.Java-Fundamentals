package com.softserve.edu12.pt.task1;

import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                int firstSide = getNumber("Enter the first side of the rectangle: ");
                int secondSide = getNumber("Enter the second side of the rectangle: ");
                int area = squareRectangle(firstSide, secondSide);
                System.out.println("Area of the rectangle is " + area);
                break;
            } catch (NumberFormatException e) {
                System.out.println("You must input an integer!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int getNumber(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(sc.nextLine());
    }

    public static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Sides of the rectangle can't be negative.");
        }
        return a * b;
    }
}
