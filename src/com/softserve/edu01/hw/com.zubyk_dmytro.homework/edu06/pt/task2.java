package edu06.pt;

public class task2 {
    public static void main(String[] args) {
        // Create an array of Car objects
        Car[] cars = new Car[3];

        // Create instances of Truck and Sedan and add them to the array
        cars[0] = new Truck("Truck1", 80, 2020);
        cars[1] = new Sedan("Sedan1", 120, 2022);
        cars[2] = new Truck("Truck2", 70, 2019);

        // Print information about each car
        for (Car car : cars) {
            System.out.println("Model: " + car.getModel());
            System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h");
            System.out.println("Year of Production: " + car.getYearOfProduction());
            car.run();
            car.stop();
            System.out.println();
        }
    }
}

