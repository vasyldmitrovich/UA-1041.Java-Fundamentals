package com.softserve.edu12.Practica.task2;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            try {
                List<Plant> plants = new ArrayList<>();


                for (int i = 0; i < 5; i++) {
                    System.out.println("Let's create a plant!");
                    System.out.println("Enter the size:");
                    int size = Integer.parseInt(SCANNER.nextLine());
                    System.out.println("Enter color:");
                    String color = SCANNER.nextLine();
                    System.out.println("Enter type:");
                    String type = SCANNER.nextLine();
                    Plant plant = new Plant(size, color, type);

                    System.out.println("Your plants is:" + plant);
                    break;

                }
            } catch (ColorException | TypeException e) {
                System.out.println("Your input is incorrect!" + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number!");
            }
        }
    }
}
