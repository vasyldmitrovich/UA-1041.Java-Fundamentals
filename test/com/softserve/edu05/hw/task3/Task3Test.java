package com.softserve.edu05.hw.task3;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    static Car[] cars = {
            new Car("BMW", 2016, 3.0),
            new Car("Audi", 2020, 2.8),
            new Car("Volkswagen", 2016, 1.9),
            new Car("Toyota", 2010, 2.0)
    };

    @Test
    void certainModelYear() {
        Car[] expected = {
                new Car("BMW", 2016, 3.0),
                new Car("Volkswagen", 2016, 1.9)
        };
        Car[] actual = Task3.certainModelYear(2016, cars);
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortCarsByYearProduction() {
        Car[] expected = {
                new Car("Toyota", 2010, 2.0),
                new Car("BMW", 2016, 3.0),
                new Car("Volkswagen", 2016, 1.9),
                new Car("Audi", 2020, 2.8),
        };
        Car[] actual = Task3.sortCarsByYearProduction(cars);
        assertArrayEquals(expected, actual);
    }
}