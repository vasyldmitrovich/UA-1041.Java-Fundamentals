package com.softserve.edu07.homework1;

public class SalariedEmployee extends Employee implements Payroll {
    private final int socialSecurityNumber;
    private final double fixedMonthlyPayment;

    public SalariedEmployee(int employeeId, String name, int socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}
