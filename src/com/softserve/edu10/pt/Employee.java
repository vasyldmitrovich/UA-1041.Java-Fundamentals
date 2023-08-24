package com.softserve.edu10.pt;

import java.util.Objects;

public class Employee implements Cloneable {
    private String name;
    private String position;
    private double salary;
    private String dob;


    public Employee(String name, String position, double salary, String dob) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", Position='" + position + '\'' +
                ", Salary=" + salary +
                ", DOB=" + dob
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(position, employee.position) && Objects.equals(dob, employee.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, salary, dob);
    }

    @Override
    public Employee clone() {
        try {
            Employee clone = (Employee) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
