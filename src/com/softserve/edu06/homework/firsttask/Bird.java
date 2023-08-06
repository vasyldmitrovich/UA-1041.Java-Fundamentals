package com.softserve.edu06.homework.firsttask;

abstract class Bird {
    private String nameOfBird;
    private String feathers;
    private boolean layEggs;

    public Bird() {
    }

    public Bird(String nameOfBird, String feathers, boolean layEggs) {
        this.nameOfBird = nameOfBird;
        this.feathers = feathers;
        this.layEggs = layEggs;
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

    public void fly() {
    }

    @Override
    public String toString() {
        return "Bird{" +
                "nameOfBird='" + nameOfBird + '\'' +
                ", feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
