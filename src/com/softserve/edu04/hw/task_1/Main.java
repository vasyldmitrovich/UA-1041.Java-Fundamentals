package com.softserve.edu04.hw.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println("Input three numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getNumber("input " + (i + 1) + "st number:");
        }
        areBelongRange(arr);
    }

    private static void areBelongRange(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= -5 && arr[i] <= 5) {
                System.out.println("number: " + arr[i] + " is belong to the range [-5, 5].");
            } else {
                System.out.println("number: " + arr[i] + " isn't belong to the range [-5, 5].");
            }
        }
    }


    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
}
