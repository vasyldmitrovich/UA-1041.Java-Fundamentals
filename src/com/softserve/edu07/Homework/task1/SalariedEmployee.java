package com.softserve.edu07.Homework.task1;

public class SalariedEmployee extends Employee implements Payment {

   private final int socialSecurityNumber;
    private final int hourlyrate;
    private final int numberOfhoursWorked;




    public SalariedEmployee(String employeeld, String name, int socialSecurityNumber, int hourlyrate, int numberOfhoursWorked) {
        super(employeeld, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyrate = hourlyrate;
        this.numberOfhoursWorked = numberOfhoursWorked;

    }
    @Override
    public int calculatePay() {
        return hourlyrate * numberOfhoursWorked;

    }



    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "employeeld='" + employeeld + '\'' +
                ", name='" + name + '\'' +
                "the average monthly salary" + calculatePay() +
                '}';
    }

}
