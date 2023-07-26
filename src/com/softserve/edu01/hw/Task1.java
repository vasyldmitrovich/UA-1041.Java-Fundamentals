package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.format("Perimeter: %.3f\n", 2 * Math.PI * r);
        System.out.format("Area: %.3f", Math.PI * Math.pow(r, 2));
    }
}
