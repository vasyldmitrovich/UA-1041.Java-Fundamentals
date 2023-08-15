package com.softserve.edu06.pt.task1;

public class Task1 {//Good

    public static void main(String[] args) {
        Car[] cars = {
                new Truck("Ford F-150", 180, 2020),
                new Sedan("Toyota Corolla", 150, 2022),
                new Truck("Chevrolet Silverado", 170, 2019),
                new Sedan("Honda Civic", 140, 2023)
        };

        for (Car car : cars) {
            System.out.println(car);
            car.run();
            car.stop();
            System.out.println("==========================");
        }
    }
}
