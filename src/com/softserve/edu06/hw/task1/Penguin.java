package com.softserve.edu06.hw.task1;

public class Penguin extends NonFlyingBird{
    public Penguin(String feathers) {
        super(feathers, true);
    }

    @Override
    public void fly() {
        System.out.println("Penguin can not fly");
    }
}
