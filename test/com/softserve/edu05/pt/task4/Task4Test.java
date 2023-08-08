package com.softserve.edu05.pt.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    static Employee[] testArray= {
            new Employee("Alex", 308, 3400),
            new Employee("Alina", 310, 5600),
            new Employee("Anna", 304, 2700),
            new Employee("Anton", 308, 3900),
            new Employee("Roman", 311, 1800)
    };
    @Test
    void certainDepartment() {
        Employee[] expected = {
                new Employee("Alex", 308, 3400),
                new Employee("Anton", 308, 3900),
        };
        Employee[] actual = Task4.certainDepartment(308, testArray);
        assertArrayEquals(expected, actual);
    }

    @Test
    void descendingSalary() {
        Employee[] expected = {
                new Employee("Alina", 310, 5600),
                new Employee("Anton", 308, 3900),
                new Employee("Alex", 308, 3400),
                new Employee("Anna", 304, 2700),
                new Employee("Roman", 311, 1800)
        };
        Employee[] actual = Task4.descendingSalary(testArray);
        assertArrayEquals(expected, actual);
    }
}