package com.softserve.edu06.practicaltasts;

public class Main {
    public static void main(String[] args) {
        Car[] vehicles = {
                new Truck("Volvo", 95, 2019),
                new Sedan("Porsche", 280, 2015),
                new Truck("MAZ", 90, 2015),
                new Sedan("Mazda", 160, 2017),
                new Truck("Mercedes", 100, 2020),
                new Sedan("Honda", 260, 2020)
        };

        for(var cars : vehicles){
            System.out.println(cars);
            cars.run();
            cars.stop();
            System.out.println("---------------------------------");
        }
    }
}
