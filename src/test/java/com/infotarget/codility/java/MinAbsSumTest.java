package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class MinAbsSumTest {

    private MinAbsSum minAbsSum = new MinAbsSum();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(0, minAbsSum.solution(new int[]{1, 5, 2, -2}));
    }
}