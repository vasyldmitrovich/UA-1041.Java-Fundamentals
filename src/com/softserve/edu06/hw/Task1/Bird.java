package com.softserve.edu06.hw.Task1;

abstract public class Bird {
    public String feathers;
    public int layEggs;
    abstract void fly();

    public abstract void type();

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }
}
