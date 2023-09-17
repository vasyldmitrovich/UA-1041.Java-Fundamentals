package com.softserve.edu14.hw.hw02;

import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(
                new Employee(1,"bob"),
                new Employee(2,"Din"),
                new Employee(3,"Sam"),
                new Employee(4,"Sam")
        );

        System.out.println("Most popular name: " + Employee.mostPopularName(employees));
    }
}
