package com.softserve.edu05.hw;

import java.util.ArrayList;
import java.util.List;

import static com.softserve.edu05.hw.App.SCANNER;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car() {
    }

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public static void inputParameters(Car car) {
        System.out.print("Input the parameters of the car: ");
        System.out.print("- type of the car: ");
        String type = SCANNER.nextLine();
        car.setType(type);
        System.out.print("- type of the car: ");
        int yearOfProduction = SCANNER.nextInt();
        SCANNER.nextLine();
        car.setYearOfProduction(yearOfProduction);
        double engineCapacity = SCANNER.nextDouble();
        SCANNER.nextLine();
        car.setEngineCapacity(engineCapacity);
    }

    public static void getModelYear() {
        System.out.println("Enter model year: ");
        int modelYear=SCANNER.nextInt();
        SCANNER.nextLine();
    }

    public static void modelYearArray(int modelYear, Car...cars){
        List<Car> listOfYearProduction=new ArrayList<>();
        for (Car car : cars) {
            if (modelYear==car.getYearOfProduction()) {
                listOfYearProduction.add(car);
            };
        }
        listOfYearProduction.toArray();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
