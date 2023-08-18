package com.softserve.edu08.pt.task1;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("Cherkasy region", "Cherkasy", "Shevchenko", 217);
        System.out.println(department);
        System.out.println("=========================");
        Department copyOfDepartment = (Department) department.clone();
        copyOfDepartment.getAddress().setCity("Uman");
        System.out.println(copyOfDepartment);
    }
}