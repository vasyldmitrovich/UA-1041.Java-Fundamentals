package com.softserve.edu06.hw.Task1.FlyingBirds;

public class Swallow extends FlyingBird {
    public Swallow() {
        super(true, true);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Singing a song");
    }
}
