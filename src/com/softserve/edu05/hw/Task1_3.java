package com.softserve.edu05.hw;
import com.sun.nio.sctp.SctpStandardSocketOptions;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int[] array = new int[5];
        boolean f = true;
        int counterOfPositive = 0;
        int positionOfSecondPositive=0;
        int positionOfMinimum=0;
        int productOfAllEeven=1;
        int d = 1;
        int min= Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number № " + (i + 1) + " ");
            array[i] = scaner.nextInt();
            if (array[i] >= 0) {
                counterOfPositive++;
            }
            if(counterOfPositive==2){
                positionOfSecondPositive=i+1;
            }
            if(array[i]<min){
                min=array[i];
            }
            if(array[i]%2==0){
                productOfAllEeven*=array[i];
            }

        }
        for (int i = 0; i < 5; i++) {
            if(min==array[i]){
                positionOfMinimum=i+1;
            }
        }
        System.out.println("position of second positive number: "+(positionOfSecondPositive));
        System.out.println("minimum value and its position in the array: "+(min)+" "+(positionOfMinimum));
        System.out.println("the product of all entered even numbers: "+(productOfAllEeven));
    }
}



