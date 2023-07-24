package com.softserve.edu01.pt;

import java.util.Scanner;

public class pt03 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = scanner.nextInt();
        System.out.print("Enter b = ");
        int b = scanner.nextInt();
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/ (double) b));
    }
}
