package edu7.hw;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        List<Payment> employees = new ArrayList<>();
        employees.add(new SalariedEmployee("E001", "SSN123", 5000));
        employees.add(new ContractEmployee("E002", "FTI456", 20, 160));
        employees.add(new ContractEmployee("E003", "FTI789", 15, 180));
        employees.add(new SalariedEmployee("E004", "SSN456", 6000));

        Collections.sort(employees, (emp1, emp2) -> Double.compare(emp2.calculatePay(), emp1.calculatePay()));

        // Output employee information
        for (Payment employee : employees) {
            System.out.println("Employee ID: " + employee.calculatePay());
            System.out.println("Average Monthly Wage: " + employee.calculatePay());
            System.out.println("----------------------------");
        }
    }
}
