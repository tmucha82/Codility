package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class MinMaxDivisionTest {

    private MinMaxDivision minMaxDivision = new MinMaxDivision();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(6, minMaxDivision.solution(3, 5, new int[]{2, 1, 5, 1, 2, 2, 2}));
    }
}