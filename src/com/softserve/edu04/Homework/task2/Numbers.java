package com.softserve.edu04.Homework.task2;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        //In main method you should call another methods
        //And in this another methods should be all logic
        var scanner = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Input number 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Input number 3: ");
        int num3 = scanner.nextInt();

        int minimum;
        if (num1 <= num2 && num1 <= num3) {
            minimum = num1;
        } else if (num2 <= num1 && num2 <= num3){
            minimum = num2;

        }else {
            minimum = num3;
        }
        System.out.println("Minimum number is " + minimum);


        int maximum;
        if (num1 >= num2 && num1 >= num3) {
            maximum = num1;
        } else if (num2 >= num1 && num2 >= num3){
            maximum = num2;

        }else {
            maximum = num3;
        }
        System.out.println("Maximum number is " + maximum);

    }
}
