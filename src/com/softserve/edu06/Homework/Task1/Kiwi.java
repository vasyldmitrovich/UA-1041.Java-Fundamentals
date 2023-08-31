package com.softserve.edu06.Homework.Task1;

public class Kiwi extends NonFlyingBird{
    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        super.fly();
        System.out.println("Kiwi can't fly,but have a well-developed sense of smell.");
    }
}
