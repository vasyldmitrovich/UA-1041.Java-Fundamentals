package com.softserve.edu05.hw;

import java.util.Scanner;

public class Hw02 {
    static private final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int response;
        do {
            System.out.print("Enter first number: ");
            int num1 = SC.nextInt();
            System.out.print("Enter second number: ");
            int num2 = SC.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            System.out.print("Do yo wont want to perform the operation again (1- yes, 2- no)? ");
            response = SC.nextInt();
            System.out.println("===============================");
        } while (response == 1);
    }

}
