package com.softserve.edu02.practicaltask;

import javax.print.attribute.standard.MediaSizeName;
import javax.swing.text.html.HTML;
import java.util.Scanner;

public class Employee {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static double totalSum;
    private String name;
    private int rate;
    private int hours;


    public Employee() {
        this("N/A", 0 , 0);

    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;

    }

    public static int getSalary(int rate, int hours) {
        int salary = rate * hours;
        return salary;
    }


    static double getBonus(int salary) {
        return (double) (salary * 10) / 100;
    }

    public static double getTotalSum(int salary, double getBonus) {
        totalSum = salary + getBonus;
        return totalSum;
    }

    public static void promParameters(Employee employee) {
        System.out.println("Input name: ");
        String name = SCANNER.nextLine();
        employee.setName(name);
        System.out.println("Input rate for " + employee.getName());
        int rate = SCANNER.nextInt();
        SCANNER.nextLine();
        employee.setRate(rate);
        System.out.println("Input hour for " + employee.getName());
        int hours = SCANNER.nextInt();
        SCANNER.nextLine();
        employee.setHours(hours);
        System.out.println("Salary for " + name + " = " + getSalary(rate, hours));
        System.out.println("Bonuses for  " + name + " = " + getBonus(getSalary(rate, hours)));

        System.out.println("Total Sum :" + getTotalSum(getSalary(rate, hours), getBonus(getSalary(rate, hours))));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Employee employee1 = new Employee();
        Employee.promParameters(employee1);

        Employee employee2 = new Employee();
        Employee.promParameters(employee2);

        Employee employee3 = new Employee();
        Employee.promParameters(employee3);






    }
}
        











































