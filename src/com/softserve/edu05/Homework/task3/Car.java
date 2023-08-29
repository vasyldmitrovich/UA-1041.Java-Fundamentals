package com.softserve.edu05.Homework.task3;



import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car("Truck", 2018, 3.2),
                new Car("Sport", 2021, 3.1),
                new Car("Sedan", 2015, 1.5),
                new Car("Crossover", 2023, 2.5),

        };
        System.out.println("Enter year_of_production: ");
        Scanner scan = new Scanner(System.in);
        int year_of_production = scan.nextInt();

        for (var car : cars) {
            if (car.getYear_of_production() == year_of_production) {
                System.out.println(car);
            }
        }
        System.out.println("Your car sort:");

        Arrays.sort(cars, Comparator.comparing(
                Car::getYear_of_production
        ));
        for (var car : cars) {
            System.out.println((car));


        }

    }
    private String type;
    private int year_of_production;
    private double engine_capacity;

    public Car() {
    }

    public Car(String type, int year_of_production, double engine_capacity) {
        this.type = type;
        this.year_of_production = year_of_production;
        this.engine_capacity = engine_capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(int year_of_production) {
        this.year_of_production = year_of_production;
    }

    public double getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(double engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year_of_production=" + year_of_production +
                ", engine_capacity=" + engine_capacity +
                '}';
    }
}
