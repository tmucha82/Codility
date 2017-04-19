package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class MaxProductOfThreeTest {
    private MaxProductOfThree maxProductOfThree = new MaxProductOfThree();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(60, maxProductOfThree.solution(new int[]{-3, 1, 2, -2, 5, 6}));
    }
}