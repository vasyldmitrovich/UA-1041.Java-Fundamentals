package com.softserve.edu06.pt.task2;

public class App {
    public static void main(String[] args) {
        Car[] cars = {new Sedan(),
                new Truck(),
                new Truck(),
                new Sedan()};
        for (Car car : cars) {
            car.run();
            car.stop();
        }
    }
}
