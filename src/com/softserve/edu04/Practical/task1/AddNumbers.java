package com.softserve.edu04.Practical.task1;


import java.util.Scanner;

public class AddNumbers {
        public static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Input number 2: ");
        int num2 = scanner.nextInt();

        System.out.println("Input number 3: ");
        int num3 = scanner.nextInt();



        if (num1 % 2 != 0) {
           count++;
            System.out.println(num1 + "\t"  + "is add number ");
        } else
            System.out.println(num1 + "\t" + "is even number ");

        if (num2 % 2 != 0) {
            count++;
            System.out.println(num2 + "\t" + "is add number ");
        } else
            System.out.println(num2 + "\t" + "is even number ");

        if (num3 % 2 != 0) {
           count++;
            System.out.println(num3 + "\t"  + "is add number ");
        } else
            System.out.println(num3 + "\t" + "is even number ");
        System.out.println("Add numbers are " + "\t" + AddNumbers.count);








        }



    }










