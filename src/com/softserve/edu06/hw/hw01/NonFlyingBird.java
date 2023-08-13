package com.softserve.edu06.hw.hw01;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String name, String feathers, String layEggs) {
        super(name, feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This birds can't fly");
    }
}
