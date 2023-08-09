package com.softserve.edu07.hw.Task2;

class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.maxHeight = maxHeight;
        this.weight = weight;
    }

    @Override
    void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    void land() {
        System.out.println("Helicopter is landing");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }
}
