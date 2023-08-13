package com.softserve.edu06.hw.hw01;

abstract class Bird {
    private String name;
    private String feathers;
    private String layEggs;


    public Bird() {
    }

    public Bird(String name, String feathers, String layEggs) {
        this.name = name;
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", feathers='" + feathers + '\'' +
                ", layEggs='" + layEggs + '\'' +
                '}';
    }

    public abstract void fly();
}
