package com.softserve.edu12.pt;

import java.util.Scanner;

public class App {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        while (true) {
            try {
                System.out.print("Enter a: ");
                int a = Integer.parseInt(SCANNER.nextLine());
                System.out.print("Enter b: ");
                int b = Integer.parseInt(SCANNER.nextLine());
                int area = Task_1.getSquareRectangle(a, b);
                System.out.println("Area of the rectangle is: " + area);
                System.out.println();
                break;
            } catch (NumberFormatException e) {
                System.out.println("You should enter an integer number.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        //Task 2
        System.out.println("Task 2");
        System.out.println("Let's create a plant.");
        while (true) {
            try {
                Plant plant = Plant.readPlant();
                System.out.println("Here is the plant " + plant);
                break;
            } catch (ColorException | TypeException e) {
                System.out.println("Your input is incorrect: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number.");
            }
        }
    }
}
