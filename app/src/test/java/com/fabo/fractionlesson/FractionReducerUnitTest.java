package com.fabo.fractionlesson;
import static org.junit.Assert.assertEquals;

import com.fabo.fractionlesson.domain.BasicFractionalMath;
import com.fabo.fractionlesson.domain.Fraction;
import com.fabo.fractionlesson.domain.FractionReducer;

import org.junit.Test;

public class FractionReducerUnitTest {
    @Test
    public void testReduction() {
      Fraction reduced = FractionReducer.reduceFraction(12, 18);
      int expectedNumerator = 2;
      int expectedDenominator = 3;
      assertEquals(expectedDenominator, reduced.getDenominator());
      assertEquals(expectedNumerator, reduced.getNumerator());
    }
}
