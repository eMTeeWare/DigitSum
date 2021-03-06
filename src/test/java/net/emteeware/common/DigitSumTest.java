package net.emteeware.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Merlin Thomas on 2015-11-08.
 * �Copyright 2015 eMTeeWare
 */

@RunWith(Parameterized.class)
public class DigitSumTest {

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0,0},{1,1},{2,2},{3,3},{4,4},{5,5},{6,6},{7,7},{8,8},{9,9},
                {10,1},{11,2},{12,3},{13,4},{14,5},{15,6},{16,7},{17,8},{18,9},
                {19,10},{20,2},{21,3},{22,4},{23,5},{24,6},{25,7},{26,8},{27,9},
                {28,10},{29,11},{30,3},{31,4},{32,5},{33,6},{34,7},{35,8},{36,9},
                {37,10},{38,11},{39,12},{40,4},{41,5},{42,6},{43,7},{44,8},{45,9},
                {46,10},{47,11},{48,12},{49,13},{50,5},{51,6},{52,7},{53,8},{54,9},
                {55,10},{56,11},{57,12},{58,13},{59,14},{60,6},{61,7},{62,8},{63,9},
                {64,10},{65,11},{66,12},{67,13},{68,14},{69,15},{70,7},{71,8},{72,9},
                {73,10},{74,11},{75,12},{76,13},{77,14},{78,15},{79,16},{80,8},{81,9},
                {82,10},{83,11},{84,12},{85,13},{86,14},{87,15},{88,16},{89,17},{90,9},
                {91,10},{92,11},{93,12},{94,13},{95,14},{96,15},{97,16},{98,17},{99,18},{100,1},
                {78537, 30},{123912, 18},{999_999_999,81},{1_234_567_890,45},{2_147_483_647,46},
                {0xF,6}, {0xFF, 12}, {010,8}, {2_147_483_648L,47}, {9_223_372_036_854_775_807L,88},
                {8_999_999_999_999_999_999L, 170}, {0b1011100001100110111000001111000000000L, 18}

        });
    }

    private long input;
    private int expectedResult;

    public DigitSumTest(long input, int expectedResult) {
        this.input = input;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testGetDigitSum() throws Exception {
        assertEquals(expectedResult, DigitSum.getDigitSum(input));
    }
}
