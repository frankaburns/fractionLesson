package com.fabo.fractionlesson.domain;

import androidx.annotation.NonNull;
import java.util.Objects;

/**
 * This class defines a math problem the constructor sets the function(Add, Sub, Mul, Div).
 * The constructor takes a Numerator and a Denominator. The class also times from the last
 * getNumerator to the answer entered.
 */
public class Fraction {

    /**
     * Private variables
     */
    private final int numerator;
    private final int denominator;
    private final float realNumber;
    /**
     * Create class set function and the Numerator and Denominator.
     *
     * @param top - numerator value
     * @param bottom - denominator value
     *
     * returns - BasicMath object configured to the input values
     */
    public Fraction(int top, int bottom) {
        numerator   = top;
        denominator = bottom;
        realNumber  = ((float)top / (float)bottom);
    }

    /**
     * Create class set function and the Numerator and Denominator.
     *
     * @param s - a fraction represented as a string.
     */
    public Fraction(String s) {
        String[] parts = s.split("/");
        numerator = Integer.parseInt(parts[0]);
        denominator = Integer.parseInt(parts[1]);
        realNumber = ((float) numerator / (float) denominator);
    }

    /**
     * Get the problem Numerator
     * @return Numerator
     */
    public int getNumerator () {
        return (numerator);
    }

    /**
     * Get the problem Denominator
     * @return Denominator
     */
    public int getDenominator () {
        return (denominator);
    }

    /**
     * Return the real floating point value of the fraction.
     * @return the real number value of the fraction.
     */
    public float getRealNumber() {
        return (realNumber);
    }

    /**
     * Return a string representation of this fraction
     * @return - fraction as a string
     */
    @NonNull
    public String toString() {
        return (numerator + "/" + denominator);
    }


    /**
     * Is the input Fraction less than this Fraction. Find the Least Common Denominator(LCD).
     * Multiply each numerator by the LCD. return true if the normalized numerator of the
     * input fraction is less than the normalized numerator of this Fraction.
     *
     * @param frac - a Fraction object to compare with this Fraction object
     * @return - if the input fraction is less that this Fraction.
     */
    public boolean lessThan(Fraction frac) { return frac.getRealNumber() > this.getRealNumber(); }
    /**
     * Is the input Fraction greater than this Fraction. Find the Least Common Denominator(LCD).
     * Multiply each numerator by the LCD. return true if the normalized numerator of the
     * input fraction is greater than the normalized numerator of this Fraction.
     *
     * @param frac - a Fraction object to compare with this Fraction object
     * @return - if the input fraction is greater that this Fraction.
     */

    public boolean greaterThan(Fraction frac) { return frac.getRealNumber() > this.getRealNumber();}

    /**
     * This method overrides the Object equals virtual function by the following steps:
     *    1. Self-comparison check
     *    2. Null check and type check
     *    3. Cast the object to the correct type
     *    4. Compare relevant fields
     *
     * @param o - Fraction Object
     * @return boolean true equal, false NOT equal
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Fraction other = (Fraction) o;

        return (realNumber == other.realNumber);
     }

    /**
     * It's crucial to also override hashCode() when overriding equals()
     * Generate a hash code based on the same fields used in equals()
     * Alternatively, using Objects.hash() for convenience:
     *
     * @return an int of the generated hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}
