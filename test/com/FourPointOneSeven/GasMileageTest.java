package com.FourPointOneSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {
    GasMileage gasMileage;
    @BeforeEach
    void setUp() {
        gasMileage = new GasMileage();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculateGasMileage() {
        assertEquals(2,gasMileage.calculateGasMileage(10.0, 5.0));
    }
}