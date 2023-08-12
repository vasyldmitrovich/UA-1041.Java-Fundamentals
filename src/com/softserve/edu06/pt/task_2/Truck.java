package com.softserve.edu06.pt.task_2;

public class Truck extends Car {
    public Truck() {
    }

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Truck is running");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopped");
    }

    @Override
    public String toString() {
        return "Truck-" + super.toString();
    }
}
