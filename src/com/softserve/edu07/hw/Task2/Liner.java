package com.softserve.edu07.hw.Task2;

class Liner extends WaterVehicle {
    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    void isSailing() {
        System.out.println("Liner is sailing");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
