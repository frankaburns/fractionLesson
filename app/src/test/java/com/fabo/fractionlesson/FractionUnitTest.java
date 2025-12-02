package com.fabo.fractionlesson;

import static org.junit.Assert.assertEquals;

import com.fabo.fractionlesson.domain.Fraction;

import org.junit.Test;

public class FractionUnitTest {
   /**
     * Test the add function
     */
    @Test
    public void testFraction() {
        Fraction fraction = new Fraction(5, 75);
        int expected = 75;
        int actual = fraction.getDenominator();
        assertEquals(expected, actual);

        actual = fraction.getNumerator();
        expected = 5;
        assertEquals(expected, actual);

        float realNumber = fraction.getRealNumber();
        float expectedRealNumber = 0.06666667f;
        assertEquals(expectedRealNumber, realNumber, 0.000000001);
        System.out.println("fraction: " +  fraction.getNumerator() + "/" + fraction.getDenominator() + ", Real Number: " + fraction.getRealNumber());
    }
}
