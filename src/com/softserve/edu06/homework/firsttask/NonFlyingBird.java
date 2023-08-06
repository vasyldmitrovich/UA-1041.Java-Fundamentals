package com.softserve.edu06.homework.firsttask;

public class NonFlyingBird extends Bird {

    private final boolean isFLy = false;

    public NonFlyingBird(String nameOfBird, String feathers, boolean layEggs) {
        super(nameOfBird, feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        if (isFLy) {
            System.out.println("This bird can fly");
        } else {
            System.out.println("This bird can't fly");
        }
    }
}
