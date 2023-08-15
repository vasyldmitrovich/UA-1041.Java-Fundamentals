package com.softserve.edu05.hw;
import java.util.Scanner;

public class task1_2 {//Rename class to Task1_2.java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 10;
        int[] arr = new int[maxNumber];
        int min;

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        min = arr[0]; // Initialize min to the first element of the array
        int position = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                position = i;
            }
        }

        int secondPositivePosition = 0;
        int countPositive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPositive++;
                if (countPositive == 2) {
                    secondPositivePosition = i;
                    break;
                }
            }
        }

        int product = 1;
        for (int num : arr) {
            if (num != 0 && num % 2 == 0) {
                product *= num;
            }
        }

        System.out.println("Position of the second positive number: " + secondPositivePosition);
        System.out.println("Min value " + min + " is on position " + position);
        System.out.println("Product of all even numbers: " + product);
    }
}
