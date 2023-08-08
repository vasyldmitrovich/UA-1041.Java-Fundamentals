package com.softserve.edu05.pt.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void isPrime() {
        boolean expected = true;
        boolean actual = PrimeNumber.isPrime(19);
        assertEquals(expected, actual);
    }

    @Test
    void isNotPrime() {
        boolean expected = true;
        boolean actual = PrimeNumber.isPrime(60);
        assertNotEquals(expected, actual);
    }
}