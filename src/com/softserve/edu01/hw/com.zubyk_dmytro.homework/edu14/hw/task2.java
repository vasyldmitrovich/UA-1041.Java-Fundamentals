package edu14.hw;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class task2 {
    public static void main(String[] args) {
        Stream<Employee> employeeStream = createEmployeeStream();

        Optional<String> mostPopularName = mostPopularName(employeeStream);

        if (mostPopularName.isPresent()) {
            System.out.println("Most popular name: " + mostPopularName.get());
        } else {
            System.out.println("No employees found.");
        }
    }

    // Method to create a stream of Employee objects (for testing purposes)
    private static Stream<Employee> createEmployeeStream() {
        List<Employee> employees = Arrays.asList(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );
        return employees.stream();
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCountMap = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        if (nameCountMap.isEmpty()) {
            return Optional.empty();
        }

        long maxCount = Collections.max(nameCountMap.values());
        List<String> mostPopularNames = nameCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == maxCount)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        if (mostPopularNames.size() == 1) {
            return Optional.of(mostPopularNames.get(0));
        } else {
            return Optional.empty(); // Multiple names with the same popularity
        }
    }
}

