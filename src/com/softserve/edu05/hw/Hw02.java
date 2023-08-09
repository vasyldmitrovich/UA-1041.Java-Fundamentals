package com.softserve.edu05.hw;

import java.util.Scanner;

public class Hw02 {
    static private final Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        int c;
        do {
            System.out.print("Enter first number: ");
            int a = SC.nextInt();
            System.out.print("Enter second number: ");
            int b = SC.nextInt();
            System.out.println(a + " + " + b + " = " + (a + b));
            System.out.print("Do yo wont want to perform the operation again (1- yes, 2- no)? ");
            c = SC.nextInt();
            System.out.println("===============================");
        } while (c == 1);
    }

}
