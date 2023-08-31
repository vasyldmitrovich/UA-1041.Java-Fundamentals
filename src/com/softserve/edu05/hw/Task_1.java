package com.softserve.edu05.hw;

import static com.softserve.edu05.hw.App.SCANNER;

public class Task_1 {
    private static int[] countDaysInTheMonthes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int[] arr = new int[10];
    private static int countOfNegativeNumbers;
    private static int sum;
    private static int product = 1;
    private static int[] arr2 = new int[5];
    private static int countOfPositiveNumbers;
    private static int minValue;
    private static int positionOfMinValue;
    private static int productEvenNumbers = 1;


    public static void getCountDaysInTheMonth() {
        System.out.print("Input number of the month: ");
        int monthNumber = SCANNER.nextInt();
        SCANNER.nextLine();
        int countDaysInTheMonth = countDaysInTheMonthes[monthNumber - 1];
        System.out.println(countDaysInTheMonth + " days in the " + monthNumber + "th month.");
    }

    public static void getArrayInt() {
        System.out.println("Input 10 numbers separated by ,");
        String line = SCANNER.nextLine();
        String[] items = line.split(",");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(items[i]);
            if (i < 5) {
                sum += arr[i];
                if (arr[i] < 0) {
                    countOfNegativeNumbers++;
                }
            } else {
                product *= arr[i];
            }
        }
        if (countOfNegativeNumbers > 0) {
            System.out.println("Sum of the 5 first numbers in array is " + sum + ".");
        } else {
            System.out.println("Product of the 5 last numbers in array is " + product + ".");
        }
    }

    public static void getNumbersFromArray() {
        System.out.println("Input 5 numbers separated by ,");
        String line = SCANNER.nextLine();
        if (line.length() == 0) {
            System.out.println("Please, input 5 numbers separated by ,");
        } else {
            String[] items = line.split(",");
            int positionSecondPositiveNumber = 0;

            for (int i = 0; i < arr2.length; i++) {
                if (items[i] == "") {
                    arr2[i] = 0;
                } else {
                    arr2[i] = Integer.parseInt(items[i]);
                }
                if (arr2[i] % 2 == 0) {
                    countOfPositiveNumbers++;
                    if (arr2[i] != 0) {
                        productEvenNumbers *= arr2[i];
                    }
                    if (countOfPositiveNumbers == 2) {
                        int secondPositiveNumber = arr2[i];
                        positionSecondPositiveNumber = i;
                        // break;
                    }
                }

                if (i == 0) {
                    minValue = arr2[i];
                    positionOfMinValue = 1;
                } else {
                    if (arr2[i] < minValue) {
                        minValue = arr2[i];
                        positionOfMinValue = i + 1;
                    }
                }
            }
            if (positionSecondPositiveNumber > 0) {
                System.out.println("Position of the second positive number is " + (positionSecondPositiveNumber + 1) + ".");
            } else {
                System.out.println("There is no second positive number in the list.");
            }

            System.out.println("The minimum value in the array is " + minValue +
                    " on the " + positionOfMinValue + " position.");

            System.out.println("Product of even numbers is " + productEvenNumbers + ".");
        }
    }
}