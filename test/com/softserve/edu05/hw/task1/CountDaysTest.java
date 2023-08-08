package com.softserve.edu05.hw.task1;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDaysTest {

    @Test
    void culcDaysTrue() {
        int actual = 31;
        int expected = CountDays.culcDays(3);
        assertEquals(expected, actual);
    }

    @Test
    void culcDaysWithoutMonth() {
        int actual = 0;
        int expected = CountDays.culcDays(14);
        assertEquals(expected, actual);
    }

    @Test
    void culcDaysFalse() {
        int actual = 31;
        int expected = CountDays.culcDays(6);
        assertNotEquals(expected, actual);
    }
}