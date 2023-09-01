package com.softserve.edu12.pt.task1;

import java.util.Scanner;

public class SquareRectangle {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.print("Enter a: ");
                int a = Integer.parseInt(sc.nextLine());
                System.out.print("Enter b: ");
                int b = Integer.parseInt(sc.nextLine());
                int area = squareRectangle(a, b);
                System.out.println("Area of rectangle is: " + area);
                break;
            }catch (NumberFormatException ex){
                System.out.println("You must enter an Integer");
            }
            catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public static int squareRectangle(int a, int b){
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Sides must be positive");
        }
        return a * b;
    }
}