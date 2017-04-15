package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToIntFunction;

public class BinaryGapTest {

    private BinaryGap binaryGap = new BinaryGap();

    @Test
    public void testSolution1() throws Exception {
        testSolution(binaryGap::solution1);
    }

    @Test
    public void testSolution2() throws Exception {
        testSolution(binaryGap::solution2);
    }

    private void testSolution(ToIntFunction<Integer> solution) {
        Assert.assertEquals(2, solution.applyAsInt(9));
        Assert.assertEquals(4, solution.applyAsInt(529));
        Assert.assertEquals(5, solution.applyAsInt(1041));
        Assert.assertEquals(0, solution.applyAsInt(15));
        Assert.assertEquals(0, solution.applyAsInt(8));

    }
}