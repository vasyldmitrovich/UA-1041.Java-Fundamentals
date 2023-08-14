package com.softserve.edu06.pr;

class Sedan extends Car {

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("The sedan is running");
    }

    void stop() {
        System.out.println("The sedan stopped");
    }
}
