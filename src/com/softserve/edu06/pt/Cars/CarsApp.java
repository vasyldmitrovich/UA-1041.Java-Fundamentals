package com.softserve.edu06.pt.Cars;

public class CarsApp {
    static Car[] garage = {
            new Truck("Ford F-150", 140, 2001),
            new Sedan("Hyundai Verna", 135, 2017),
            new Truck("GMC Sierra 1500", 110, 2011),
            new Sedan("Honda Accord", 125, 2009),
            new Truck("Chevrolet Silverado", 140, 2001),
            new Sedan("Mercedes-Benz C-Class", 135, 2017),
            new Truck("Chevrolet Tornado", 100, 2004),
            new Sedan("BMW M340i", 135, 2018),


    };

    public static void main(String[] args) {
        printGarage();
    }

    static void printGarage() {
        for (var car : garage
        ) {
            System.out.println("-".repeat(30));
            System.out.println(car);
            car.run();
            car.stop();
            System.out.println("-".repeat(30));
        }
    }
}
