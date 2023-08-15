package com.softserve.edu05.pt.task4;

public class Employee {
    private String name;
    private int depNumber;

    private double salary;

    //Add constructor without parameters

    public Employee(String name, int depNumber, double salary) {
        this.name = name;
        this.depNumber = depNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepNumber() {
        return depNumber;
    }

    public void setDepNumber(int depNumber) {
        this.depNumber = depNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", depNumber=" + depNumber +
                ", salary=" + salary +
                '}';
    }
}
