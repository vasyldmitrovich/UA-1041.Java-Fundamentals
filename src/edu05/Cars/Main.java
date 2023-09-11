package edu05.Cars;

import edu05.Cars.Car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] cars = {
                new Car("freight car", 1983, 120),
                new Car("sedan", 2020, 100),
                new Car("pickup", 2004, 700),
                new Car("sport car", 2021, 2900),
                new Car("electric car", 2020, 3000)
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