package com.softserve.edu14.Homework.task2;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.softserve.edu14.Homework.task2.Employee.MostPopularName;

public class Main {
    public static void main(String[] args) {
        Stream<Employee> employeeStream = Stream.of(
                new Employee(1,"Bob"),
                new Employee(2,"Din"),
                new Employee(3,"Sam"),
                new Employee(4,"Sam")
        );
       var res = MostPopularName(employeeStream);
        System.out.println(res);

    }


}
