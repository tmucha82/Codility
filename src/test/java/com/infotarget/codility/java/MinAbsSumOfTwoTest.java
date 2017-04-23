package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToIntFunction;

public class MinAbsSumOfTwoTest {

    private MinAbsSumOfTwo minAbsSumOfTwo = new MinAbsSumOfTwo();

    @Test
    public void testSolution1() throws Exception {
        testSolution(minAbsSumOfTwo::solution1);
    }

    @Test
    public void testSolution2() throws Exception {
        testSolution(minAbsSumOfTwo::solution2);
    }

    private void testSolution(ToIntFunction<int[]> solution) throws Exception {
        Assert.assertEquals(1, solution.applyAsInt(new int[]{1, 4, -3}));
        Assert.assertEquals(3, solution.applyAsInt(new int[]{-8, 4, 5, -10, 3}));
    }
}