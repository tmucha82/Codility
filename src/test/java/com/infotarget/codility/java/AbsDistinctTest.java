package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToIntFunction;

public class AbsDistinctTest {

    private AbsDistinct absDistinct = new AbsDistinct();

    @Test
    public void testSolution1() {
        testSolution(absDistinct::solution1);
    }

    @Test
    public void testSolution2() {
        testSolution(absDistinct::solution2);
    }

    @Test
    public void testSolution3() {
        testSolution(absDistinct::solution3);
    }

    private void testSolution(ToIntFunction<int[]> solution) {
        Assert.assertEquals(5, solution.applyAsInt(new int[]{-5, -3, -1, 0, 3, 6}));
        Assert.assertEquals(4, solution.applyAsInt(new int[]{-5, -4, -4, -4, 0, 1, 1, 1, 4}));
        Assert.assertEquals(1, solution.applyAsInt(new int[]{2, 2, 2, 2, 2}));
        Assert.assertEquals(2, solution.applyAsInt(new int[]{-2147483648, 2147483647}));
        Assert.assertEquals(1, solution.applyAsInt(new int[]{-2147483647, 2147483647}));
        Assert.assertEquals(0, solution.applyAsInt(new int[]{}));
    }
}