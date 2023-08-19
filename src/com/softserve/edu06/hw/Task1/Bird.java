package com.softserve.edu06.hw.Task1;

public abstract class Bird {
    private boolean feather;
    private boolean layEggs;

    protected Bird(boolean feathers, boolean layEggs) {
        this.feather = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public boolean isFeather() {
        return feather;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setFeather(boolean feather) {
        this.feather = feather;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    protected String getInfo() {
        return this.getClass().getSimpleName() +
                "\nfeather=" + feather +
                "\nlayEggs=" + layEggs;
    }
}
