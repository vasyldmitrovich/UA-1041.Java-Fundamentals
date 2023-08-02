import java.util.Scanner;
/*
 * Look in the package com.softserve.edu03.pt
 * I rewrite your code
 * All your packages and classes should look like they
 * Because I could not run your code and see what your program show
 *
 * */
public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    static double s1 = 0, s2 = 0, s3 = 0;

    static double calcArea(double s1, double s2, double s3)
    {
        double sp = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(sp * (sp - s1) * (sp - s2) * (sp - s3));
        return area;
    }

    public static void main(String[] args) {

        System.out.println("Input Side 1: ");
        s1 = SCANNER.nextDouble();
        System.out.println("Input Side 2: ");
        s2 = SCANNER.nextDouble();
        System.out.println("Input Side 3: ");
        s3 = SCANNER.nextDouble();
        System.out.printf("\nThe area of triangle is %.2f", calcArea(s1,s2,s3));
    }
}