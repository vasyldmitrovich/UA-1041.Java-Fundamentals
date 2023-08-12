package com.softserve.edu06.pt.task_2;

public class Sedan extends Car {

    public Sedan() {
    }

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan is running");
    }

    @Override
    public void stop() {
        System.out.println("Sedan is stopped");
    }

    @Override
    public String toString() {
        return "Sedan-" + super.toString();
    }
}