package com.fabo.fractionlesson;

import static org.junit.Assert.assertEquals;

import com.fabo.fractionlesson.domain.BasicFractionalMath;
import com.fabo.fractionlesson.domain.Fraction;

import org.junit.Test;

public class BasicFractionalMathUnitTest {
    /**
     * Test the add function
     */
    @Test
    public void testAdd() {
        Fraction op1 = new Fraction(1, 2);
        Fraction op2 = new Fraction(1, 4);
        BasicFractionalMath bfm = new BasicFractionalMath(BasicFractionalMath.ADD, op1, op2);
        Fraction expected = new Fraction(3, 4);
        Fraction actual = bfm.doTheMath();
        assertEquals(expected.getNumerator(), actual.getNumerator());
        assertEquals(expected.getDenominator(), actual.getDenominator());
    }

    /**
     * Test the subtract function
     */
    @Test
    public void testSub() {
        Fraction op1 = new Fraction(1, 2);
        Fraction op2 = new Fraction(1, 4);
        BasicFractionalMath bfm = new BasicFractionalMath(BasicFractionalMath.SUB, op1, op2);
        Fraction expected = new Fraction(1, 4);
        Fraction actual = bfm.doTheMath();
        assertEquals(expected.getNumerator(), actual.getNumerator());
        assertEquals(expected.getDenominator(), actual.getDenominator());
   }

    /**
     * Test the multiply function
     */
    @Test
    public void testMul() {
        Fraction op1 = new Fraction(1, 2);
        Fraction op2 = new Fraction(1, 4);
        BasicFractionalMath bfm = new BasicFractionalMath(BasicFractionalMath.MUL, op1, op2);
        Fraction expected = new Fraction(1, 8);
        Fraction actual = bfm.doTheMath();
        assertEquals(expected.getNumerator(), actual.getNumerator());
        assertEquals(expected.getDenominator(), actual.getDenominator());
    }
    /**
     * Test the divide function
     */
    @Test
    public void testDiv() {
        Fraction op1 = new Fraction(1, 2);
        Fraction op2 = new Fraction(1, 4);
        BasicFractionalMath bfm = new BasicFractionalMath(BasicFractionalMath.DIV, op1, op2);
        Fraction expected = new Fraction(2, 1);
        Fraction actual = bfm.doTheMath();
        assertEquals(expected.getNumerator(), actual.getNumerator());
        assertEquals(expected.getDenominator(), actual.getDenominator());
    }
}
