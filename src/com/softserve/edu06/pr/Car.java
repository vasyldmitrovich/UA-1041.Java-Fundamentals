package com.softserve.edu06.pr;

import java.util.Arrays;
import java.util.Objects;

abstract class Car {
    abstract void run();

    abstract void stop();

    String model;
    int maxSpeed;
    int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", maxSpeed=" + maxSpeed + ", yearOfProduction=" + yearOfProduction + '}';
    }
}

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
