package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToIntFunction;

public class PermMissingElemTest {

    private PermMissingElem permMissingElem = new PermMissingElem();

    @Test
    public void testSolution1() throws Exception {
        testSolution(permMissingElem::solution1);
    }

    @Test
    public void testSolution2() throws Exception {
        testSolution(permMissingElem::solution2);
    }

    private void testSolution(ToIntFunction<int[]> solution) throws Exception {
        Assert.assertEquals(4, solution.applyAsInt(new int[]{2, 3, 1, 5}));
    }
}