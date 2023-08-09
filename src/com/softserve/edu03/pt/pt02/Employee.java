package com.softserve.edu03.pt.pt02;

public class Employee {
    private String name;
    private double rate;
    private double hours;

    //не зрозумів, як порахувати total salary
    //Use non static block initialization
    //все одно не можу додумати, як оптимізувати код, щоб не додавати в мейн змінну

    public static int totalSum;

    public Employee() {
        totalSum++;
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
        totalSum++;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum++;
            }

    public void setName(String name) {
        this.name = name;

    }

    public void setRate(double rate) {
        this.rate = rate;

    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return rate * hours;
    }
    public static int getTotalSum() {
        return totalSum;
    }
    public double getBonuses() {
        return this.getSalary() * 0.1;
    }
    @Override
    public String toString() {
        return "Employee:\n" +
                "name='" + name + '\'' +
                "\nrate=" + rate +
                "\nhours=" + hours +
                "\nsalary: " + this.getSalary() +
                "\nbonuses: " + this.getBonuses() +
                '\n';
    }



}