package com.fabo.fractionlesson.domain;

public class FractionReducer {

    public FractionReducer() {}

    // Method to reduce a fraction to its lowest terms
    public static Fraction reduceFraction(int numerator, int denominator) {
        if (denominator == 0) {
            return new Fraction(-1, -1);
        }
        if (numerator == 0) {
            return new Fraction(0, 1); // Zero numerator always results in 0
        }

        int gcd = LCDCalculator.findGCD(numerator, denominator);

        int reducedNumerator = numerator / gcd;
        int reducedDenominator = denominator / gcd;

        // Handle negative signs for proper representation
        if (reducedDenominator < 0) {
            reducedNumerator = -reducedNumerator;
            reducedDenominator = -reducedDenominator;
        }

        return new Fraction(reducedNumerator, reducedDenominator);
    }
}
