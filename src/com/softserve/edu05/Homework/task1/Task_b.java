package com.softserve.edu05.Homework.task1;


import java.util.Scanner;

public class Task_b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[10]; // Створення масиву array розміру size
        System.out.println("Input array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt(); // Заповнення масиву
        }
        System.out.print("Inserted array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]); // Виведення введених раніше значень
        }
        System.out.println();
        System.out.println("The sum of positive numbers is :" + sumPositive(array));
        System.out.println("The product of negative numbers is :" + ProductNegative(array));
    }

    static int sumPositive(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length/2; i++) {
            if (i < 5) {
            }
            if (array[i] > 0) {
                sum += array[i];

            }

        }
        return sum;
    }


        static int ProductNegative ( int[] array){
            int product = 1;
            for (int n = 5; n < array.length; n++) {

                if (array[n] < 0) {

                    product *= array[n];

                }


            }
            return product;
        }
    }













