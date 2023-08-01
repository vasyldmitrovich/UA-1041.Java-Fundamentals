package com.softserve.edu04.pt.task1;

import java.util.Scanner;

public class Task1 {
    public static int getNumber(String number) {
        Scanner sc = new Scanner(System.in);
        System.out.print(number);
        return sc.nextInt();
    }

    public static void oddChecker(int a, int b, int c) {
        if ((a % 2 != 0) && (b % 2 != 0) && (c % 2 != 0)) {
            System.out.println("All of the numbers are odd");
        } else if (((a % 2 != 0) && (b % 2 != 0)) || ((a % 2 != 0) && (c % 2 != 0)) || ((b % 2 != 0) && (c % 2 != 0))) {
            System.out.println("Two of the numbers are odd");
        } else if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0) {
            System.out.println("One of the numbers is odd");
        } else {
            System.out.println("None of the numbers are odd");
        }


    }

    public static void main(String[] args) {
        int num1 = getNumber("Enter the first number: ");
        int num2 = getNumber("Enter the second number: ");
        int num3 = getNumber("Enter the third number: ");
        oddChecker(num1, num2, num3);
    }
}

