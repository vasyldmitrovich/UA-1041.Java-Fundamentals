package com.softserve.edu06.homework.firsttask;

public class Penguin extends NonFlyingBird {
    public Penguin(String nameOfBird, String feathers, boolean layEggs) {
        super(nameOfBird, feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
    }
}
