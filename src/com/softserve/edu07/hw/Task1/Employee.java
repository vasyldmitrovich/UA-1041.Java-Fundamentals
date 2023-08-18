package com.softserve.edu07.hw.Task1;

abstract class Employee implements Payment {
    String employeeId;//Make private and add getters and setters
    String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

}
