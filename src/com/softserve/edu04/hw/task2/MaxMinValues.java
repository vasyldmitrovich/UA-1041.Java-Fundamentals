package com.softserve.edu04.hw.task2;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinValues {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNumber = getNumber("Input first number: ");
        int secondNumber = getNumber("Input second number: ");
        int thirdNumber = getNumber("Input third number: ");

        maxAndMinValue(firstNumber, secondNumber, thirdNumber);
    }

    public static int getNumber(String prompt){
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static void maxAndMinValue(int... numbers){
        Arrays.sort(numbers);
        System.out.format("Max value: %d\nMin value: %d\n", numbers[0], numbers[numbers.length-1]);
    }

}
