package com.softserve.edu05.hw.hw01;

import java.util.Arrays;
import java.util.Scanner;

public class FiveInteger {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nYour array is: " + Arrays.toString(arr));
        System.out.println("======================");

        int ix = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                ix += 1;
                if (ix == 2) {
                    System.out.println("Position of second positive number - " + i);
                }
            }
        }
        System.out.println("======================");

        int min = arr[0];
        int ixMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                ixMin = i;
            }
        }
        System.out.printf("Minimum value number is %s, his position in array: %s", min, ixMin);
        System.out.println("\n======================");

        int product = 1;
        for (int i : arr) {
            if (i != 0 && (i % 2 == 0)) {
                product *= i;
            }
        }
        System.out.println("Product of even numbers: " + product);
    }
}




