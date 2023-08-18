package com.softserve.edu07.hw.task1;

public class SalariedEmployee extends Employee implements Payment{

    private int hourlyRate;
    private int hours;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, int hourlyRate, int hours) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public int calculatePay() {
        return hourlyRate * hours;
    }

    @Override
    public String toString() {
        return "SalariedEmployee:\n" +
                "employeeId: " + employeeId +
                "name: " + name +
                "the average monthly wage: " + calculatePay();
    }

}