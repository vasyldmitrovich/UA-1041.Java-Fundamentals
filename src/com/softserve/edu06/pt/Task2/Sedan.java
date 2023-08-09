package com.softserve.edu06.pt.Task2;

public class Sedan extends Car{
    private int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Sedan(String model, int maxSpeed, int yearOfProduction, int numberOfSeats) {
        super(model, maxSpeed, yearOfProduction);
        this.numberOfSeats = numberOfSeats;
    }

    public Sedan() {

    }
    @Override
    public void printInfo(){
        System.out.println("Model: "+model);
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Year of production: "+yearOfProduction);
        System.out.println("Number of seats"+numberOfSeats);
        System.out.println();
    }
}
