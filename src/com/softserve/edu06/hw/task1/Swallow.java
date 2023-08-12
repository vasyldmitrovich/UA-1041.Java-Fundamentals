package com.softserve.edu06.hw.task1;

public class Swallow extends FlyingBird{
    public Swallow(String feathers) {
        super(feathers, true);
    }

    @Override
    public void fly() {
        System.out.println("Swallow bird can fly");
    }
}
