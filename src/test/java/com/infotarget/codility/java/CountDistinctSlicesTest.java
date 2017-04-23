package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class CountDistinctSlicesTest {

    private CountDistinctSlices countDistinctSlices = new CountDistinctSlices();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(9, countDistinctSlices.solution(6, new int[]{3, 4, 5, 5, 2}));
    }
}