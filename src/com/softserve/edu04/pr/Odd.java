package com.softserve.edu04.pr;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {

        //Do not write all logic in main method
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = sc.nextInt();
        System.out.println("enter second number:");
        int num2 = sc.nextInt();
        System.out.println("enter third number:");
        int num3 = sc.nextInt();
        System.out.println(count(num1, num2, num3));
    }
    public static int count(int num1, int num2, int num3) {
        int count = 0;
        if (num1 % 2 != 0) {
            count++;
        }
        if (num2 % 2 != 0) {
            count++;
        }
        if (num3 % 2 != 0) {
            count++;
        }
        return count;
    }
}
