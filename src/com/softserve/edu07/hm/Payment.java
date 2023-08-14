package com.softserve.edu07.hm;


import java.util.*;



/*DO NOT WRITE ALL CLASSES IN ONE FILE
* it is not good*/

public interface Payment {
    double calculatePay();
}

abstract class Employee {
    String employeeld;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }
}

class SalariedEmployee extends Employee implements Payment {
    private int socialSecurityNumber;
    double hoursWorked;// Should private fields here and in all another classes
    double hourlyRate = 50.0;

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
                ", employeeld='" + employeeld + '\'' +
                '}';
    }
}

class ContractEmployee extends Employee implements Payment {
    private int federalTaxIdmember;
    double fixedPayment = 20000.0;

    public ContractEmployee(String employeeld, int federalTaxIdmember) {
        super(employeeld);
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public double calculatePay() {
        return fixedPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember=" + federalTaxIdmember +
                ", fixedPayment=" + fixedPayment +
                ", salary=" + fixedPayment +
                ", employeeld='" + employeeld + '\'' +
                '}';
    }
}

class SortSalary implements Comparator<Employee> {

    // Method
    // Sorting in ascending order of roll number
    public int compare(Employee a, Employee b) {
        if (((Payment) a).calculatePay() == ((Payment) b).calculatePay()) {
            return 0;
        } else if (((Payment) a).calculatePay() < ((Payment) b).calculatePay()) {
            return 1;
        } else {
            return -1;
        }
    }
}

//Write class in its own file like App.java and there write main method
class MainPayment {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();

        list.add(new SalariedEmployee("Mary", 125, 140));
        list.add(new ContractEmployee("Ken", 24355));
        list.add(new SalariedEmployee("john", 12, 59));
        list.add(new ContractEmployee("Bob", 536));
        for (Employee person : list) {
            ((Payment) person).calculatePay();
            System.out.println(person);

        }
        System.out.println("----------------------------------------------------");

        Collections.sort(list, new SortSalary());
        for (Employee person : list) {
            System.out.println(person);
            ((Payment) person).calculatePay();
        }
    }
}