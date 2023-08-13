package com.softserve.edu06.hw.task2;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("John",25,10000);
        System.out.println(employee.report());
        Developer developer = new Developer("Andrew",27,12000,"Manager");
        System.out.println(developer.report());


    }
}
