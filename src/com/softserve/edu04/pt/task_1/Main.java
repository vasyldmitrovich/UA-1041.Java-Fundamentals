package com.softserve.edu04.pt.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println("Input three numbers");
        arr[0] = getNumber("input 1st number: ");
        arr[1] = getNumber("input 2st number: ");
        arr[2] = getNumber("input 3st number: ");
        findOdd(arr);
    }

    private static void findOdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
}
