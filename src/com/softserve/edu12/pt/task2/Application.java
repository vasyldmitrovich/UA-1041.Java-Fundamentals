package com.softserve.edu12.pt.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Application {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Plant> plants = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            System.out.println("Creating plant " + (i + 1));
            System.out.print("Enter size: ");
            int size = sc.nextInt();
            System.out.println("Enter color: ");
            String color = sc.next();
            System.out.println("Enter type: ");
            String type = sc.next();
            plants.add(new Plant(size, color, type));
        }

        plants.stream().forEach(System.out::println);

    }
}
