package com.softserve.edu06.hw.task1;

public class Eagle extends FlyingBird{

    public Eagle(String feathers) {
        super(feathers, true);
    }

    @Override
    public void fly() {
        System.out.println("Eagle bird can fly");
    }
}
