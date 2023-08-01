package com.softserve.edu03.hw;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int sideA = getSide("Input Side 1:");
        int sideB = getSide("Input Side 2:");
        int sideC = getSide("Input Side 3:");
        double area = calcArea(sideA, sideB, sideC);
        System.out.format("The are of the triangle is %.2f units^2", area);
    }

    static int getSide(String prompt) {
        int side = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(prompt);
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next();
            }

            side = sc.nextInt();

            if (side <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        } while (side <= 0);

        return side;
    }


    static double calcArea(int sideA, int sideB, int sideC) {
        double s = (double) ((sideA + sideB + sideC) / 2);

        /*Side of a triangle cannot be greater than its semiperimeter.
        It contradicts a fundamental property of triangles known as the "Triangle Inequality."*/
        if (s - sideA <= 0 || s - sideB <= 0 || s - sideC <= 0) {
            System.out.println("One of the side is greater than sum of others\nThis is impossible, so try another sides next time.");
            return -1;
        }
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));

    }
}
