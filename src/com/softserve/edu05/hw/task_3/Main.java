package com.softserve.edu05.hw.task_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] cars = {
                new Car("passenger", 1990, 150),
                new Car("truck", 2010, 1000),
                new Car("bus", 2000, 400),
                new Car("racing", 2010, 1500),
                new Car("passenger", 2015, 200)
        };
        System.out.println(Arrays.toString(cars));
        System.out.println("Enter model year:");
        int year = sc.nextInt();

        findCarToYear(cars, year);
        Arrays.sort(cars, Comparator.comparing(Car::getYearOfProduction));
        System.out.println(Arrays.toString(cars));


    }

static void findCarToYear(Car[] cars, int year) {//Good
        int count = 0;
        for (var el : cars
        ) {
            if (el.getYearOfProduction() == year) {
                System.out.println(el);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("car with this year was not found!");
        }
    }
}
