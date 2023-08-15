package com.softserve.edu05.pt.task3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {//Good


    private static final Random RANDOM = new Random();
    public static void main(String[] args) {

        int[] numbers = getRandomArray(10);
        System.out.println(Arrays.toString(numbers));


        System.out.println("Max number is " + findMaxNum(numbers));

        int sumPositive = 0;

        int countNegative = 0;
        for (var num : numbers) {
            if (num > 0) sumPositive+=num;
            else countNegative++;
        }

        System.out.println("Sum of positive numbers is " + sumPositive);
        System.out.println("Count of negative numbers is " + countNegative);

        int countPositive = numbers.length - countNegative;

        if (countPositive > countNegative) {
            System.out.println("There are more positive values in the array.");
        }
        else if (countPositive < countNegative) {
            System.out.println("There are more negative values in the array.");
        }
        else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }
    }

    private static int[] getRandomArray(int n) {
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = RANDOM.nextInt(-100,100);
        }

        return numbers;
    }

    private static int findMaxNum(int[] numbers) {
        int max = 0;

        for (var num : numbers) {
            if (num > max) max = num;
        }

        return max;
    }


}
