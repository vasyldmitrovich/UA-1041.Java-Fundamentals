package com.softserve.edu07.hw.Task1;

public class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;
    private int hourlyRate;
    private int numberOfHoursWorked;


    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, int hourlyRate, int numberOfHoursWorked) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return

            "employee id=" + employeeId +
            ", name=" + name +
            ", fixed monthly payment=" + calculatePay();
    }


    @Override
    public double calculatePay() {
        return hourlyRate*numberOfHoursWorked;
    }
}
