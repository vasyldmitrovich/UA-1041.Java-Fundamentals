package com.softserve.edu03.task1;

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

        double p = (side1 + side2 + side3) / 2.0;

        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));

        System.out.printf("Area: %.2f", area);
    }


}
