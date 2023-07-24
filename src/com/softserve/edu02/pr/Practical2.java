package com.softserve.edu02.pr;

import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int number1 = sc.nextInt();
        System.out.println("Input second number: ");
        int number2 = sc.nextInt();
        System.out.println("Input third number: ");
        int number3 = sc.nextInt();
        int average  = (number1 + number2 + number3) / 3;
        System.out.println("Average is " + average);
    }
}
