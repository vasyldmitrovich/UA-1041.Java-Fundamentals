package com.softserve.edu06.hm;

public class Employee {
    protected String name;
    protected int age;
    protected double salary;

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

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String report(){
        return String.format("Name: %s, Age: %d, " +
                "Salary: \u20B4 %.2f. ", name, age, salary);
    }
}


class Developer extends Employee{
    private String position;
    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }
    @Override
    public String report(){
        return String.format("Name: %s, Age: %d, Position: %s, " +
                "Salary: \u20B4 %.2f. ", name, age, position, salary);
    }
}
