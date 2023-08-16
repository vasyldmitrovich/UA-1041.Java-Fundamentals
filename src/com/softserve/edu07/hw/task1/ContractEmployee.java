package com.softserve.edu07.hw.task1;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxId;
    private double hourlyRate;
    private double hoursWorked;

    public ContractEmployee(String employeeId, String federalTaxId, double hourlyRate, double hoursWorked) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxId='" + federalTaxId + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
