package com.FourPointTwoOne;

import com.FourPointOneNine.SalesCommissionCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {
    LargestNumber largestNumber;
    @BeforeEach
    void setUp() {
        largestNumber = new LargestNumber();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testGetLargestReturnsLargestNumberInRangeOfNumbers(){
        int[] numArray = {1,2,4,5,70,9,76,1,0};
        assertEquals(76,largestNumber.findLargest(numArray));
    }

    @Test
    void testGetTwoLargestReturnsTheTwoLargestNumbersInRangeOfNumbers(){
        int[] numArray = {1,2,5,6,8,9,9,119,589, 0, 199000};
        assertEquals("Largest two numbers are 199000 and 589", largestNumber.largestTwoNumbers(numArray));
    }

}