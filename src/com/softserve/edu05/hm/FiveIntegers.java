package com.softserve.edu05.hm;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;

public class FiveIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers:");


        //Divide logic in separate method and there call this methods
        int[] numArray = new int[5];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > 0) {
                count += 1;
                if (count == 2) {
                    System.out.println("Second positive number " + numArray[i]);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] != 0 && numArray[i] % 2 == 0) {
                sum += numArray[i];
            }
        }
            Arrays.sort(numArray);
            System.out.println("The minimum value and it`s position are:" + numArray[0] + ", 0");
            System.out.println("the product of all entered even numbers: " + sum);
        }
    }
