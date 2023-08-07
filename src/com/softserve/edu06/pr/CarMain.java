package com.softserve.edu06.pr;

public class CarMain {
    public static void main(String[] args) {

        Car[] carArray = {
                new Sedan("Honda", 210, 2011),
                new Sedan("Volvo", 240, 2015),
                new Truck("BMW", 220, 2012),
                new Truck("Toyota", 230, 2016),
                new Sedan("Ford", 230, 2013)
        };

        for (var car : carArray) {
            car.run();
            car.stop();
            System.out.println(car);
        }


    }
}
