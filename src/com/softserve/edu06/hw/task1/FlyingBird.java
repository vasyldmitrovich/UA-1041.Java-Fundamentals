package com.softserve.edu06.hw.task1;

public class FlyingBird extends Bird{


    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("This bird can flying");
    }
}
