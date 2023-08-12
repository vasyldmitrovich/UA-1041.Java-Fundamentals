package com.softserve.edu06.pt.task_2;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Sedan("Porshe", 300, 2020),
                new Sedan("VolksWagen", 220, 2015),
                new Truck("Volvo", 180, 2018),
                new Truck("Renault", 180, 2019)
        };
        for (var car : cars
        ) {
            System.out.println(car);
        }
    }
}
