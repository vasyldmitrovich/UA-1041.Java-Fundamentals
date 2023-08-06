package com.softserve.edu05.hw.Task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Car[] cars=new Car[]{
                new Car("Sedan",2005,200),
                new Car("Crossover",2023,236),
                new Car("Coupe",2009,179),
                new Car("Sport",2010,368),
                new Car("Minivan",2013,120),
        };
        System.out.println("Enter model: ");
        String m=scaner.nextLine();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getType().equals(m)) {
                System.out.println(cars[i].toString());
            }
        }
        System.out.println();
        Arrays.sort(cars, Comparator.comparing(
                Car::getYear
        ));
        for (var car : cars) {
            System.out.println(car);
        }
    }
}
