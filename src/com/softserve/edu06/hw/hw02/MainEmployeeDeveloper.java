package com.softserve.edu06.hw.hw02;

public class MainEmployeeDeveloper {
    public static void main(String[] args) {
        Employee emp = new Employee("Carl", 38, 35000.00);
        Developer dev = new Developer("Ross", 28, 48000.00, "Java developer");
        System.out.println(emp.report());
        System.out.println(dev.report());
    }
}
