package com.softserve.edu05.pt;

import java.util.ArrayList;
import java.util.Comparator;

import static com.softserve.edu05.util.CollectInputs.inputNumberInt;
import static com.softserve.edu05.util.RandNums.randInt;

public class Employee {
    static ArrayList<Employee> office = new ArrayList<Employee>();//move this list and all method
    //witch do some logic to another class like App.java
    //because class Employee should represent only entity and method what we can do with this entity
    private final String name;
    private final int deptNum;
    private final int salary;

    public Employee(String name, int deptNum, int salary) {
        this.name = name;
        this.deptNum = deptNum;
        this.salary = salary;
        office.add(this);
    }

    public static void runTask4() {
        Employee e1 = new Employee("Ivan", randInt(1, 4), randInt(100, 500));
        Employee e2 = new Employee("Grisha", randInt(1, 4), randInt(100, 500));
        Employee e3 = new Employee("Ann", randInt(1, 4), randInt(100, 500));
        Employee e4 = new Employee("Misha", randInt(1, 4), randInt(100, 500));
        Employee e5 = new Employee("Dasha", randInt(1, 4), randInt(100, 500));

        System.out.println("\nDefault office:\n");
        printOffice();

        printWorkersOfSpecialDept();

        office.sort(Comparator.comparing(
                Employee::getSalary
        ).reversed());
        System.out.println("\nSorted by salary office:\n");
        printOffice();
    }//Move this and anotreh methods which do some with list to class like App.java

    private static void printOffice() {
        for (Employee e : office
        ) {
            System.out.println(e);
        }
    }

    private static void printWorkersOfSpecialDept() {
        int dept = inputNumberInt("\nPlease enter which department you want to print");
        for (Employee e : office
        ) {
            if (e.deptNum == dept) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        runTask4();
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", deptNum=" + deptNum +
                ", salary=" + salary +
                '}';
    }
}
