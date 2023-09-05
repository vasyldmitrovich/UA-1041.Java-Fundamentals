package com.softserve.edu12.hw.task2;

import java.util.Scanner;

public class Methods {
    static Scanner sc = new Scanner(System.in);

    public static int readNumber(int start, int end) {
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(sc.nextLine());
        if (number > start && number < end) {
            return number;
        } else {
            String message = number < start ? "Number is too small" : "Number is too big";
            throw new NumberFormatException(message);
        }
    }
}

