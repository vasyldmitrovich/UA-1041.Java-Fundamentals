package com.softserve.edu07.hw.Task2;

class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    @Override
    void isSailing() {
        System.out.println("Boat is sailing");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
