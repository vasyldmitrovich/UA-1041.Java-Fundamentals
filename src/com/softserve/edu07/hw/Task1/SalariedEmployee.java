package com.softserve.edu07.hw.Task1;

public class SalariedEmployee extends Employee implements Payment {
    private int fixedMonthlyPayment;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, int fixedMonthlyPayment, String socialSecurityNumber) {
        super(employeeId, name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;

    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

}
