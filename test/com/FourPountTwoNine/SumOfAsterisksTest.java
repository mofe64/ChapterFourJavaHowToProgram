package com.FourPountTwoNine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfAsterisksTest {
    SumOfAsterisks sumOfAsterisks;
    @BeforeEach
    void setUp() {
        sumOfAsterisks = new SumOfAsterisks();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testPrint(){
        sumOfAsterisks.printAsterisks(5);
    }
}