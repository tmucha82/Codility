package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDoubleSliceSumTest {

    private MaxDoubleSliceSum maxDoubleSliceSum = new MaxDoubleSliceSum();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(17, maxDoubleSliceSum.solution(new int[]{3, 2, 6, -1, 4, 5, -1, 2}));
    }
}