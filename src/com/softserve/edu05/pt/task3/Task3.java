package com.softserve.edu05.pt.task3;


import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = getRandom();
        System.out.println(Arrays.toString(arr));
        getMax(arr);
        getSum(arr);
        showAmount(arr);
        checkNumbers(arr);
    }

    public static int[] getRandom() {
        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        return arr;
    }

    public static void getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The biggest number in the array is " + max);
    }

    public static void getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.println("The sum of positive numbers in the array equals " + sum);
    }

    public static int getAmount(int[] arr) {
        int count = 0;
        for (var a : arr) {
            if (a < 0) {
                count++;
            }
        }
        return count;
    }

    public static void showAmount(int[] arr) {
        int count = getAmount(arr);
        System.out.println("The amount of negative numbers in the array is " + count);
    }

    public static void checkNumbers(int[] arr) {
        int count = getAmount(arr);
        if (count > 5) {
            System.out.println("There are more negative values in the array.");
        } else if (count < 5) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }
}


