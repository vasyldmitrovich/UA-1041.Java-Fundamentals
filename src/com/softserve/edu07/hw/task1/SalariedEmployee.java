package com.softserve.edu07.hw.task1;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private int rate;
    private int hours;
    private String name;

    public SalariedEmployee(String employeeId, int rate, int hours, String name) {
        super(employeeId);
        this.rate = rate;
        this.hours = hours;
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Salaried employee [" +
                "Employee ID: " + getEmployeeId() +
                "; Salary: " + calculatePay() +
                "; Name: " + name +
                ']';
    }
}
