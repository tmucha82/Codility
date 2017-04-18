package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSliceSumTest {

    private MaxSliceSum maxSliceSum = new MaxSliceSum();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(5ł, maxSliceSum.solution(new int[]{3, 2, -6, 4, 0}));
    }
}