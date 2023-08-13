package com.softserve.edu06.hw.hw01;

public class FlyingBird extends Bird {

    public FlyingBird(String name, String feathers, String layEggs) {
        super(name, feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This birds can fly");
    }
}
