package com.softserve.edu05.hw.task3;

public class App {
    public static void main(String[] args) {
        Car[] car = {new Car("Race car", 2021, 6),
                new Car("Sedan", 2019, 1.6),
                new Car("Touring", 2020, 2),
                new Car("Sport car", 2022, 3.5),
        };
        int model = Car.getYear("Enter the year of car production: ");
        Car.getModelYear(car, model);
        System.out.println("Cars sorted by the year of production: ");
        Car.sortByYear(car);
    }
}
