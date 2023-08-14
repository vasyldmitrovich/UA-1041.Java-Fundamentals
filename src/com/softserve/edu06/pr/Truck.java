package com.softserve.edu06.pr;

class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("The truck is running");
    }

    void stop() {
        System.out.println("The truck stopped");
    }
}
