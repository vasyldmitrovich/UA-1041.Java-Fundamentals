package com.softserve.edu05.hw.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Integer10NumbersTest {

    @Test
    void isPositiveFiveElem1() {
        int[] array={-1,2,5,1,2,-1,2,1,1};

       boolean actual= Integer10Numbers.isPositiveFiveElem(array);
       assertFalse(actual);
    }
    @Test
    void isPositiveFiveElem2() {
        int[] array={1,2,5,1,2,-1,2,1,1};

        boolean actual= Integer10Numbers.isPositiveFiveElem(array);
        assertTrue(actual);
    }
}