package com.softserve.edu06.hw.Task1.FlyingBirds;

public class Eagle extends FlyingBird {
    public Eagle() {
        super(true, true);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Protecting America");
    }
}
