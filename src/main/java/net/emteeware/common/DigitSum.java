package net.emteeware.common;

/**
 * Created by Merlin Thomas on 2015-11-08.
 * Copyright 2015 eMTeeWare
 */
public final class DigitSum {
    /**
     * Constructor is private to prevent instantiation of this class.
     * It is meant as a static class only providing static methods.
     */
    private DigitSum() {
    }

    /**
     * Calculates the sum of digit for non-negative integers.
     * All calculations will take place for base 10, regardless of the base of the input value.
     * @param input
     * A long you want to calculate the sum of digits for. (Base 8, 10 or 16)
     * For negative input, an IllegalArgumentException will be thrown.
     * @return
     * The sum of digits for the provided input. (Base 10)
     */
    public static long getDigitSum(long input) throws IllegalArgumentException {
        if(input < 0) {
            throw new IllegalArgumentException("Input for getDigitSum() must not be negative.");
        }
        long digitSum = 0;
        long summedNumber = input;
        long nextDigit;
         do {
            nextDigit = summedNumber%10;
            digitSum += nextDigit;
            summedNumber /= 10;
        } while(summedNumber > 0);

        return digitSum;
    }

    /**
     * Calculates the digital root for an non-negative integer.
     * The digital root is the recursive sum of digits until the result has just one digit.
     * All calculations will take place for base 10, regardless of the base of the input value.
     * @param input
     * A long value you want to calculate the digital root for. (Base 8, 10 or 16)
     * For negative input, an IllegalArgumentException will be thrown.
     * @return
     * The digital root for the provided input. (Base 10)
     */
    public static long getDigitalRoot(long input) throws IllegalArgumentException {
        long digitalRoot = input;
        do{
            digitalRoot = getDigitSum(digitalRoot);
        } while(digitalRoot > 9);
        return digitalRoot;
    }
}
