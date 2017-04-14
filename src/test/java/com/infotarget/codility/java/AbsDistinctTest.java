package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class AbsDistinctTest {

    private AbsDistinct absDistinct = new AbsDistinct();

    @Test
    public void testSolution1() {
        Assert.assertEquals(5, absDistinct.solution1(new int[]{-5, -3, -1, 0, 3, 6}));
        Assert.assertEquals(4, absDistinct.solution1(new int[]{-5, -4, -4, -4, 0, 1, 1, 1, 4}));
        Assert.assertEquals(1, absDistinct.solution1(new int[]{2, 2, 2, 2, 2}));
        Assert.assertEquals(2, absDistinct.solution1(new int[]{-2147483648, 2147483647}));
        Assert.assertEquals(1, absDistinct.solution1(new int[]{-2147483647, 2147483647}));
        Assert.assertEquals(0, absDistinct.solution1(new int[]{}));
    }

    @Test
    public void testSolution2() {
        Assert.assertEquals(5, absDistinct.solution2(new int[]{-5, -3, -1, 0, 3, 6}));
        Assert.assertEquals(4, absDistinct.solution2(new int[]{-5, -4, -4, -4, 0, 1, 1, 1, 4}));
        Assert.assertEquals(1, absDistinct.solution2(new int[]{2, 2, 2, 2, 2}));
        Assert.assertEquals(2, absDistinct.solution2(new int[]{-2147483648, 2147483647}));
        Assert.assertEquals(1, absDistinct.solution2(new int[]{-2147483647, 2147483647}));
        Assert.assertEquals(0, absDistinct.solution2(new int[]{}));
    }

    @Test
    public void testSolution3() {
        Assert.assertEquals(5, absDistinct.solution3(new int[]{-5, -3, -1, 0, 3, 6}));
        Assert.assertEquals(4, absDistinct.solution3(new int[]{-5, -4, -4, -4, 0, 1, 1, 1, 4}));
        Assert.assertEquals(1, absDistinct.solution3(new int[]{2, 2, 2, 2, 2}));
        Assert.assertEquals(2, absDistinct.solution3(new int[]{-2147483648, 2147483647}));
        Assert.assertEquals(1, absDistinct.solution3(new int[]{-2147483647, 2147483647}));
        Assert.assertEquals(0, absDistinct.solution3(new int[]{}));
    }
}