package com.FourPointThreeZero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome palindrome;

    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkPalindrome() {
        boolean value = palindrome.checkPalindrome(12321);
        assertTrue(value);
        value = palindrome.checkPalindrome(55555);
        assertTrue(value);
        value = palindrome.checkPalindrome(45554);
        assertTrue(value);
        value = palindrome.checkPalindrome(11611);
        assertTrue(value);
        value = palindrome.checkPalindrome(15627);
        assertFalse(value);
        value = palindrome.checkPalindrome(67890);
        assertFalse(value);
    }
}