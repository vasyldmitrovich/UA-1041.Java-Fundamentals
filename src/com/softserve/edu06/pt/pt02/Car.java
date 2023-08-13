package com.softserve.edu06.pt.pt02;

abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    public Car() {
    }

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    void run() {

    }

    void stop() {

    }

    @Override
    public String toString() {
        return "Car " +
                "model " + model +
                ", max speed= " + maxSpeed +
                ", year of production= " + yearOfProduction;
    }
}

