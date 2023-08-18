package com.softserve.edu07.hw.task1;

import java.util.Arrays;
import java.util.Comparator;

public class Appl {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("03543", "Serhii", 6300),
                new SalariedEmployee("07895", "Maksim", 78, 20),
                new ContractEmployee("03547", "Ihor", 5100),
                new SalariedEmployee("07900", "Roman", 51, 30)
        };

        Arrays.sort(employees,
                new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                       return -Integer.compare(((Payment) o1).calculatePay(), ((Payment) o2).calculatePay());
                    }
                }
        );

        //Arrays.stream(employees).forEach(System.out::println);

        for(Employee e : employees){
            System.out.println(e);
        }
    }
}