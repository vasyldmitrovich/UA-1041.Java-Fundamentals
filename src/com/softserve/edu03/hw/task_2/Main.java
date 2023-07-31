package com.softserve.edu03.hw.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = getNumber("input amount of numbers:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getNumber("input " + (i + 1) + "st number:");
        }
        System.out.println("The smallest number is: " + getSmallestNumber(arr));
    }

    public static int getSmallestNumber(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
}
