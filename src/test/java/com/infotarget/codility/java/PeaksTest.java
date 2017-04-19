package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class PeaksTest {

    private Peaks peaks = new Peaks();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(3, peaks.solution(new int[]{1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}));
    }

    @Test
    public void testFindPeaks() throws Exception {
        List<Integer> peaksPeaks = peaks.findPeaks(new int[]{1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2});
        Assert.assertArrayEquals(new Integer[]{3, 5, 10}, peaksPeaks.toArray(new Integer[peaksPeaks.size()]));
    }
}