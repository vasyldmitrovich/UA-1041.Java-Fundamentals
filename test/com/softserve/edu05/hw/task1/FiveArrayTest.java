package com.softserve.edu05.hw.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiveArrayTest {


    private final static int[] testArray = {54, -243, -1278, -8, -25};
    @Test
    void positionSecondPositiveWithoutPosNum() {
        int actual = FiveArray.positionSecondPositive(testArray);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void positionSecondPositive() {
        int actual = FiveArray.positionSecondPositive(54, -243, -1278, 8, -25);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void minAndPosition() {
        int[] actual = FiveArray.minAndPosition(testArray);
        int[] expected = {-1278, 2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void productEvenNumbers() {
        long actual = FiveArray.productEvenNumbers(testArray);
        long expected = 552096;
        assertEquals(expected, actual);
    }
}