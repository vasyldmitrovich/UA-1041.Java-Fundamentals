package com.softserve.edu06.hw.task_1;

public abstract class FlyingBird extends Bird {
    private final boolean canFly = true;

    public FlyingBird() {
    }

    public FlyingBird(String name, String feathers, boolean layEggs) {
        super(name, feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(": can to fly!");
    }

    public boolean isCanFly() {
        return canFly;
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "canFly=" + canFly + "; " + super.toString() +
                '}';
    }
}
