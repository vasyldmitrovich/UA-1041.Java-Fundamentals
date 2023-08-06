package com.softserve.edu04.hw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Hw_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] listOfNumbers = new int[3];
        int i = 0;
        while (i < 3){
            System.out.println("Input a number: ");
            int myNum = scanner.nextInt();
            listOfNumbers[i] = myNum;
            i++;
        }
        Arrays.sort(listOfNumbers);
        System.out.println("The min value of array is " + listOfNumbers[0]);
        System.out.println("The max value of array is " + listOfNumbers[listOfNumbers.length-1]);
    }
}

