package com.softserve.edu06.hw.task1;

public class Penguin extends NonFlyingBird{
    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Penguin:\n" +
                "feathers: " + feathers +
                "\nlay eggs: " + (layEggs ? "Yes" : "No");
    }
}
