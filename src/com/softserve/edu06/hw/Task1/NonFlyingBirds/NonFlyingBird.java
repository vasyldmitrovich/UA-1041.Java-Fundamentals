package com.softserve.edu06.hw.Task1.NonFlyingBirds;

import com.softserve.edu06.hw.Task1.Bird;

class NonFlyingBird extends Bird {

    protected NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }//Make public

    @Override
    protected void fly() {
        System.out.println("Sorry," + this.getClass().getSimpleName() + " couldn't fly");
    }

    @Override
    protected String getInfo() {
        return super.getInfo() + "\nCould fly:false";
    }

}
