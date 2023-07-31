package com.softserve.edu04.hm;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number:");
        float num2 = sc.nextFloat();
        System.out.println("Enter third number:");
        float num3 = sc.nextFloat();
        if (num1>=-5 && num1 <= 5 && num2>=-5 && num2 <= 5 && num3>=-5 && num3 <= 5){
            System.out.println("All numbers are in the range [-5, 5]");
        }
        else {
            System.out.println("Not all numbers are in the range [-5, 5]");
        }
    }
}
