package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class MaxProfitTest {

    private MaxProfit maxProfit = new MaxProfit();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(356, maxProfit.solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
    }
}