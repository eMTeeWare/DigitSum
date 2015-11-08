package net.emteeware.common;

/**
 * Created by Merlin Thomas on 2015-11-08.
 * Copyright 2015 eMTeeWare
 */
public class DigitSum {
    /**
     * @param input
     * An integer you want to calculate the sum of digits for. (Base 10)
     * @return
     * The sum of digits for the provided input. (Base 10)
     */
    public static int getDigitSum(int input) {
        int digitSum = 0;
        int summedNumber = input;
        int nextDigit;
         do {
            nextDigit = summedNumber%10;
            digitSum += nextDigit;
            summedNumber /= 10;
        } while(summedNumber > 0);

        return digitSum;
    }
}
