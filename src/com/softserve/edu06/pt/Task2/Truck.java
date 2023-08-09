package com.softserve.edu06.pt.Task2;

public class Truck extends Car{
    private int carryingCapacity;

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public Truck(String model, int maxSpeed, int yearOfProduction, int carryingCapacity) {
        super(model, maxSpeed, yearOfProduction);
        this.carryingCapacity = carryingCapacity;
    }

    public Truck() {
    }
    @Override
    public void printInfo(){
        System.out.println("Model: "+model);
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Year of production: "+yearOfProduction);
        System.out.println("Carrying capacity"+carryingCapacity);
        System.out.println();
    }
}
