package com.softserve.edu12.hw.task1;

import java.util.Scanner;

public class Methods {
    static Scanner sc = new Scanner(System.in);

    public static double getNumber(String prompt) {
        System.out.print(prompt);
        return Double.parseDouble(sc.nextLine());
    }

    public static double div(double a, double b) {
        return a / b;
    }
}
