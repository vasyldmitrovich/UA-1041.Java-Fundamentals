package com.softserve.edu06.pt.Cars;

public class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("One winner, 42 losers. I eat losers for breakfast.");
    }

    @Override
    void stop() {
        System.out.println("I decide when I’m done.");
    }
}
