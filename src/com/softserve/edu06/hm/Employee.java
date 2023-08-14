package com.softserve.edu06.hm;

public class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String report(){
        return String.format("Name: %s, Age: %d, " +
                "Salary: \u20B4 %.2f. ", name, age, salary);
    }
}

// Write class Developer in another file Developer.java
class Developer extends Employee{
    private String position;
    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }
    @Override
    public String report(){
        return String.format("Name: %s, Age: %d, Position: %s, " +
                "Salary: \u20B4 %.2f. ", name, age, position, salary);
    }
}
