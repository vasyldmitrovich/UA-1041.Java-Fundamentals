package com.softserve.edu06.pt.task2;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Engine in sedan " + model + " was started");
        System.out.println(this);
    }

    @Override
    public void stop() {
        System.out.println("Engine in sedan " + model + " was stopped");
    }
}
