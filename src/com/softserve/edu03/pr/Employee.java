package com.softserve.edu03.pr;

public class Employee {
    private String name;
    private double rate;
    private double hours;

    public static int getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }

    static int totalSum;

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
        this.hours = hours;
    }

    public Employee() {
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public double getSalary(){
        double salary = getRate() * getHours();
        return  salary;
    }

    public String toString(){
        return "Employee{" +
                "name=" + getName() +
                ", rate=" + getRate() +
                ", hours=" + getHours() +
                ", salary=" + getSalary() +
                ", bonuses=" + getBonuses() +
                '}';
    }

    public double getBonuses() {
        return getSalary() * 0.01;
    }


}
