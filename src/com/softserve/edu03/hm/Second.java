package com.softserve.edu03.hm;

import java.util.Scanner;

public class Second {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        double number1 = sc.nextInt();
        System.out.println("Input the second number:");
        double number2 = sc.nextInt();
        System.out.println("Input the third number:");
        double number3 = sc.nextInt();
        System.out.println("The smallest number is " + leastNumber(number1, number2, number3));
    }
    public static double leastNumber(double num1, double num2, double num3){
        if (num1 < num2 && num1 < num3){
            return num1;
        }
        else if (num2 < num1 && num2 < num3){
            return num2;
        }
        else{
            return num3;
        }
    }
}
