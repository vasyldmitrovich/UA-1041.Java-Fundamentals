package com.softserve.edu06.hw.task2;

public class Employee {
    private String name;
    private int age;
    private double salary;

    //Add constructor without parameters

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //Add getters setters equals hashcode and tostring

    public String report() {
        return String.format("Name: %s, Age: %d," + "Salary: \u20B4 %.2f", name, age, salary);
    }
}

