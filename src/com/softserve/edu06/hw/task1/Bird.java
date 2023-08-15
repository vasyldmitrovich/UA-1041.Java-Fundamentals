package com.softserve.edu06.hw.task1;

public abstract class Bird {

    private String feathers;

    private boolean layEggs;


    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    //Add getters and setters for manipulate fields

    public abstract void fly();//Do not need to write public abstract, this method will be public abstract by default
}
