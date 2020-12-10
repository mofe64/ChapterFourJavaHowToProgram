package com.FourPointOneNine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionCalculatorTest {
    SalesCommissionCalculator salesCommissionCalculator;
    @BeforeEach
    void setUp() {
        salesCommissionCalculator = new SalesCommissionCalculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetItemValueReturnsProperValue(){
        assertEquals(239.99,salesCommissionCalculator.getItemValue(1));
        assertEquals(129.75, salesCommissionCalculator.getItemValue(2));
        assertEquals(99.95, salesCommissionCalculator.getItemValue(3));
        assertEquals(350.89, salesCommissionCalculator.getItemValue(4));
    }

    @Test
    void testGetEarningReturnsCorrectEarnings(){
        assertEquals(3700,salesCommissionCalculator.calculateEarnings(4, 10));
    }
}