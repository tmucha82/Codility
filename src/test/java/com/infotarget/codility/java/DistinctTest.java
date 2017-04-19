package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToIntBiFunction;

public class DistinctTest {

    private Distinct distinct = new Distinct();

    @Test
    public void testSolution1() throws Exception {
        testSolution(distinct::solution1);
    }

    @Test
    public void testSolution2() throws Exception {
        testSolution(distinct::solution2);
    }

    private void testSolution(ToIntBiFunction<int[], Integer> solution) {
        Assert.assertEquals(3, solution.applyAsInt(new int[]{2, 1, 1, 2, 3, 1}, 6));
    }
}