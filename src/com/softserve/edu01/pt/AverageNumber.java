package com.softserve.edu01.pt;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write numbers to get average:");
        double[] number = new double[3];
        double sum = 0;
        for (int i = 0; i <= 2; i++) {
            number[i] = scanner.nextDouble();
            sum += number[i];
        }
        double result = sum / 3;

        System.out.printf("Your average is: %.2f", result);
    }
}
