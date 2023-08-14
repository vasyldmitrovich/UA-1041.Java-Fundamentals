package com.softserve.edu07.hw.Task2;

public class Car extends GroundVehicle{
    private String model;

    //Move constructor there and write constructor without parameters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        super.drive();
    }

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }
}
