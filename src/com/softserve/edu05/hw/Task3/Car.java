package com.softserve.edu05.hw.Task3;

public class Car {

    private String type;
    private int year;
    private int engine;

    public Car(String type, int year, int engine) {
        this.type = type;
        this.year = year;
        this.engine = engine;
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
        this.year = year;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                ", year=" + year +
                ", engine=" + engine ;
    }


}
