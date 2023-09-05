package com.softserve.edu14.hw.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(
                Arrays.asList(
                        new Employee("Bob", 18),
                        new Employee("Din", 25),
                        new Employee("Sam", 12),
                        new Employee("Sam", 47)
                ));
        mostPopularName(employees.stream());
    }
   private static Optional<String> mostPopularName(Stream< Employee> employees) {
//        employees
//                .mapTo
//                .count()
        return null;
    }
}
