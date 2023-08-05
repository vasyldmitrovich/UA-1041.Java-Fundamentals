package com.softserve.edu03.hw;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);
        System.out.print("Input first number: ");
        double a = getNum.nextDouble();

        System.out.print("Input second number: ");
        double b = getNum.nextDouble();

        System.out.print("Input third number: ");
        double c = getNum.nextDouble();
        //move this if to some method and call this method there
       if (a < b && a < c ) {
           System.out.print("The smallest number is: " + (int)a);
           } else if (b < a && b < c) {
           System.out.print("The smallest number is: " + (int)b);
       } else {
           System.out.print("The smallest number is: " + (int)c);
       }
       }
    }
