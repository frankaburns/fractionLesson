package com.fabo.fractionlesson.domain;

    /**
     * This class defines a math problem the constructor sets the function(Add, Sub, Mul, Div).
     * The constructor takes a Numerator and a operand2. The class also times from the last
     * getNumerator to the answer entered.
     */
    public class BasicFractionalMath {

        /**
         * * Public addition static
         */

        public final static int ADD = 0;
        /**
         * Public subtraction static
         */
        public final static int SUB = 1;

        /**
         * Public multiplication static
         */
        public final static int MUL = 2;

        /**
         * Public division static
         */
        public final static int DIV = 3;

        /**
         * Private variables
         */
        private boolean status = true;
        private long start = 0;
        private long elapsed;
        private final int function;
        private final Fraction operand1;
        private final Fraction operand2;

        /**
         * Create class set function and the Numerator and operand2.
         *
         * @param func   - math function (0-add, 1-sub, 2-mul, 3-div
         * @param top    - numerator value
         * @param bottom - operand2 value
         *               <p>
         *               returns - BasicMath object configured to the input values
         */
        public BasicFractionalMath(int func, Fraction top, Fraction bottom) {
            function = func;
            operand1 = top;
            operand2 = bottom;
        }

        /**
         * perform the math operation requested  on the operand1 and operand2
         *
         * @return - calculated value
         */
        public Fraction doTheMath() {

            Fraction Result;

            switch (function) {
                case ADD:
                    Result = doAdd(operand1, operand2);
                    break;

                case SUB:
                    Result = doSub(operand1, operand2);
                    break;

                case MUL:
                    Result = doMul(operand1, operand2);
                    break;

                case DIV:
                    Result = doDiv(operand1, operand2);
                    break;

                default:
                    Result = new Fraction(-1,-1);
                    break;
            }

            return Result;
        }

        /**
         * Fractional addition, find the Least Common Denominator(LCD), convert each operand
         * to the LCD equivalent, add numerators and the result is the numerator of the answer
         * and the LCD is the denominator, then reduce and return.
         *
         * @param operand1 - first fraction to operate upon.
         * @param operand2 - second fraction to operate upon.
         * @return - A Fraction object containing the answer
         */
        private Fraction doAdd(Fraction operand1, Fraction operand2) {
            int lcd = LCDCalculator.findLCM(operand1.getDenominator(), operand2.getDenominator());
            int sum = lcd/operand1.getDenominator()*operand1.getNumerator() + lcd/operand2.getDenominator()*operand2.getNumerator();
            return FractionReducer.reduceFraction(sum, lcd);
        }

        /**
         * Fractional subtraction, find the Least Common Denominator(LCD), convert each operand
         * to the LCD equivalent, subtract operan2 1numerator from operand2 numerator and the
         * result is the numerator of the answer and the LCD is the denominator, then reduce and return.
         *
         * @param operand1 - first fraction to operate upon.
         * @param operand2 - second fraction to operate upon.
         * @return - A Fraction object containing the answer
         */
        private Fraction doSub(Fraction operand1, Fraction operand2) {

            int lcd = LCDCalculator.findLCM(operand1.getDenominator(), operand2.getDenominator());
            int sum = lcd/operand1.getDenominator()*operand1.getNumerator() - lcd/operand2.getDenominator()*operand2.getNumerator();
            return FractionReducer.reduceFraction(sum, lcd);
        }

        /**
         * Fractional multiplication, multiply the numerators together, multiply the denominators
         * together the resultant numerator and denominator are reduced and returned.
         *
         * @param operand1 - first fraction to operate upon.
         * @param operand2 - second fraction to operate upon.
         * @return - A Fraction object containing the answer
         */
        private Fraction doMul(Fraction operand1, Fraction operand2) {

            int numer = operand1.getNumerator() * operand2.getNumerator();
            int denom = operand1.getDenominator() * operand2.getDenominator();
            return FractionReducer.reduceFraction(numer, denom);
        }

        /**
         * Fractional division, flip the second operand, i.e. the denominator becomes the numerator
         * and the numerator becomes the denominator, multiply the numerators together, multiply the
         * denominators together the resultant numerator and denominator are reduced and returned.
         *
         * @param operand1 - first fraction to operate upon.
         * @param operand2 - second fraction to operate upon.
         * @return - A Fraction object containing the answer
         */
        private Fraction doDiv(Fraction operand1, Fraction operand2) {

            int numer = operand1.getNumerator() * operand2.getDenominator();
            int denom = operand1.getDenominator() * operand2.getNumerator();
            return FractionReducer.reduceFraction(numer, denom);
        }

        /**
         * calculate the problem time
         */
        public void setEnd() {
            long end = System.currentTimeMillis();
            elapsed = end - start;
        }

        /**
         * Set a problem status
         *
         * @param s - right/wrong (true/false)
         */
        public void setStatus(boolean s) {
            status = s;
        }

        /**
         * Get the problem status right/wrong (true/false)
         *
         * @return Status
         */
        public boolean getStatus() {
            return status;
        }

        /**
         * Get the problem execution time (milliseconds)
         *
         * @return elapsed
         */
        public long getElapsed() {
            return elapsed;
        }

        public int getFunction() { return function; }

        /**
         * Get the problem operand1
         *
         * @return operand1
         */
        public Fraction getOperand1() {
            start = System.currentTimeMillis();
            return (operand1);
        }

        /**
         * Get the problem operand2
         *
         * @return operand2
         */
        public Fraction getOperand2() {
            return (operand2);
        }
    }

