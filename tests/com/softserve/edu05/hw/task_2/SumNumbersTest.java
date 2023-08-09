package com.softserve.edu05.hw.task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumNumbersTest {

    @Test
    void doReaped() {
        String data="yES";
        boolean actual=SumNumbers.doReaped(data);
        assertTrue(actual);
    }
    @Test
    void doReaped1() {
        String data="No";
        boolean actual=SumNumbers.doReaped(data);
        assertFalse(actual);
    }
}