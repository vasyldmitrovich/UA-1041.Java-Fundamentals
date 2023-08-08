package com.softserve.edu05.hw.task1;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TenArrayTest {

    int[] testArray = {6, 8, 12, 96, 8, 34, -8, -16, 3, 11};

    @Test
    void sumOfFirstOrProductOfLastSum() {
        int actual = TenArray.sumOfFirstOrProductOfLast(testArray);
        int expected = 130;
        assertEquals(expected, actual);
    }

    @Test
    void sumOfFirstOrProductOfLastProduct() {
        int actual = TenArray.sumOfFirstOrProductOfLast(testArray);
        int expected = 143616;
        assertEquals(expected, actual);
    }
}