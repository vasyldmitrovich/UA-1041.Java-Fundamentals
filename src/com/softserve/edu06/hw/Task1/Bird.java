package com.softserve.edu06.hw.Task1;

public abstract class Bird {
    boolean feather;//Make private and add getters and setters
    boolean layEggs;

    protected Bird(boolean feathers, boolean layEggs) {
        this.feather = feathers;
        this.layEggs = layEggs;
    }

    protected abstract void fly();//Without protected

    protected boolean isFeather() {
        return feather;
    }

    protected boolean isLayEggs() {
        return layEggs;
    }

    protected String getInfo() {
        return this.getClass().getSimpleName() +
                "\nfeather=" + feather +
                "\nlayEggs=" + layEggs;
    }
}
