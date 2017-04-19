package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToIntFunction;

public class MaxProfitTest {

    private MaxProfit maxProfit = new MaxProfit();

    @Test
    public void testSolution1() throws Exception {
        testSolution(maxProfit::solution1);
    }

    @Test
    public void testSolution2() throws Exception {
        testSolution(maxProfit::solution2);
    }

    private void testSolution(ToIntFunction<int[]> solution) throws Exception {
        Assert.assertEquals(356, solution.applyAsInt(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
    }

}