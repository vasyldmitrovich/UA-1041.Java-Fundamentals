package com.softserve.edu06.Homework.Task1;

public class Swallow extends FlyingBird {
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        super.fly();
        System.out.println("Swallow found around the world on all continents");
    }
}
