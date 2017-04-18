package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class MaxCountersTest {

    private MaxCounters maxCounters = new MaxCounters();

    @Test
    public void testSolution() throws Exception {
        Assert.assertArrayEquals(new int[]{3, 2, 2, 4, 2}, maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }
}