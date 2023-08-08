package com.softserve.edu05.hw.task3;

import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparable<Car>{
    private String type;
    private int year;
    private double engineCapacity;

    public Car(String type, int year, double engineCapacity) {
        this.type = type;
        if(year > 1900 && year < 2024)
        this.year = year;
        if(engineCapacity > 0)
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > 1900 && year < 2024)
        this.year = year;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if(engineCapacity > 0)
        this.engineCapacity = engineCapacity;
    }

    @Override
    public int compareTo(Car o) {
       // return Integer.compare(this.getYear(), o.getYear());
        return this.getYear() > o.getYear() ? 1 : this.getYear() < o.getYear() ? -1 : 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", Engine capacity=" + engineCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Double.compare(car.engineCapacity, engineCapacity) == 0 && Objects.equals(type, car.type);
    }

}
