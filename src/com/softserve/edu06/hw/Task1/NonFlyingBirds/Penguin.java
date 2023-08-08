package com.softserve.edu06.hw.Task1.NonFlyingBirds;

public class Penguin extends NonFlyingBird {
    public Penguin() {
        super(true, true);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Could swim");
    }
}
