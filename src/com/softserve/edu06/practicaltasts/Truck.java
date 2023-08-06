package com.softserve.edu06.practicaltasts;

public class Truck extends Car {
    public Truck() {
    }

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void stop() {
        super.stop();
    }
}
