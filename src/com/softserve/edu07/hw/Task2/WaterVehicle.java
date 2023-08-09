package com.softserve.edu07.hw.Task2;

abstract class WaterVehicle extends Passengers implements Vehicle {

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    abstract void isSailing();
}
