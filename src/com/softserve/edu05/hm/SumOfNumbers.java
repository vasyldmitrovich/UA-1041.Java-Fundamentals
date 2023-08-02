package com.softserve.edu05.hm;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = new int[10];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numArray));
        boolean track = true;
        for (int j = 0; j < 6; j++) {
            if (numArray[j] < 0) {
                track = false;
                break;
            }
        }
        int finalSum = 0;
        if (track) {
            for (int j = 0; j < 5; j++) {
                finalSum += numArray[j];
            }
        } else {
            for (int k = 5; k < numArray.length; k++) {
                finalSum += numArray[k];

            }
        }
        System.out.println("The result is:" + finalSum);
    }
}
