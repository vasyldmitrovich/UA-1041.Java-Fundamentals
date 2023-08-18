package com.softserve.edu07.hw.Task1;

public class ContractEmployee extends Employee implements Payment {//Without implements Payment this class will have this method by default
    private final int federalTaxId;
    private final int hourlyRate;
    private final int numOfHoursWorked;

    public ContractEmployee(String employeeId, String name, int federalTaxId, int hourlyRate, int numOfHoursWorked) {
        super(employeeId, name);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.numOfHoursWorked = numOfHoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numOfHoursWorked;
    }
}
