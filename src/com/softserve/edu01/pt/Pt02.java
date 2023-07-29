package com.softserve.edu01.pt;

import java.util.Locale;
import java.util.Scanner;

public class Pt02 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Input first number");
        double num1 = scanner.nextDouble();
        System.out.println("Input second number");
        double num2 = scanner.nextDouble();
        System.out.println("Input third number");
        double num3 = scanner.nextDouble();
        double v = (num1 + num2 + num3) / 3;
        Locale.setDefault(Locale.ROOT);
        System.out.format("Average is "+ "%.7f", v);
            }
}
