package com.softserve.edu07.hw.task1;

public abstract class Employee {
    private String EmployeeId;

    public Employee(String employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }
}
