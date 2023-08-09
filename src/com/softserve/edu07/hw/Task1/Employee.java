package com.softserve.edu07.hw.Task1;

abstract class Employee implements Payment {
    String employeeId;
    String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

}
