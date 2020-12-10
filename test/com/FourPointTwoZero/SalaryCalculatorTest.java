package com.FourPointTwoZero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {
    SalaryCalculator salaryCalculator;
    @BeforeEach
    void setUp() {
        salaryCalculator = new SalaryCalculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculateSalary() {
       assertEquals(2000, salaryCalculator.calculateSalary(20, 100));
       assertEquals(7000, salaryCalculator.calculateSalary(60, 100));
    }
}