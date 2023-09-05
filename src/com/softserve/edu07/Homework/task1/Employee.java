package com.softserve.edu07.Homework.task1;

abstract public class Employee implements Payment {
    String employeeld;

    String name;

    public Employee(String employeeld, String name) {
        this.employeeld = employeeld;
        this.name = name;
    }
    public abstract int calculatePay();

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
