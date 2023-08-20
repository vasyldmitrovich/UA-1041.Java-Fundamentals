package com.softserve.edu07.hw.task1;

public class ContractEmployee extends Employee implements Payment {
    private boolean federalTaxIdMember;
    private int monthlyPayment;
    private String name;

    public ContractEmployee(String employeeId, int monthlyPayment, String name) {
        super(employeeId);
        this.monthlyPayment = monthlyPayment;
        this.name = name;
    }

    public boolean isFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(boolean federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public int calculatePay() {
        return monthlyPayment;
    }

    @Override
    public String toString() {
        return "Contract employee [" +
                "Employee ID: " + getEmployeeId() +
                "; Salary: " + calculatePay() +
                "; Name: " + name +
                ']';
    }
}
