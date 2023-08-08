package com.softserve.edu05.pt.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysWorkTest {

    static int[] testArray = {5, 9, 3, 1, 45};

    @Test
    void culcAverage() {
        double expected = 12.6;
        double actual = ArraysWork.culcAverage(testArray);
        assertEquals(expected, actual);
    }

    @Test
    void searchElement1() {
        boolean expected = true;
        boolean actual = ArraysWork.searchElement(testArray, 9);
        assertEquals(expected, actual);
    }

    @Test
    void searchElement2() {
        boolean expected = false;
        boolean actual = ArraysWork.searchElement(testArray, 15);
        assertEquals(expected, actual);
    }
}