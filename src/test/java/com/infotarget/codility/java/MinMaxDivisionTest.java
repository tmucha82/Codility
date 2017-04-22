package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class MinMaxDivisionTest {

    private MinMaxDivision minMaxDivision = new MinMaxDivision();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(6, minMaxDivision.solution(3, 5, new int[]{2, 1, 5, 1, 2, 2, 2}));
    }

    @Test
    public void test() {
        int[] A = {2, 1, 5, 1, 2, 2, 2};
        Assert.assertEquals(new Point(4, 5), minMaxDivision.getBlocksForSumUpToMid(A, 5));
        Assert.assertEquals(new Point(3, 6), minMaxDivision.getBlocksForSumUpToMid(A, 6));
        Assert.assertEquals(new Point(1, 15), minMaxDivision.getBlocksForSumUpToMid(A, 15));
    }

}