package edu06.hw;

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
