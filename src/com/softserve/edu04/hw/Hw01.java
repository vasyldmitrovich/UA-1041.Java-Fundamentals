package com.softserve.edu04.hw;

import java.util.Scanner;

public class Hw01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nChecking numbers on belong to the range [-5, 5]\n");

        System.out.print("Enter first number: ");
        float num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        float num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        float num3 = scanner.nextInt();

        if (num1 >= -5 && num1 <= 5 && num2 >= -5 && num2 <= 5 && num3 >= -5 && num3 <= 5) {
            System.out.println("\nAll numbers belong to the range");
        } else {
            System.out.println("\nSome numbers is out of the range");
        }

    }
}
