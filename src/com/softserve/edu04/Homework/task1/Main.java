package com.softserve.edu04.Homework.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Input number 1: ");
        float number1 = scanner.nextFloat();

        System.out.print("Input number 2: ");
        float number2 = scanner.nextFloat();

        System.out.print("Input number 3: ");
        float number3 = scanner.nextFloat();




        if  (number1 <= 5 && number2 <= 5 && number3 <= 5 && number1 >= -5 && number2 >=-5 && number3 >=-5) {
            System.out.println("All numbers belong the range");

       } else {
            System.out.println("Numbers are not all belong the range");
        }

    }
}
