package com.softserve.edu05.hw.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task3 {
//Nice

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {


        Car[] cars = {
                new Car("Sedan", 2015, 2.0),
                new Car("SUV", 2020, 3.5),
                new Car("Hatchback", 2018, 1.8),
                new Car("Convertible", 2019, 2.5)
        };


        System.out.println("Enter a certain year:");
        int certainYear = SCANNER.nextInt();

        SCANNER.nextLine();

        System.out.println("Cars with certain year");
        displayCars(cars, certainYear);

        System.out.println("==================================");
        System.out.println("Sorted cars by year of production");
        Arrays.sort(cars, Comparator.comparing(Car::getYear));

        displayCars(cars);
    }

    private static void displayCars(Car[] cars, int year) {
        for (var car : cars) {
            if (car.getYear() == year) System.out.println(car);
        }
    }

    private static void displayCars(Car[] cars) {
        for (var car : cars) {
            System.out.println(car);
        }
    }

}
