package net.emteeware.common;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Merlin Thomas on 2015-11-08.
 *  Copyright 2015 eMTeeWare
 */
public class DigitSumTest {

    @Test
    public void testGetDigitSum() throws Exception {
        int expectedResult = 0;
        int result = DigitSum.getDigitSum(0);

        assertEquals(expectedResult, result);
    }
}