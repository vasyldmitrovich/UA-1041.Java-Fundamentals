package com.softserve.edu06.Homework.Task1;

public class Penguin extends NonFlyingBird{
    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        super.fly();
        System.out.println("Penguins are a group of aquatic flightless birds");
    }
}
