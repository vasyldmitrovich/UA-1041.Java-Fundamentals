package com.softserve.edu06.hw.task_1;

public class NonFlyingBird extends Bird {
    private final boolean canFly = false;

    public NonFlyingBird() {
    }

    public NonFlyingBird(String name, String feathers, boolean layEggs) {
        super(name, feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(": can`t to fly!");
    }

    public boolean isCanFly() {
        return canFly;
    }

    @Override
    public String toString() {
        return "NonFlyingBird{" +
                "canFly=" + canFly + "; " + super.toString() +
                '}';
    }
}
