package edu06.pt;

// Abstract class Car
abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run();

    public abstract void stop();

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}

// Concrete subclass Truck
class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Truck is running.");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopped.");
    }
}

// Concrete subclass Sedan
class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan is running.");
    }

    @Override
    public void stop() {
        System.out.println("Sedan is stopped.");
    }
}

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

