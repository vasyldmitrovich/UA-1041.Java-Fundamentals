package com.softserve.edu05.pt.Task4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Employee {

    private String FirstName;
    private String LastName;
    private int departmentNumber;
    private int salary;


    public Employee(String firstName, String lastName, int departmentNumber, int salary) {
        FirstName = firstName;
        LastName = lastName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void getAllInformation(){
        System.out.println("FirstName: "+(FirstName));
        System.out.println("lastName: "+(LastName));
        System.out.println("departmentNumber: "+(departmentNumber));
        System.out.println("salary: "+(salary));
    }

    @Override
    public String toString() {
        return
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary ;
    }



}
