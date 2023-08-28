package com.softserve.edu12.hw.Task2;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        System.out.println("Enter upper limit");
        int upper = scaner.nextInt();
        System.out.println("Enter lower limit");
        int lower = scaner.nextInt();
        while (true) {
            try {
            readNumber(upper,lower);
            break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Enter an integer");
            }
        }
    }

    public static void readNumber(int start, int end) {
        var scaner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number " + i);
            int number = scaner.nextInt();
            if (!(number <= start && number >=end) ) {
                throw new IllegalArgumentException("Enter the numbers in the space between "+start+" and "+end);
            }

        }


    }
}

