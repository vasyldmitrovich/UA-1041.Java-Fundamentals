package com.softserve.edu06.hw.Task1.FlyingBirds;

import com.softserve.edu06.hw.Task1.Bird;

class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
     public void fly() {
        System.out.println(this.getClass().getSimpleName() + " flying height in the sky");
    }

    @Override
    protected String getInfo() {
        return super.getInfo() + "\nCould fly:true";
    }
}
