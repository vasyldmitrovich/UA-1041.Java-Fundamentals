package com.softserve.edu06.pt.Task2;

public class Main {
    public static void main(String[] args) {
        Truck truck1 = new Truck("dsds",150,2012,50);
        Truck truck2 = new Truck("maz",155,2015,60);
        Sedan sedan1=new Sedan("RS7",338,2023,5);
        Sedan sedan2=new Sedan("RS6",300,2023,5);
        Car[] cars = new Car[]{
                truck1,
                truck2,
                sedan1,
                sedan2
        };
        for (int i = 0; i < 4; i++) {
            cars[i].printInfo();
        }



    }
}
