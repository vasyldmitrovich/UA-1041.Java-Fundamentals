package com.softserve.edu07.hw.work1;

public class SalariedEmployee extends Employee implements Payable {//Interphase Payable should implement class Employee, not this class
    private int socialSecurityNumber;
    private double fixedMonthlyPayment;

    //Add constructor without parameters

    public SalariedEmployee(int employeeID, String name, int socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeID, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    //Add getters and setters equals hashcode and toString

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }
}
