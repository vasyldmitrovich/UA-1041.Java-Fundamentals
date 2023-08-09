package com.softserve.edu05.hw.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Integer5NumbersTest {

    @Test
    void positionOfSecondPositiveNumber() {
        //Given
        int[] data = {1, -5, 13, 11, 7};
        int expected = 2;
        //When
        int actual = Integer5Numbers.positionOfSecondPositiveNumber(data);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    void findMinPosition() {
        //Given
        int[] data = {1, -5, 13, 11, 7};
        int expected= 1;
        //When
        int actual = Integer5Numbers.findMinPosition(data);
        //Then
        assertEquals(expected, actual);
    }
    @Test
    void calculateProductEventNumb() {
        //Given
        int[] data = {1, -5, 2, 0, -1};
        long expected= 10;
        //When
        long actual = Integer5Numbers.calculateProductEventNumb(data);
        //Then
        assertEquals(expected, actual);
    }
}