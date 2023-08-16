package com.softserve.edu07.hw.task1;

public abstract class Employee {

    private String employeeId;

    public Employee() {
    }

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                '}';
    }
}
