package com.softserve.edu01.pt;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down 2 digits to calculate it:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double sum = a + b;
        double sub = a - b;
        double multi = a * b;
        double div = a / b;

        System.out.format("\nYour sum result is: %.2f", +sum);
        System.out.format("\nYour subtraction result is: %.2f", +sub);
        System.out.format("\nYour multiply result is: %.2f", +multi);
        System.out.format("\nYour divide result is: %.2f", +div);


    }
}
