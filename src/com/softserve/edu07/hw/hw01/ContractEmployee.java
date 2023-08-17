package com.softserve.edu07.hw.hw01;

public class ContractEmployee extends Employee implements Payment {//Implement Payment should class Employee not this class
    private String federalTaxIdMember;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, double hourlyRate, int hoursWorked) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    @Override
    public String toString() {
        return "ContractEmployee{ " + "Name= " + getName() +
                "Federal tax ID member= " + federalTaxIdMember +
                ", Hourly rate= " + hourlyRate +
                ", Hours worked=" + hoursWorked + ", Monthly salary= " + calculatePay() + "}\n";
    }

    @Override
    public double calculatePay() {
        return getHourlyRate() * getHoursWorked();
    }


 }
