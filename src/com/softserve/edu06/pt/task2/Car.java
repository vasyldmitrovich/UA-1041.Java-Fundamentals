package com.softserve.edu06.pt.task2;

public abstract class Car {
    protected String model;
    protected int maxSpeed;

    protected int yearOfProduction;

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

    public abstract void run();
    public abstract void stop();

    @Override
    public String toString() {
        return "Info:\n" +
                model + " " + yearOfProduction +
                "\nMax speed: " + maxSpeed;
    }
}
