package com.softserve.edu14.hw.task2;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {


    public static void main(String[] args) {

        Stream<Employee> employeeStream = Stream.of(
                new Employee("Alice"),
                new Employee("Bob"),
                new Employee("Charlie"),
                new Employee("Bob"),
                new Employee("David"),
                new Employee("Alice"),
                new Employee("Eva"),
                new Employee("Charlie")
        );


        Optional<String> mostPopular = mostPopularName(employeeStream);

        System.out.println("Most popular name: " + mostPopular.orElse("No employees"));
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {

        return employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
