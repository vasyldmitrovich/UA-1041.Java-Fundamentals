package com.softserve.edu03.hw;

import java.util.Scanner;

public class Hw02 {//Good
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = scanner.nextInt();
        System.out.print("Input the second number: ");
        int b = scanner.nextInt();
        System.out.print("Input the third number: ");
        int c = scanner.nextInt();
        int smallest = Math.min(a, Math.min(b, c));

        System.out.println("The smallest number is " + smallest);
    }
}
