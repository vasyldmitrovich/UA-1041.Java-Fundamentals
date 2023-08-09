package com.softserve.edu06.pt.Task2;

abstract  public class Car{
    public String model;
    public int maxSpeed;
    public int yearOfProduction;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Car() {
    }

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public void run(){
        System.out.println("The car started ");
    }
    public void stop(){
        System.out.println("The car stopped ");
    }
    public void printInfo(){
        System.out.println("Model: "+model);
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Year of production: "+yearOfProduction);
        System.out.println();
    }


}
