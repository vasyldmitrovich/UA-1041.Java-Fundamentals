package com.softserve.edu06.hw.task_2;

public class Main {//All good
    public static void main(String[] args) {
        Developer developer1 = new Developer("Taras", 32, 32735.35, "Average Java developer");
        Employee employee1 = new Employee("Igor", 46, 16000.50);


        System.out.println(developer1);
        System.out.println(developer1.report());
        System.out.println("----------------------");
        System.out.println(employee1);
        System.out.println(employee1.report());
    }
}
