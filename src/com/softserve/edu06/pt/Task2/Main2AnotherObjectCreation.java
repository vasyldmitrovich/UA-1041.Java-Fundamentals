package com.softserve.edu06.pt.Task2;

public class Main2AnotherObjectCreation {
    public static void main(String[] args) {
        Car[] cars={
        new Truck("dsds",150,2012,50),
        new Truck("maz",155,2015,60),
        new Sedan("RS7",338,2023,5),
        new Sedan("RS6",300,2023,5),
        };
        for (int i = 0; i < cars.length; i++) {
            cars[i].printInfo();
        }
    }
}
