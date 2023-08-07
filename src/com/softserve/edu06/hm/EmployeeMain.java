package com.softserve.edu06.hm;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] People = {
                new Employee("Mark", 22, 20000),
                new Developer("Mary", 25, 40000, "Senior Python developer"),
                new Employee("Alice", 24, 24000),
                new Developer("John", 20, 50000, "Data Analyst")
        };
        for (var person: People){
            System.out.println(person.report());
        }
    }
}
