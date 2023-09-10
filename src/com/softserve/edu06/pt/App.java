package com.softserve.edu06.pt;

public class App {
    public static void main(String[] args) {

        // Task 2
        System.out.println("Task 2");
        Car[] cars = {
                new Sedan("Mazda", 130, 2006),
                new Sedan("Opel",110,2012),
                new Truck("Maz", 90,2015),
                new Sedan("BMW",190,2020),
                new Truck("Mercedes-Benz", 110,2018)
        };
        for (var car: cars){
            System.out.println(car);
            car.run();
            car.stop();
        }

        // Task 3
        System.out.println("Task 3");

        ColorLine[] colorLines = {
                new ColorLine(new Point(4,7), new Point(3,6)),
                new ColorLine(new Point(3,4), new Point(2,6), "red"),
                new ColorLine(new Point(5,4), new Point(3,2), "blue"),
                new ColorLine(new Point(3,7), new Point(8,3), "green"),
        };

        for (var colorLine : colorLines ){
            System.out.println(colorLine);
        }
    }
}
