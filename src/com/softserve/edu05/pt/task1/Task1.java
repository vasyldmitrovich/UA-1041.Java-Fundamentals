package com.softserve.edu05.pt.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String[] arr = {"Desk", "Table", "Pool", "Tree"};
        Arrays.sort(arr);

        int[] arr1 = {5, 4, 3, 2, 10};
        getAverage(arr1);

        checkNumber(arr1);
    }

    public static void getAverage(int[] arr) {
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg = sum / arr.length;
        }
        System.out.printf("Average value of the array is: %.2f\n", avg);
    }

    public static void checkNumber(int[] arr1) {
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any number to check if it is inside of an array: ");
        int number = sc.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == number) {
                check = arr1[i] == number;
            }
        }
        if (check == true) {
            System.out.println("The number is inside of an array.");
        } else {
            System.out.println("The number isn't inside of an array.");
        }
    }
}



