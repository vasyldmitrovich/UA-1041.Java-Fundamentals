package com.softserve.edu06.hw.hw01;

public class Penguin extends NonFlyingBird{

    public Penguin(String name, String feathers, String layEggs) {
        super(name, feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
    }
}
