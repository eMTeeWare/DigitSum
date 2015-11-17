package net.emteeware.common;

        import org.junit.Test;

/**
 * Created by Merlin Thomas on 2015-11-13.
 * Copyright 2015 eMTeeWare
 */
public class DigitalRootNegativeTest {

    @Test(expected=IllegalArgumentException.class)
    public void testGetDigitalRootWithNegativeInput() throws Exception {
        int result = DigitSum.getDigitalRoot(-1);
    }
}
