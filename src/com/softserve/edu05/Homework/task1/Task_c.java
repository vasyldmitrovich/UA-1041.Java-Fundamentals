package com.softserve.edu05.Homework.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[5]; // Створення масиву array розміру size
        System.out.println("Input array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt(); // Заповнення масиву
        }
        System.out.print("Inserted array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]); // Виведення введених раніше значень
        }
        System.out.println();
        System.out.println("Second positive number in position :" + secondposition(array) );
        System.out.println("minimum value is :" + " " + min(array) + " " + "in position"+ " " + linerSearch(array,min(array)));
        System.out.println("Product all even numbers is :"+ " " + product_even(array));


    }

   static int secondposition(int[] array) {

       int secPos = 0;
       int count = 0;
       for (int i = 0; i <= array.length - 1; i++) {
           if (array[i] >= 0 && count <= 2) {
               count++;
               secPos = i;
           }
       }
       return secPos;
   }
   static int min(int[] array) {

       var min = Integer.MAX_VALUE;
       for (int n : array) {
           if (n < min) {
               min = n;

           }
       }
       return min;


   }
   static int linerSearch (int[] array,int min) {

       for (int i=0;i<array.length;i++) {
           if (array[i] == min) {
               return i;
           }
       }

       return -1;
   }
   static int product_even (int[] array) {
        int product = 1;
        for (int i=0;i< array.length;i++) {
            if (array[i]%2==0) {
                product*=array[i];
            }
        }
        return product;
   }


}
