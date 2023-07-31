package com.softserve.edu03.pt.task_2;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    static private int totalSum;



    public Employee() {
        this(null,0,0);
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum++;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.rate * this.hours;
    }

    public double getBonuses() {
        return this.getSalary() * 0.1;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
