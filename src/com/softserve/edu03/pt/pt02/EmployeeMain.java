package com.softserve.edu03.pt.pt02;


import java.util.Locale;

public class EmployeeMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Employee employee1 = new Employee();
        employee1.setName("Dmitro");
        employee1.setRate(120);
        employee1.setHours(45);
        System.out.println(employee1);

        Employee employee2 = new Employee("Nadiya", 114);
        employee2.setHours(45);
        System.out.println(employee2);

        Employee employee3 = new Employee("Alex", 101, 50);
        System.out.println(employee3);

        double totalSalary = employee1.getSalary() + employee2.getSalary() + employee3.getSalary();
        System.out.printf("Total salary %d employers is %.1f", Employee.getTotalSum(), totalSalary);

    }
}

