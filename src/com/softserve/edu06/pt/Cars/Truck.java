package com.softserve.edu06.pt.Cars;

public class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Cachu");
    }

    @Override
    void stop() {
        System.out.println("I didn't come all this way to see you quit.");
    }
}
