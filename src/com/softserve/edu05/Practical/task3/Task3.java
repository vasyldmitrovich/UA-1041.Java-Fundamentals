package com.softserve.edu05.Practical.task3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        var data = generateRandom(10,-10,10);
        System.out.println(Arrays.toString(data));
        System.out.println("Biggest number is :" + max(data));
        System.out.println("The sum of positive numbers is :" + sumPositive(data));
        System.out.println("Count of negative numbers :" + countNegative(data));
        if (countNegative(data) > countPositive(data)) {
            System.out.println("There are more negative values in the array.");
        } else if ((countNegative(data) < countPositive(data))) {
            System.out.println("There are more positive values in the array"); {

        } if (countNegative(data) == countPositive(data)) {
                System.out.println("There are an equal number of positive and negative values in the array");
            }

        }
    }
    static int [] generateRandom(int length, int min, int max) {
        var rnd = new Random();
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = rnd.nextInt(min, max +1);

        }
        return res;
    }
    static int max(int[] data) {
        var max = Integer.MIN_VALUE;
        for (int n : data) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
    static int sumPositive(int[] data) {
        int sum = 0;
        for (var n : data) {
            if (n > 0) sum +=n;

            }
        return sum;
    }
    static int countNegative(int[] data) {
        int count = 0;
        for (var n : data) {
            if (n < 0) count++;

        }
        return count;
    }
    static int countPositive(int[] data) {
        int count = 0;
        for (var n : data) {
            if (n > 0) count++;

        }
        return count;
    }
}
