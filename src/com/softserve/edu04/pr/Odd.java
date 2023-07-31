package com.softserve.edu04.pr;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = sc.nextInt();
        System.out.println("enter second number:");
        int num2 = sc.nextInt();
        System.out.println("enter third number:");
        int num3 = sc.nextInt();
        int count = 0;
        if (num1 % 2 != 0) {
            count++;
        }
        if (num2 % 2 != 0) {
            count++;
        }
        if (num3 % 2 != 0){
            count++;
        }
        System.out.println(count);
    }
}
