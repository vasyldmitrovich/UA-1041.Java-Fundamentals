package com.softserve.edu05.hw.task_1;

import java.util.Scanner;

public class Integer10Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] integers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + (i + 1) + "st integer number:");
            integers[i] = sc.nextInt();
        }
        boolean isPositive = isPositiveFiveElem(integers);

        if (isPositive) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += integers[i];

            }
            System.out.println("first five numbers are positive, their sum:" + sum);
        } else {
            int product = 1;
            for (int i = integers.length - 1; i >= 5; i--) {
                if (integers[i] == 0) {
                    continue;
                }
                product *= integers[i];

            }
            System.out.println("first five numbers are not positive, the product of the last five elements:" + product);
        }
    }

    private static boolean isPositiveFiveElem(int[] integers) {
        for (int i = 0; i < 5; i++) {
            if (integers[i] < 0) {
                return false;
            }
        }
        return true;
    }
}
