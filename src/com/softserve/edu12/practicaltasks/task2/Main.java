package com.softserve.edu12.practicaltasks.task2;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Let's create a plant");
                Plant plant = Plant.read();
                System.out.println("Here is the plant: " + plant);
                break;
            } catch (ColorException | TypeException e) {
                System.out.println("You input is incorrect " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number");
            }
        }
    }
}
