package com.softserve.edu06.Homework.Task2;

public class Employee {
   String name;
    int age;
   double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String report() {
        return String.format("Name: %s, Age: %d\t" +
                "Salary:\u20B4 %.2f.", name, age ,salary);
    }
}
