package com.softserve.edu06.hw.Task1.FlyingBirds;

import com.softserve.edu06.hw.Task1.FlyingBirds.FlyingBird;

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
