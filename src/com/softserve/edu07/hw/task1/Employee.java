package com.softserve.edu07.hw.task1;

public abstract class Employee {
    protected String employeeId;

    protected String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
}