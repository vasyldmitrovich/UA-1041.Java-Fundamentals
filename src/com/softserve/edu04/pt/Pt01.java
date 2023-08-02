package com.softserve.edu04.pt;

import java.util.Scanner;

public class Pt01 {
    public static int odd;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even");
        } else {
            System.out.println(num1 + " is odd");
            odd++;
        }
        if (num2 % 2 == 0) {
            System.out.println(num2 + " is even");
        } else {
            System.out.println(num2 + " is odd");
            odd++;
        }
        if (num3 % 2 == 0) {
            System.out.println(num3 + " is even");
        } else {
            System.out.println(num3 + " is odd");
            odd++;
        }

        System.out.println("odd numbers is: " + odd);

    }
}
