package com.softserve.edu07.hw.Task2;

public class Car extends GroundVehicle {
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    @Override
    void drive() {
        System.out.println("car is driving");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
