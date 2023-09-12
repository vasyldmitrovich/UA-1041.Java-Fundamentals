package edu14;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
public class Mainemployee {




    public class Main {
        public static void main(String[] args) {
            Stream<Employee> employees = Stream.of(
                    new Employee("Bob", 18),
                    new Employee("Din", 25),
                    new Employee("Sam", 12),
                    new Employee("Sam", 47)
            );
            System.out.println("most popular name: "+mostPopularName(employees).get());
        }

        private static Optional<String> mostPopularName(Stream<Employee> employees) {
            return employees
                    .collect(groupingBy(Employee::getName, counting()))
                    .entrySet()
                    .stream()
                    .max(Comparator.comparing(Map.Entry::getValue))
                    .map(Map.Entry::getKey);

        }
    }
}
