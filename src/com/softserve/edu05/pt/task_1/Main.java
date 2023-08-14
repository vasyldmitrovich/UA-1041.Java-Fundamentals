package com.softserve.edu05.pt.task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //• Create a string array and sort it.

        /*You can create some method, that method return for example array of strings , in this method call that method, and you code will be more readable
        * */
        String[] strings = {
                "Labrador",
                "Poodle",
                "Bulldog",
                "Beagle",
                "Dachshund"
        };
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println("sort:" + Arrays.toString(strings));
        System.out.println();

        //• Create an array with 5 elements and calculate the average value
        double[] doubles = {1.2, 6.0, 4.1, 5.0, 17.5};

        double sum = 0.0;
        for (var el : doubles
        ) {
            sum += el;
        }
        double average = sum / doubles.length;
        System.out.println(Arrays.toString(doubles));
        System.out.println("the average value is: " + average);
        double value = getNumber("enter any number (use ','): ");

        //• Сheck if the array (any of the previous ones) contains the value ( value enter from the
        //console). Output the result of the search.
        containsValue(value, doubles);
    }

    private static void containsValue(double value, double[] doubles) {
        boolean contain = false;
        for (var el : doubles
        ) {
            if (el == value) {
                System.out.println("Array contains value:" + value);
                contain = true;
                break;
            }
        }
        if (!contain) {
            System.out.println("Array not contain value:" + value);
        }

    }

    public static double getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextDouble();
    }
}
