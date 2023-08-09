package com.softserve.edu05.hw.task_3;

import java.util.Objects;

public class Car {
    private String type;
    private  int yearOfProduction;
    private int engineCapacity;

    public Car() {
    }

    public Car(String type, int yearOfProduction, int engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
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

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfProduction != car.yearOfProduction) return false;
        if (engineCapacity != car.engineCapacity) return false;
        return Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + yearOfProduction;
        result = 31 * result + engineCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}'+"\n";
    }
}
