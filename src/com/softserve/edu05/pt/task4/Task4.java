package com.softserve.edu05.pt.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alex", 308, 3400);
        Employee e2 = new Employee("Alina", 310, 5600);
        Employee e3 = new Employee("Anna", 304, 2700);
        Employee e4 = new Employee("Anton", 308, 3900);
        Employee e5 = new Employee("Roman", 311, 1800);

        System.out.println(Arrays.toString(certainDepartment(308, e1, e2, e3, e4, e5)));
        System.out.println(Arrays.toString(descendingSalary(e1, e2, e3, e4, e5)));

    }

    public static Employee[] certainDepartment(int departmentNumber, Employee... employees){
      // return Arrays.stream(employees).filter(e -> e.getDepartmentNumber() == departmentNumber).toArray(Employee[]::new);

        List<Employee> list = new ArrayList<>();
        for(Employee e : employees){
            if(e.getDepartmentNumber() == departmentNumber)
                list.add(e);
        }
        return list.toArray(Employee[]::new);
    }

    public static Employee[] descendingSalary(Employee... employees){
      // return Arrays.stream(employees).sorted(Comparator.comparing(Employee::getSalary).reversed()).toArray(Employee[]::new);

       Arrays.sort(employees, Comparator.comparing(Employee::getSalary).reversed());
       return employees;
    }
}