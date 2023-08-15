package com.softserve.edu06.pt.task2;

public class Truck extends Car{
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Engine in truck " + model + " was started");
        System.out.println(this);
    }

    @Override
    public void stop() {
        System.out.println("Engine in truck " + model + " was stopped");
    }
}
