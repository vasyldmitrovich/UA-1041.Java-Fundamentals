package com.softserve.edu06.hw.task1;

public class Kiwi extends NonFlyingBird{
    public Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Kiwi:\n" +
                "feathers: " + feathers +
                "\nlay eggs: " + (layEggs ? "Yes" : "No");
    }
}
