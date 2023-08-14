package com.softserve.edu06.hm;

class Kiwi extends NonFlyingBird {

    public Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Kiwi can't fly");
    }
}
