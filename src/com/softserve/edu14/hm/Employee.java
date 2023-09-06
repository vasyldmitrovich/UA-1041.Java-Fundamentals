package com.softserve.edu14.hm;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCountMap = employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<Map.Entry<String, Long>> maxEntry = nameCountMap.entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue));

        return maxEntry.map(Map.Entry::getKey)
                .or(() -> Optional.empty());
    }

    public static void main(String[] args) {
        Stream<Employee> stream =
                Stream.of(new Employee("John"),
                        new Employee("Mary"),
                        new Employee("Rick"),
                        new Employee("Bob"),
                        new Employee("Ill"));
        System.out.println(Employee.mostPopularName(stream));


    }
}
