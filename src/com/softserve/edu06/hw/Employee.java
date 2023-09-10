package com.softserve.edu06.hw;

public class Employee {
    String name;
    int age;
    double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, " +
                "Salary: \u20B4 %.2f.", name, age, salary);
    }
}


class Developer extends Employee {
    private String position;

    public Developer() {

    }

    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, " +
                "Salary: \u20B4 %.2f.", name, age, position, salary);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}