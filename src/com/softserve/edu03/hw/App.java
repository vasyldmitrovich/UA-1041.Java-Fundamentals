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

    public static class App {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input the first number: ");
            double x = in.nextDouble();
            System.out.print("Input the Second number: ");
            double y = in.nextDouble();
            System.out.print("Input the third number: ");
            double z = in.nextDouble();
            System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
        }

        public static double smallest(double x, double y, double z) {
            return Math.min(Math.min(x, y), z);
        }
    }
}
