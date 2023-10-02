package com.softserve.edu14.Homework.task2;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.softserve.edu14.Homework.task2.Employee.MostPopularName;

public class Main {
    public static void main(String[] args) {
        Stream<Employee> employeeStream = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );
        Optional<String> mostPopularName = MostPopularName(employeeStream);
        System.out.println("Most popular name: " + mostPopularName.orElse("No names found"));
    }


}
