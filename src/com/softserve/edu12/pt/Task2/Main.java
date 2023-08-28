package com.softserve.edu12.pt.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scaner=new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Size");
                int size=scaner.nextInt();
                scaner.nextLine();
                System.out.println("Color");
                String color=scaner.nextLine();
                System.out.println("Type");
                String type=scaner.nextLine();
                Plant plant=new Plant(size,color,type);
                System.out.println(plant);
                break;
            } catch (ColorException | TypeException e) {
                System.out.println("Incorrect input");
                System.out.println(e.getMessage());
            }
        }
    }
}

