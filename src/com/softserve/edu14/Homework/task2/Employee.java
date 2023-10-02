package com.softserve.edu14.Homework.task2;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;
    private int count;

    public Employee(String name) {
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static Optional<String> MostPopularName(Stream<Employee> employeeStream) {
        Map<String, Long> nameCountMap = employeeStream
                .collect(Collectors.groupingBy(employee -> employee.name, Collectors.counting()));

        return nameCountMap.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }
}

