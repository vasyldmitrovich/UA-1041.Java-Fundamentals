package com.softserve.edu06.hw.Task2;

public class EmpApp {//Good
    static Employee[] emps = {
            new Employee("Ivan", 19, 20000),
            new Developer("Misha", 21, 25000, "Frontend React Developer"),
            new Employee("Ann", 18, 19000),
            new Developer("John", 31, 35000, "Java Developer")};
    static int lineLength = getLineLength(emps);

    public static void main(String[] args) {
        printEmpInfo();
    }

    private static void printEmpInfo() {
        for (Employee emp : emps
        ) {
            System.out.println("_".repeat(lineLength));
            System.out.println(emp.report());
            System.out.println("_".repeat(lineLength));
        }
    }

    //Unnecessary method to print equal lines
    private static int getLineLength(Employee[] emps) {
        int max = Integer.MIN_VALUE;
        for (Employee emp : emps
        ) {
            max = Math.max(max, emp.report().length());
        }
        return max;
    }
}
