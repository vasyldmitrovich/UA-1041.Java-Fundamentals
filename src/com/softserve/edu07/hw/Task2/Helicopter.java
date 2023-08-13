package com.softserve.edu07.hw.Task2;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void land() {
        super.land();
    }

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }
}
