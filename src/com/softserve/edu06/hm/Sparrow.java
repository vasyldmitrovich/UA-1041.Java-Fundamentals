package com.softserve.edu06.hm;

class Sparrow extends FlyingBird {

    public Sparrow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Sparrow can fly");
    }
}
