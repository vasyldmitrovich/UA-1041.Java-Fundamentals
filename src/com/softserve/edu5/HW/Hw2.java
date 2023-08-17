package com.softserve.edu5.HW;

import java.util.Scanner;

public class Hw2 {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int userChoice = 1;
        do {
            System.out.println("Input first number ");
            int firstNum = SCANNER.nextInt();
            System.out.println("Input second number ");
            int secondNum = SCANNER.nextInt();
            System.out.println("Sum of two number = " + (firstNum + secondNum));
            System.out.println("If you want sum two new number enter ( 1 ) , or other symbol for stop program");
            userChoice = SCANNER.nextInt();
        }
        while (userChoice == 1) ;


    }
}
