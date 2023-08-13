package com.softserve.edu07.hw.Task1;

public class ContractEmployee extends Employee implements Payment{
    private String federalTaxIdMember;
    private int fixedMonthlyPayment;

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, int fixedMonthlyPayment) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return

                "employee id=" + employeeId +
                ", name=" + name +
                ", fixed monthly payment=" + calculatePay()
                ;
    }
}
