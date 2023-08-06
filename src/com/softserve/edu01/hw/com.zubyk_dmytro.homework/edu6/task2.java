package edu6;
import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.Scanner;

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
class Developer extends Employee{
    private String position;
    public Developer(String name, int age, double salary, String position){
        super(name, age, salary);
        this.position = position;
    }

    public String report(){
        return  String.format("Name: %s, Age: %d, Position: %s, " + "Salary: \u20B4 %.2f", getName(), getAge(), position, getSalary());

    }


}

public class task2 {
    public static void main(String[] args){
        Employee employee = new Employee("Petro", 30, 59000.00);
        Developer developer = new Developer("Andriy", 22, 60000.00, "Java developer");

        System.out.println("Employee Infromation:");
        System.out.println(employee.report());

        System.out.println("\nDeveloper Information");
        System.out.println(developer.report());
    }

}
