package com.softserve.edu06.hw.task_1;

public abstract class Bird {
    private String name;
    private String feathers;
    private boolean layEggs;

    public Bird() {
    }

    public Bird(String name, String feathers, boolean layEggs) {
        this.name = name;
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
