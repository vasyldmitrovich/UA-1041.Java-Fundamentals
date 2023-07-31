package com.softserve.edu04.hm;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter third number:");
        int num3 = sc.nextInt();
        System.out.println("the minimum is: " + leastNumber(num1, num2, num3));
        System.out.println("the maximum is: " + largestNumber(num1, num2, num3));
    }
    public static int leastNumber(int num1, int num2, int num3){
//        method to get minimum
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
    public static int largestNumber(int num1, int num2, int num3){
//        method to get maximum
        if (num1 > num2 && num1 > num3){
            return num1;
        }
        else if (num2 > num1 && num2 > num3){
            return num2;
        }
        else{
            return num3;
        }
    }
}
