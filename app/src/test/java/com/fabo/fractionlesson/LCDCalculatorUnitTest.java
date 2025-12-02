package com.fabo.fractionlesson;

import static org.junit.Assert.assertEquals;

import com.fabo.fractionlesson.domain.LCDCalculator;

import org.junit.Test;

public class LCDCalculatorUnitTest {
    @Test
    public void testFindGCD() {
        int actual = LCDCalculator.findGCD(12, 18);
        int expected = 6;
        assertEquals(expected, actual);
    }
}