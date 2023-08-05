package com.softserve.edu05.pt.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        checkNumber(arr, getPositiveNumber());
    }


    public static int getPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Input a positive number: ");
            number = sc.nextInt();
        } while (number < 1);
        return number;
    }

    public static void checkNumber(int[] arr, int number) {
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                check = arr[i] == number;
            }
        }
        if (check == true) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " isn't a prime number.");
        }
    }
}

