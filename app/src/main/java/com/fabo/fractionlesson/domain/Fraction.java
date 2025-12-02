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
     * @param o - Fraction Object
     * @return boolean true equal, false NOT equal
     */

    @Override
    public boolean equals(Object o) {
        // 1. Self-comparison check
        if (this == o) {
            return true;
        }

        // 2. Null check and type check
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        // 3. Cast the object to the correct type
        Fraction other = (Fraction) o;

        // 4. Compare relevant fields
        // For primitive types, use ==
        // For object types, use their equals() method or Objects.equals() for null-safe comparison
        return ((numerator == other.numerator) && (denominator == other.denominator));
        // Alternatively, using Objects.equals() for cleaner comparison of object fields:
        // return id == other.id && Objects.equals(name, other.name);
    }

    // It's crucial to also override hashCode() when overriding equals()
    @Override
    public int hashCode() {
        // Generate a hash code based on the same fields used in equals()
        // Alternatively, using Objects.hash() for convenience:
        return Objects.hash(numerator, denominator);
    }
}
