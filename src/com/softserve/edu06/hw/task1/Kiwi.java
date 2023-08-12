package com.softserve.edu06.hw.task1;

public class Kiwi extends NonFlyingBird{
    public Kiwi(String feathers) {
        super(feathers, true);
    }

    @Override
    public void fly() {
        System.out.println("Kiwi can not fly");
    }
}
