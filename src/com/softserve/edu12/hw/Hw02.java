package com.softserve.edu12.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Hw02 {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int[] numbers = new int[10];

        int i = 0;
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = readNumber(start, end);
            start = numbers[i];
        }
        System.out.println("Entered numbers: " + Arrays.toString(numbers));
    }





    private static int readNumber(int start, int end) {

        while (true) {
            try {
                System.out.printf("Enter numbers in the range [%s, %s]: ", start, end);
                int number = Integer.parseInt(SC.nextLine());
                if (number < start || number > end) {
                    throw new IllegalArgumentException("'Number should be in the range [%s, %s]'\n");
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("'Number should be an integer'");
            } catch (IllegalArgumentException e) {
                System.out.printf(e.getMessage(),start, end);
            }
        }
    }
}


