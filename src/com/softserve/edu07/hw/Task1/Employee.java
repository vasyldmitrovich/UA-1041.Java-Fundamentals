package com.softserve.edu07.hw.Task1;

abstract class Employee {
    protected String employeeId;
    String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public abstract double calculatePay();

    @Override
    public String toString() {
        return
                "employeeId='" + employeeId + '\'' +
                '}';
    }
}
