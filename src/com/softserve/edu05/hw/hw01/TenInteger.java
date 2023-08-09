package com.softserve.edu05.hw.hw01;

import java.util.Arrays;
import java.util.Scanner;

public class TenInteger {
    private static final int[] arr = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nYour array is: " + Arrays.toString(arr));
        System.out.println("======================");

        TenInteger.result();

    }

    static boolean firstFiveCheck() {
        for (int i = 0; i < 5; i++) {
            if (arr[i] < 0) {
                return false;
            }
        }
        return true;
    }

    static void result() {
        if (firstFiveCheck()) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += arr[i];
            }
            System.out.println("The sum first five integers: " + sum);
        } else {
            int product = 1;
            for (int i = 5; i < arr.length; i++) {
                product *= arr[i];
            }
            System.out.println("Product of the last five elements: " + product);
        }
    }
}
