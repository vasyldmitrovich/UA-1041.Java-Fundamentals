package com.softserve.edu06.pt.task1;

public class Sedan extends Car {

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan " + getModel() + " is running");
    }

    @Override
    public void stop() {
        System.out.println("Sedan " + getModel() + " stopped");
    }
}
