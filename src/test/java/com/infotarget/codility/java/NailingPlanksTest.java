package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class NailingPlanksTest {

    private NailingPlanks nailingPlanks = new NailingPlanks();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(4, nailingPlanks.solution(new int[]{1, 4, 5, 8}, new int[]{4, 5, 9, 10}, new int[]{4, 6, 7, 10, 2}));
    }

    @Test
    public void testCheck() throws Exception {
        Assert.assertFalse(nailingPlanks.check(new int[]{1, 4, 5, 8}, new int[]{4, 5, 9, 10}, new int[]{4, 6, 7, 10, 2}, 1));
        Assert.assertFalse(nailingPlanks.check(new int[]{1, 4, 5, 8}, new int[]{4, 5, 9, 10}, new int[]{4, 6, 7, 10, 2}, 2));
        Assert.assertFalse(nailingPlanks.check(new int[]{1, 4, 5, 8}, new int[]{4, 5, 9, 10}, new int[]{4, 6, 7, 10, 2}, 3));
        Assert.assertTrue(nailingPlanks.check(new int[]{1, 4, 5, 8}, new int[]{4, 5, 9, 10}, new int[]{4, 6, 7, 10, 2}, 4));
    }
}