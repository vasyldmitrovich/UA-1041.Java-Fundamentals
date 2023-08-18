package com.softserve.edu06.hw.Task2;

public class Employee {
    protected String name;//All field make private
    protected int age;
    protected double salary;

    //Add constructor without parameters

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d," +
                " Salary: \u20B4 %.2f", name, age, salary);
    }
}
