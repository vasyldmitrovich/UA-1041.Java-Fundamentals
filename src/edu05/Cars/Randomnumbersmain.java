package edu05.Cars;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Randomnumbersmain {//Good
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Enter array size(positive int):");
        int size = sc.nextInt();
        System.out.print("Enter down negative value  of array(int):");
        int down = sc.nextInt();
        System.out.print("Enter up positive value  of array(int):");
        int up = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(down, up + 1);
        }
        System.out.println("origin array:" + Arrays.toString(array));

        //• the biggest number in the array
        int max = findBiggestNumber(array);
        System.out.println("the biggest number in the array is:" + max);

        //• the sum of positive numbers
        int sumPositive = findSumPositiveNumbers(array);
        System.out.println("the sum of positive numbers:" + sumPositive);

        //• count the number of negative numbers
        int countNegative = findCountNegativeNumbers(array);
        System.out.println("count the number of negative numbers:" + countNegative);

        //• count the number of positive numbers
        int countPositive = findCountPositiveNumbers(array);
        System.out.println("count the number of positive numbers:" + countPositive);

        //determine whether there are more negative or positive values in the array.
        morePosOrNeg(countNegative, countPositive);


    }

    private static void morePosOrNeg(int countNegative, int countPositive) {
        if (countPositive > countNegative) {
            System.out.println("There are more positive values in the array");

        } else if (countPositive < countNegative) {

            System.out.println("There are more negative values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }

    }

    private static int findCountPositiveNumbers(int[] array) {
        int count = 0;
        for (int numb : array) {
            if (numb > 0) {
                count++;
            }
        }
        return count;
    }

    private static int findCountNegativeNumbers(int[] array) {
        int count = 0;
        for (int numb : array) {
            if (numb < 0) {
                count++;
            }
        }

        return count;
    }

    private static int findSumPositiveNumbers(int[] array) {
        int sum = 0;
        for (int numb : array) {
            if (numb > 0) {
                sum += numb;
            }
        }
        return sum;
    }

    private static int findBiggestNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}