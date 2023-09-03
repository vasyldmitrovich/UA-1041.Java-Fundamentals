package com.softserve.edu12.hm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNumber {
    public static int readNumber(int start, int end) {
        Scanner sc = new Scanner(System.in);
        int toCheckNum = sc.nextInt();
        try {
            if (start > toCheckNum | toCheckNum > end) {
                throw new IllegalArgumentException("The number should be i a range");
            }
            return toCheckNum;
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input, please enter valid numbers");
        }
        return toCheckNum;
    }
}
