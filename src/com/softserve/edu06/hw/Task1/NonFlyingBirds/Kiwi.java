package com.softserve.edu06.hw.Task1.NonFlyingBirds;

public class Kiwi extends NonFlyingBird {
    public Kiwi(){
        super(false,true);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Could run");
    }
}
