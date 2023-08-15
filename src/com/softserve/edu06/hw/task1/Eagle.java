package com.softserve.edu06.hw.task1;

public class Eagle extends FlyingBird{
    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle:\n" +
                "feathers: " + feathers +
                "\nlay eggs: " + (layEggs ? "Yes" : "No");
    }
}
