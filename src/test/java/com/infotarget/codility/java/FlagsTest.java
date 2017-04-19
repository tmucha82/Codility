package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class FlagsTest {

    private Flags flags = new Flags();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(3, flags.solution(new int[]{1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}));
    }

    @Test
    public void testFindPeaks() {
        Assert.assertArrayEquals(
                new boolean[]{false, true, false, true, false, true, false, false, false, false, true, false},
                flags.findPeaks(new int[]{1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}));
    }

    @Test
    public void testCheck() {
        /**
         * two flags, you can set them on peaks 1 and 5;
         * three flags, you can set them on peaks 1, 5 and 10;
         * four flags, you can set only three flags, on peaks 1, 5 and 10.
         */
        int[] area = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        Assert.assertTrue(flags.check(area, 2, flags.findPeaks(area)));
        Assert.assertTrue(flags.check(area, 3, flags.findPeaks(area)));
        Assert.assertFalse(flags.check(area, 4, flags.findPeaks(area)));
    }
}