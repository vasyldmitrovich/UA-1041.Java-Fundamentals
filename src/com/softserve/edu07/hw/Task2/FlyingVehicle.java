package com.softserve.edu07.hw.Task2;

import java.sql.SQLOutput;

public class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle(int passengers) {
        super(passengers);
    }
    public void fly(){
        System.out.println("It flying");
    }
    public void land(){

    }
}
