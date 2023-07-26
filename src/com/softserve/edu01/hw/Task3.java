package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first cost: ");
        double c1 = sc.nextDouble();
        System.out.print("Input 1 count minutes: ");
        double t1 = sc.nextDouble();
        System.out.println();
        System.out.print("Input second cost: ");
        double c2 = sc.nextDouble();
        System.out.print("Input 2 count minutes: ");
        double t2 = sc.nextDouble();
        System.out.println();
        System.out.print("Input third cost: ");
        double c3 = sc.nextDouble();
        System.out.print("Input 3 count minutes: ");
        double t3 = sc.nextDouble();

        System.out.format("first call cost: %.2f\n", c1 * t1);
        System.out.format("second call cost: %.2f\n", c2 * t2);
        System.out.format("third call cost: %.2f\n", c3 * t3);
        System.out.format("total cost: %.2f", (c1 * t1) + (c2 * t2) + (c3 * t3));
    }
}
