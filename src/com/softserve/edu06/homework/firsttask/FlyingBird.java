package com.softserve.edu06.homework.firsttask;

public class FlyingBird extends Bird {

    private final boolean isFLy = true;

    public FlyingBird(String nameOfBird, String feather, boolean eggLay) {
        super(nameOfBird, feather, eggLay);
    }

    @Override
    public void fly() {
        super.fly();//If in parent this method do not do anything than why you use this method there?
        if (isFLy) {
            System.out.println("This bird can fly");
        } else {
            System.out.println("This bird can't fly");
        }
    }
}
