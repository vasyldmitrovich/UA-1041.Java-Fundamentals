package com.softserve.edu06.Homework.Task1;

public class Eagle extends FlyingBird{
    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Eagles are large, powerfully-built birds of prey.");

    }
}
