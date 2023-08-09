package com.softserve.edu04.pt;

import java.util.Scanner;

public class Pt01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int odd = addQuantity(num1, num2, num3);
        System.out.println("odd numbers is: " + odd);
    }

    public static int addQuantity(int... nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
                count++;
            }
        }
        return count;
    }
}
