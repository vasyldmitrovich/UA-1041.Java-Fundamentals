package com.softserve.edu07.hw.Task2;

abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    abstract void drive();
}
