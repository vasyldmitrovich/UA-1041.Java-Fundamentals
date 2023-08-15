package com.softserve.edu06.homework.firsttask;

public class Eagle extends FlyingBird {
    public Eagle(String nameOfBird, String feather, boolean eggLay) {
        super(nameOfBird, feather, eggLay);
    }

    @Override
    public void fly() {
        super.fly();
    }//If you do not change logic in this method than do not need to override this method there
}
