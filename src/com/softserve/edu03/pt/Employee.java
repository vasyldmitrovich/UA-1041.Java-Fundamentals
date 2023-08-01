package com.softserve.edu03.pt;

public class Employee {
    private String name;
    private int rate;
    private double hours;
    static private double totalSum = 0;
    double bonus = 1.1;
    public Employee() {

    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int rate, double hours) {
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public double getSalary() {
        return rate * hours;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", bonus=" + bonus +
                '}';
    }



    public double getBonuses() {
        return rate * bonus;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
