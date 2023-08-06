package com.softserve.edu04.hw.task1;

import java.util.Scanner;
import java.util.stream.Stream;

public class BelongRange {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        float firstNumber = getNumber("Input first number: ");
        float secondNumber = getNumber("Input second number: ");
        float thirdNumber = getNumber("Input third number: ");

        checkBelongRange(firstNumber, secondNumber, thirdNumber);
    }

    public static float getNumber(String prompt){
        System.out.print(prompt);
        return sc.nextFloat();
    }

    public static void checkBelongRange(float... numbers){
        for (float d : numbers) {
            if(d >= -5 && d <= 5){
                System.out.format("%.2f belong to the range [-5, 5]\n", d);
            }else
                System.out.format("%.2f doesn\'t belong to the range [-5, 5]\n", d);
        }
    }

}
