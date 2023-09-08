package com.softserve.edu12.pt;

import java.util.Scanner;

public class Pt01 {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Enter side a: ");
                int a = Integer.parseInt(SC.nextLine());
                System.out.println("Enter side b: ");
                int b = Integer.parseInt(SC.nextLine());
                System.out.println("Area of the rectangle is " + rectangleArea(a, b));
                break;
            } catch (NumberFormatException e) {
                System.out.println("You should enter an integer");
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static int rectangleArea(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Sides should be non negative");
        }
        return a * b;
    }
}
