package com.softserve.edu06.pt.task2;

public class Sedan extends Car {


    @Override
    public void run() {
        System.out.println("Sedan runs");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stops");
    }
}
