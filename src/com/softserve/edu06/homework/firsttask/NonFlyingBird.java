package com.softserve.edu06.homework.firsttask;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(String nameOfBird, String feathers, boolean layEggs) {
        super(nameOfBird, feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        boolean isFLy = false;
        if (isFLy) {
            System.out.println("This bird can fly");
        } else {
            System.out.println("This bird can't fly");
        }
    }
}
