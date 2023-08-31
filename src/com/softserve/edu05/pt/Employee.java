package com.softserve.edu05.pt;

import java.util.*;

public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public static void getEmployees(int departmentNumber, Employee... employees) {
        List<Employee> list = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.departmentNumber == departmentNumber) {
                list.add(employee);
            }
        }
        //    list.toArray(Employee[]::new);
        System.out.println("In the " + departmentNumber + " working next employees: " + list.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
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
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getDepartmentNumber() == employee.getDepartmentNumber() && Double.compare(employee.getSalary(), getSalary()) == 0 && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDepartmentNumber(), getSalary());
    }
}

