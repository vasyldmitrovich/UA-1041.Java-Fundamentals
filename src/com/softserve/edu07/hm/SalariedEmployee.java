package com.softserve.edu07.hm;

class SalariedEmployee extends Employee implements Payment {
    private int socialSecurityNumber;
    private double hoursWorked;// Should private fields here and in all another classes
    private double hourlyRate = 50.0;

    public SalariedEmployee(String employeeld, int socialSecurityNumber, double hoursWorked) {
        super(employeeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        double salary = hourlyRate * hoursWorked;
        return salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber=" + socialSecurityNumber +
                ", hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                ", salary=" + calculatePay() +
                ", employeeld='" + getEmployeeld() + '\'' +
                '}';
    }
}
