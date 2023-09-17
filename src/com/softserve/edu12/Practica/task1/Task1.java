package com.softserve.edu12.Practica.task1;

import java.util.Scanner;

public class Task1 {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            try {

                System.out.println("Enter a:");
                int a = Integer.parseInt(SCANNER.nextLine());
                System.out.println("Enter b:");
                int b = Integer.parseInt(SCANNER.nextLine());
                int area = squareRectangle(a, b);
                System.out.println("the area of a rectangle is" + area);
                break;
            } catch (NumberFormatException e) {
                System.out.println("You should enter an integer");
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Values should be no negative");
           }
        return a * b;
    }
}
