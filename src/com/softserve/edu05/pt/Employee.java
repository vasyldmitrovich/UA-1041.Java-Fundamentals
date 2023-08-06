package com.softserve.edu05.pt;

import java.util.ArrayList;
import java.util.Comparator;

import static com.softserve.edu05.util.CollectInputs.inputNumberInt;
import static com.softserve.edu05.util.RandNums.randInt;

public class Employee {

    private final String name;
    private final int deptNum;
    private final int salary;

    public Employee(String name, int deptNum, int salary) {
        this.name = name;
        this.deptNum = deptNum;
        this.salary = salary;

    }

    public int getDeptNum() {
        return deptNum;
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
