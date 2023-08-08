package com.softserve.edu06.hw.Task1.FlyingBirds;

import com.softserve.edu06.hw.Task1.FlyingBirds.FlyingBird;

public class Swallow extends FlyingBird {
    public Swallow(){
        super(true,true);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Singing a song");
    }
}
