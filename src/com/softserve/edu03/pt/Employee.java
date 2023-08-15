package com.softserve.edu03.pt;

class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum = 0.0;

    // Constructors
    public Employee() {
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary(); // Update the totalSum when a new Employee is created
    }

    // Properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        totalSum -= getSalary(); // Update the totalSum before changing hours
        this.hours = hours;
        totalSum += getSalary(); // Update the totalSum after changing hours
    }

    public static double getTotalSum() {
        return totalSum;
    }

    // Methods
    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', rate=" + rate + ", hours=" + hours + "}";
    }
}
