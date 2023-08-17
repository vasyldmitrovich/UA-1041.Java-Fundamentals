package com.softserve.edu07.hw.Task1;

abstract class Employee {//This class should implement Payment
    protected String employeeId;
    String name;//Always use private field

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
