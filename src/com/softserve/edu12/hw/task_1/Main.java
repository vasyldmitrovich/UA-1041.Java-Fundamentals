package com.softserve.edu12.hw.task_1;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Enter first double number(d1):");
                double d1 = Double.parseDouble(SCANNER.nextLine());
                System.out.println("Enter second double number(d2):");
                double d2 = Double.parseDouble(SCANNER.nextLine());
                System.out.println("dividing d1/d2:" + div(d1, d2));
                break;
            } catch (NumberFormatException e) {
                System.out.println("input must be double number, try again!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static double div(double d1, double d2) {

        if (d2 == 0.0) {
            throw new IllegalArgumentException("second number can`t be 0, try again!");
        }
        return d1 / d2;
    }
}
