package com.softserve.edu07.hw.task1;

public class ContractEmployee extends Employee implements Payment{
    private int monthlyPayment;
    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, String name, int monthlyPayment) {
        super(employeeId, name);
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public int calculatePay() {
        return monthlyPayment;
    }

    @Override
    public String toString(){
        return "ContractEmployee:\n" +
                "employeeId: " + employeeId +
                "name: " + name +
                "the average monthly wage: " + calculatePay();
    }
}