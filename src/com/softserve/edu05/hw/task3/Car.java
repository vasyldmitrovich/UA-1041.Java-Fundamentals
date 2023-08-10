package com.softserve.edu05.hw.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public static int getYear(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static void getModelYear(Car[] car, int year) {
        for (var cars : car) {
            if (cars.getYearOfProduction() == year) {
                System.out.println(cars);
            }
        }
    }

    public static void sortByYear(Car[] car) {
        Arrays.sort(car, Comparator.comparing(Car::getYearOfProduction));
        for (var cars : car) {
            System.out.println(cars);
        }
    }
}
