package com.softserve.edu07.hw.Task1;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {//Ok
    static List<Employee> office = new ArrayList<Employee>();
    private static final int lengthOfLine = 40;

    static {
        office.add(new SalariedEmployee("E001", "Ivan", 25000, "S1036"));
        office.add(new SalariedEmployee("E002", "John", 12400, "S2563"));
        office.add(new SalariedEmployee("E011", "Anna", 11200, "S1003"));
        office.add(new SalariedEmployee("E011", "Michel", 20000, "S6303"));
        office.add(new ContractEmployee("E023", "Alex", 36582, 250, 120));
        office.add(new ContractEmployee("E008", "Victor", 36532, 202, 110));
        office.add(new ContractEmployee("E003", "Julia", 46582, 160, 100));
        office.add(new ContractEmployee("E007", "Kate", 36182, 207, 220));
    }

    public static void main(String[] args) {
        runApp();
    }

    public static void runApp() {
        System.out.println("Office before sorting\n");
        printOffice();
        office.sort(new PayComparatorDesc());
        System.out.println("Office after sorting\n");
        printOffice();
    }

    public static void printOffice() {
        System.out.println("EmployeeID\tName\tAverage Monthly Wage");
        System.out.println("-".repeat(lengthOfLine));
        for (var emp : office
        ) {
            System.out.println("-".repeat(lengthOfLine));
            System.out.println(emp.employeeId + "\t\t" + emp.name + "\t\t" + emp.calculatePay());
            System.out.println("-".repeat(lengthOfLine));
        }
    }
}
