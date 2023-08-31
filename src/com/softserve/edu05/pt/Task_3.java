package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class Task_3 {
    private static int maxNumber;
    private static int sumPositiveNumbers;
    private static int countPositiveNumbers;
    private static int countNegativeNumbers;

    public static void getResult() {
        int[] arrayRandomNumbers = randomNumbers(10);
        System.out.println("Random array " + Arrays.toString(arrayRandomNumbers) + ".");

        for (int i = 0; i < arrayRandomNumbers.length; i++) {
            if (i == 0) {
                maxNumber = arrayRandomNumbers[i];
            } else {
                if (maxNumber < arrayRandomNumbers[i]) {
                    maxNumber = arrayRandomNumbers[i];
                }
            }

            if (arrayRandomNumbers[i] > 0) {
                sumPositiveNumbers += arrayRandomNumbers[i];
                countPositiveNumbers++;
            } else if (arrayRandomNumbers[i] != 0) {
                countNegativeNumbers++;
            }
        }
        System.out.println(maxNumber + " is the biggest number in the array.");

        System.out.println("In array " + countNegativeNumbers + " negative numbers.");

        if (countNegativeNumbers == countPositiveNumbers) {
            System.out.println("There are an equal number of positive and negative values in the array.");
        } else if (countNegativeNumbers > countPositiveNumbers) {
            System.out.println("There are more negative values in the array.");
        } else {
            System.out.println("There are more positive values in the array.");
        }
    }

    public static int[] randomNumbers(int countOfNumbers) {
        int[] arrayOfNumbers = new int[countOfNumbers];
        Random randomNumbers = new Random();

        for (int i = 0; i < countOfNumbers; i++) {
            arrayOfNumbers[i] = randomNumbers.nextInt(-100, 100);
        }

        return arrayOfNumbers;
    }
}
