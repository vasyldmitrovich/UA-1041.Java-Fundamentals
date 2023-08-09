package com.softserve.edu03.pt;

import java.util.Locale;

public class Mainemployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Employee employee1 = new Employee();
        employee1.setName("John");
        employee1.setRate(200);
        employee1.setHours(50);
        System.out.println(employee1);

        Employee employee2 = new Employee();
        employee2.setName("Mary");
        employee2.setRate(300);
        employee2.setHours(60);
        System.out.println(employee1);

        Employee employee3 = new Employee();
        employee3.setName("Zoe");
        employee3.setRate(800);
        employee3.setHours(40);
        System.out.println(employee1);

        double totalSalary = employee1.getSalary() + employee2.getSalary() + employee3.getSalary();
        System.out.printf("Total salary %d employers is %.1f", Employee.getTotalSum(), totalSalary);

    }

}
