package com.softserve.edu12.pt.task2;


import com.softserve.edu12.pt.task2.exception.ColorException;
import com.softserve.edu12.pt.task2.exception.TypeException;

import java.util.Scanner;

public class Task2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Plant[] plants = new Plant[5];

//        try {
//            plants[0] = new Plant(25, "RED", "FLOWER");
//            plants[1] = new Plant(50, "GREEN", "TREE");
//            plants[2] = new Plant(10, "BLUE", "SHRUB");
//            plants[3] = new Plant(75, "YELLOW", "FLOWER"); // Invalid color
//            plants[4] = new Plant(120, "RED", "TREE"); // Invalid size
//        } catch (IllegalArgumentException | ColorException | TypeException e) {
//            System.out.println(e.getMessage());
//        }

        for (int i = 0; i < plants.length; i++) {
            plants[i] = addPlant();
        }
        displayPlants(plants);
    }


    private static Plant addPlant() {

        while (true) {
            try {
                System.out.print("Enter a size of plant:");
                int size = Integer.parseInt(SCANNER.nextLine());

                Plant.verifySize(size);
                System.out.print("Enter a type of plant:");
                String type = SCANNER.nextLine();

                Plant.verifyType(type);

                System.out.print("Enter a color of plant:");
                String color = SCANNER.nextLine();

                Plant.verifyColor(color);
                return new Plant(size, color, type);
            } catch (NumberFormatException e) {
                System.out.println("Size must be integer");
                System.out.println("Please enter again");
            } catch (IllegalArgumentException | ColorException | TypeException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    private static void displayPlants(Plant[] plants) {
        for (var p : plants) {
            System.out.println(p);
            System.out.println("=".repeat(10));
        }
    }
}

