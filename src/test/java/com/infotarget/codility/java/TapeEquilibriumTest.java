package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToIntFunction;

public class TapeEquilibriumTest {

    private TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    public void testSolution1() throws Exception {
        testSolution(tapeEquilibrium::solution1);
    }

    @Test
    public void testSolution2() throws Exception {
        testSolution(tapeEquilibrium::solution2);
    }

    private void testSolution(ToIntFunction<int[]> solution) throws Exception {
        Assert.assertEquals(1, solution.applyAsInt(new int[]{3, 1, 2, 4, 3}));
        Assert.assertEquals(1, solution.applyAsInt(new int[]{-3, 1, 2, 4, 3}));
    }
}