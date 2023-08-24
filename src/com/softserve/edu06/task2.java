package com.softserve.edu06;

class Employee{
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String report(){
        return String.format("Name: %s, Age: %d," + "Salary: \u20B4 %.2f", name, age, salary);
    }
}
class Developer extends Employee{//Move to another file like Developer.java
    private String position;

    //Add constructor without parameters

    public Developer(String name, int age, double salary, String position){
        super(name, age, salary);
        this.position = position;
    }

    //Add getters and setters

    public String report(){
        return  String.format("Name: %s, Age: %d, Position: %s, " + "Salary: \u20B4 %.2f", getName(), getAge(), position, getSalary());

    }


}

public class task2 {//Move to App.java
    public static void main(String[] args){
        Employee employee = new Employee("Petro", 30, 59000.00);
        Developer developer = new Developer("Andriy", 22, 60000.00, "Java developer");

        System.out.println("Employee Infromation:");
        System.out.println(employee.report());

        System.out.println("\nDeveloper Information");
        System.out.println(developer.report());
    }

}
