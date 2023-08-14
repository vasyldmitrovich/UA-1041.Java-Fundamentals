package com.softserve.edu05.hw.task_1;

import java.util.Scanner;

public class Integer5Numbers {//Perfect
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] integers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter " + (i + 1) + "st integer number:");
            integers[i] = sc.nextInt();
        }

        // position of second positive number;
        int position = positionOfSecondPositiveNumber(integers);
        if (position == -1) {
            System.out.println("array don't have second positive number!");
        } else {
            System.out.println("position of second positive number:" + (position + 1));
        }

        //minimum value and its position in the array.
        int minPosition = findMinPosition(integers);
        System.out.println("minimum value is: " + integers[minPosition] + ", and its position in the array:" + (minPosition + 1));

        //calculate the product of all entered even numbers (exclude 0 from even if entered by user).
        long productEventNumb = calculateProductEventNumb(integers);
        System.out.println("the product of all entered even numbers:" + productEventNumb);
    }

   static long calculateProductEventNumb(int[] integers) {
        long prod = 1;
        for (int el : integers
        ) {
            if (el != 0) {
                prod *= el;
            }

        }
        return prod;
    }

    static int findMinPosition(int[] integers) {
        int minPos = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] < minPos) {
                minPos = i;
            }
        }
        return minPos;
    }

   static int positionOfSecondPositiveNumber(int[] integers) {
        int count = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > 0) {
                count++;
                if (count == 2) {
                    return i;
                }
            }
        }

        return -1;
    }
}
