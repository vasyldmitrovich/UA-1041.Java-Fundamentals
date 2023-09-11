package com.softserve.edu14.hw.task2;


import com.softserve.edu14.hw.task1.Employee;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Stream<Employee> stream = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam"));

        System.out.println(mostPopularName(stream));
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
