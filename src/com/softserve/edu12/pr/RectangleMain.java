package com.softserve.edu12.pr;

import java.util.Scanner;

public class RectangleMain {
static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a:");
        int a = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Enter b:");
        int b = Integer.parseInt(SCANNER.nextLine());
        int area = Rectangle.rectangleArea(a, b);
        System.out.println("Area of the rectangle is "+ area);
    }
}
