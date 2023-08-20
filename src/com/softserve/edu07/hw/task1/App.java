package com.softserve.edu07.hw.task1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new ContractEmployee("742388", 12000, "John"));
        list.add(new SalariedEmployee("773213", 70, 200, "Alice"));
        list.add(new ContractEmployee("742378", 15000, "Maria"));
        list.add(new SalariedEmployee("777413", 50, 205, "Dan"));
        for (Employee emp : list) {
            System.out.println(emp);
        }
        list.sort(new SalaryComparator().reversed());
        System.out.println("=================");
        for (Employee emp : list) {
            System.out.println(emp);
        }
    }
}
