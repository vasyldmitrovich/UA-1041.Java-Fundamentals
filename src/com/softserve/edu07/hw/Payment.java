package com.softserve.edu07.hw;

public interface Payment {
    int calculatePay();
}

abstract class Employee implements Payment {
    String name;
    String employeeId;

    public Employee() {
    }

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
}

class SalariedEmployee extends Employee implements Payment {
    String socialSecurityNumber;
    int fixedMonthlyPayment;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, String employeeId) {
        super(name, employeeId);
        this.socialSecurityNumber = "N/A";
        this.fixedMonthlyPayment = 0;
    }

    public SalariedEmployee(String name, String employeeId, String socialSecurityNumber, int fixedMonthlyPayment) {
        super(name, employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        int averageMonthlySalary = fixedMonthlyPayment;
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee" + name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", average monthly salary is " + calculatePay() + ".";
    }
}

class ContractEmployee extends Employee implements Payment {
    String federalTaxIdNumber;
    int hourlyRate;
    int numberOfHoursWorked;

    public ContractEmployee() {
    }

    public ContractEmployee(String name, String employeeId) {
        super(name, employeeId);
        this.federalTaxIdNumber = "N/A";
        this.hourlyRate = 0;
        this.numberOfHoursWorked = 0;
    }

    public ContractEmployee(String name, String employeeId, String federalTaxIdNumber,
                            int hourlyRate, int numberOfHoursWorked) {
        super(name, employeeId);
        this.federalTaxIdNumber = federalTaxIdNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getFederalTaxIdNumber() {
        return federalTaxIdNumber;
    }

    public void setFederalTaxIdNumber(String federalTaxIdNumber) {
        this.federalTaxIdNumber = federalTaxIdNumber;
    }

    @Override
    public int calculatePay() {
        int averageMonthlySalary = hourlyRate * numberOfHoursWorked;
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        return "ContractEmployee" + name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                "Average monthly salary is " + calculatePay() + ".";
    }
}
