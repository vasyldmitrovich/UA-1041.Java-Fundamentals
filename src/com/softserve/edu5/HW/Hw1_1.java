package com.softserve.edu5.HW;

import java.util.Scanner;

public class Hw1_1 {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[10];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter number");
            arr[i] = SCANNER.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }

        if (count < 5) {
            System.out.println(arr[5] * arr[6] * arr[7] * arr[8] * arr[9]);
        } else {
            System.out.println(arr[0] + arr[1] + arr[2] + arr[3] + arr[4]);
        }

    }
}
