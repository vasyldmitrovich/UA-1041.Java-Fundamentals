package com.softserve.edu05.pt.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberTest {

    static int[] testArray = {45, 93, -9, 23, -67, 13};
    @Test
    void biggestNumber() {
        int expected = 93;
        int actual = RandomNumber.biggestNumber(testArray);
        assertEquals(expected, actual);
    }

    @Test
    void sumOfPositiveNumbers() {
        int expected = 174;
        int actual = RandomNumber.sumOfPositiveNumbers(testArray);
        assertEquals(expected, actual);
    }

    @Test
    void countOfNegativeNumbers() {
        int expected = 2;
        int actual = RandomNumber.countOfNegativeNumbers(testArray);
        assertEquals(expected, actual);
    }
}