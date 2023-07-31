package com.softserve.edu04.hw.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        float num1 = getNumber("Input the first number: ");
        float num2 = getNumber("Input the second number: ");
        float num3 = getNumber("Input the third number: ");
        checkNumbers(num1, num2, num3);

    }

    public static float getNumber(String num) {
        Scanner sc = new Scanner(System.in);
        System.out.print(num);
        return sc.nextFloat();
    }

    public static void checkNumbers(float a, float b, float c) {
        if ((a >= -5 && b >= -5 && c >= -5) && (a <= 5 && b <= 5 && c <= 5)) {
            System.out.println("All of the numbers belong to the range [-5;5]");
        } else {
            System.out.println("Not all of the numbers belong to the range [-5;5]");
        }
    }
}



