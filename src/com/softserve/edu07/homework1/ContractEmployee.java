package com.softserve.edu07.homework1;

public class ContractEmployee extends Employee implements Payroll {//Do not need here write implements Payroll
    private final int federalTaxId;
    private final double hourlyRate;
    private final double hoursWorked;

    public ContractEmployee(int employeeId, String name, int federalTaxId, double hourlyRate, double hoursWorked) {
        super(employeeId, name);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public int getFederalTaxId() {
        return federalTaxId;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
