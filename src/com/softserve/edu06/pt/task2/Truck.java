package com.softserve.edu06.pt.task2;

public class Truck extends Car {


    @Override
    public void run() {
        System.out.println("Truck runs");
    }

    @Override
    public void stop() {
        System.out.println("Truck stops");
    }
}
