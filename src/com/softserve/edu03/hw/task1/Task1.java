package com.softserve.edu03.hw.task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Side 1: ");
        int side1 = scanner.nextInt();


        System.out.print("Input Side 2: ");
        int side2 = scanner.nextInt();

        System.out.print("Input Side 3: ");
        int side3 = scanner.nextInt();

        double area = calculateArea(side1, side2, side3);

        System.out.printf("Area: %.2f", area);
    }

    private static double calculateArea(int a, int b, int c) {
        double p = (a + b + c) / 2.0;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
