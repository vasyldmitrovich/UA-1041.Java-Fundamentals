package com.softserve.edu06.pt.pt02;

public class CarMain {//All good
    public static void main(String[] args) {
        Car[] cars = {
                new Sedan("Scoda Rapid", 240, 2019),
                new Sedan("Kia Seed", 220, 2021),
                new Sedan("Toyota LC-200", 220, 2017),
                new Truck("Daf XF", 160, 2015),
                new Truck("Volvo FH", 140, 2023),
                new Truck("Renault Magnum", 120, 2004),
        };

        for (Car car : cars) {
            System.out.println(car);
            car.run();
            car.stop();
        }
    }
}
