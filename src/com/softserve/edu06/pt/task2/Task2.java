package com.softserve.edu06.pt.task2;

public class Task2 {
    public static void main(String[] args) {
        Car[] cars = {
                new Truck("MAN", 120, 2012),
                new Sedan("BMW", 210, 2018),
                new Truck("Renault", 110, 2008),
                new Sedan("Audi", 220, 2020),
                new Sedan("Mazda", 190, 2016)
        };

        for(Car car : cars){
            car.run();
            car.stop();
            System.out.println();
        }
    }
}
