package com.softserve.edu07.hw.hw01;

public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private int monthlyPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, int monthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlyPayment = monthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{ " + "Name= " + getName() +
                ", Social security number='" + socialSecurityNumber + '\'' +
                ", Monthly salary= " + monthlyPayment +
                "}\n";
    }

    @Override
    public double calculatePay() {
        return getMonthlyPayment();
    }

}
