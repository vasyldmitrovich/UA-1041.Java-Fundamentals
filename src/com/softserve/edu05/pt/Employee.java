package com.softserve.edu05.pt;

import java.util.*;

public class Employee {
    Employee employee;
    private String name;
    private int departmentNumber;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public static void getEmployees(int departmentNumber, String employees[][]) {
        List<String> listNames = new ArrayList<>();
        for (int iRow = 0; iRow < employees.length; iRow++) {
            int department = Integer.parseInt(employees[iRow][1]);
            String name = employees[iRow][0];
            if (departmentNumber == department) {
                listNames.add(name);
            }
        }
        //  listNames.toArray(String[]::new);
        System.out.println("In the " + departmentNumber + "th department working next employees: " + listNames);
    }

    public static void rangeEmployeesBySalary(String employees[][]) {
        List<Double> listSalary = new ArrayList<>();
        for (int i = 0; i < employees.length; i++) {
            double salary = Double.parseDouble(employees[i][2]);
            listSalary.add(salary);
        }
        Double[] arr = listSalary.toArray(Double[]::new);
        Arrays.sort(arr);
        System.out.println();
        System.out.println("Employees sorted by salary:");
        for (int iArr = employees.length-1; iArr >= 0; iArr--) {
            if (iArr>0 && arr[iArr]==arr[iArr-1]) continue;
            double sortedSalary = arr[iArr];
            for (int iRow = 0; iRow < employees.length; iRow++) {
                double iSalary = Double.parseDouble(employees[iRow][2]);
                if (sortedSalary==iSalary) System.out.println(Arrays.toString(employees[iRow]));
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }
}

