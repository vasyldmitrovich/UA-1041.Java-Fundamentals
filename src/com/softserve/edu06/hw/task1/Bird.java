package com.softserve.edu06.hw.task1;

public abstract class Bird {
    protected String feathers;
    protected boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    abstract void fly();
}
