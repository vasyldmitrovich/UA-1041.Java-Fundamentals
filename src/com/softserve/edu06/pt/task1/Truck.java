package com.softserve.edu06.pt.task1;

public class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {

        System.out.println("Truck " + getModel() + " is running");
    }

    @Override
    public void stop() {

        System.out.println("Truck " + getModel() + " stopped");
    }
}
