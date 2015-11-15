package net.emteeware.common;

import org.junit.Test;

/**
 * Created by Merlin Thomas on 2015-11-10.
 * �Copyright 2015 eMTeeWare
 */
public class DigitSumNegativeTest {

    @Test(expected=IllegalArgumentException.class)
    public void testGetDigitSumWithNegativeInput() throws Exception {
        long result = DigitSum.getDigitSum(-1);
    }
}
