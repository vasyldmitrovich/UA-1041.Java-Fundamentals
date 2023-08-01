package com.softserve.edu04.hw.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println("Input three integer numbers)");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getNumber("input " + (i + 1) + "st number:");
        }
        findMin(arr);
        findMax(arr);
    }

    private static void findMax(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("minimum value is: " + min);
    }

    private static void findMin(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("maximum value is: " + max);
    }


    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
}
