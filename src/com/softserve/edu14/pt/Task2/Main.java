package com.softserve.edu14.pt.Task2;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {
        Stream<Employee>employeeStream=Stream.of(
                new Employee(1,"Alex",20),
                new Employee(2,"Alex",33),
                new Employee(3,"Bob",22),
                new Employee(4,"Alina",11),
                new Employee(5,"Alex",44),
                new Employee(6,"Bob",23),
                new Employee(7,"Jon",21),
                new Employee(8,"Bob",32),
                new Employee(9,"Bob",44),
                new Employee(10,"Bob",64)
        );
        System.out.println(mostPopularName(employeeStream));
    }
    public static Optional<String> mostPopularName(Stream< Employee> employees) {

        return  employees.collect(
                        groupingBy(Employee::getName, LinkedHashMap::new,counting()))
                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey);

    }


}
