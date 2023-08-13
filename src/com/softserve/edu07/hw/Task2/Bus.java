package com.softserve.edu07.hw.Task2;

public class Bus extends GroundVehicle{
    private String route;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        super.drive();
    }

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }
}
