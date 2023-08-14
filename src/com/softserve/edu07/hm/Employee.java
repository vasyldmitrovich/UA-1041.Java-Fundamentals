package com.softserve.edu07.hm;

abstract class Employee {
    public String getEmployeeld() {
        return employeeld;
    }

    private String employeeld;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }
}
