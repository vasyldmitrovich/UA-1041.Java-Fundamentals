package com.softserve.edu05.hw.task2;

import java.util.Scanner;

public class RepeatSum {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sw;
        do {
            int fNum  = getNumber("Input first number: ");
            int sNum = getNumber("Input second number: ");
            System.out.println("Sum: " + (fNum + sNum));
            sw = getNumber("If you want to continue, press positive value, otherwise, negative: ");
        } while (sw >= 0);
    }
    public static int getNumber(String prompt){
        System.out.print(prompt);
        return sc.nextInt();
    }
}
