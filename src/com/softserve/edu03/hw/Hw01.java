package com.softserve.edu03.hw;

import java.util.Locale;
import java.util.Scanner;

public class Hw01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input side 1: ");
        int a = scanner.nextInt();
        System.out.print("Input side 2: ");
        int b = scanner.nextInt();
        System.out.print("Input side 3: ");
        int c = scanner.nextInt();
        double p = (double) (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("The area of the triangle is " + "%.2f", area);
    }
}
