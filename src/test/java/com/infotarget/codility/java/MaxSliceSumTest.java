package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToIntFunction;

public class MaxSliceSumTest {

    private MaxSliceSum maxSliceSum = new MaxSliceSum();

    @Test
    public void testSolution1() throws Exception {
        testSolution(maxSliceSum::solution1);
    }

    @Test
    public void testMaxSlice() throws Exception {
        testSolution(maxSliceSum::solution2);
    }

    private void testSolution(ToIntFunction<int[]> solution) throws Exception {
        Assert.assertEquals(5, solution.applyAsInt(new int[]{3, 2, -6, 4, 0}));
        Assert.assertEquals(18, solution.applyAsInt(new int[]{5, -2, 10, 3, -25, 12, 6}));
    }
}