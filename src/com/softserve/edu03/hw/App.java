package com.softserve.edu03.hw;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side 1 : ");
        int num1 = scanner.nextInt();
        System.out.println("input side 2: ");
        int num2 = scanner.nextInt();

        System.out.println("input side 3: ");
        int num3 = scanner.nextInt();
        System.out.println("The area of the triangle:" + (num1 + num2 + num3));
    }
}
