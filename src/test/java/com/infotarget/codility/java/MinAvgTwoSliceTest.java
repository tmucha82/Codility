package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class MinAvgTwoSliceTest {

    private MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(1, minAvgTwoSlice.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }
}