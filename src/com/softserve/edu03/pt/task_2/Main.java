package com.softserve.edu03.pt.task_2;

public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.setName("Nikolay");
        employee1.setRate(50.5);
        employee1.setHours(40);

        Employee employee2=new Employee("Vasyl",40.5,30);
        Employee employee3=new Employee("Olga",60,50);

        double totalSalary=employee1.getSalary()+employee2.getSalary()+employee3.getSalary();

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.printf("total salary of %d employees are: %.2f uah ",Employee.getTotalSum(),totalSalary);

    }
}
