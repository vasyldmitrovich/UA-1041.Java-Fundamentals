package com.softserve.edu14.hw.task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Application {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Bob"));
        employees.add(new Employee(2, "Bob"));
        employees.add(new Employee(3, "Max"));
        employees.add(new Employee(4, "Sam"));
        employees.add(new Employee(5, "Din"));

        System.out.println(mostPopularName(employees.stream()));
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees){
        return employees
                .collect(Collectors.groupingBy(    // групировка к map
                        Employee::getName,
                        LinkedHashMap::new,     // map<field, count>
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey);    // from Optional<Entry>
    }

}
