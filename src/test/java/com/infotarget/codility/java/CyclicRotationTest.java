package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

import static org.junit.Assert.*;

public class CyclicRotationTest {

    private CyclicRotation cyclicRotation = new CyclicRotation();

    @Test
    public void testSolution1() throws Exception {
        testSolution(cyclicRotation::solution1);
    }

    @Test
    public void testSolution2() throws Exception {
        testSolution(cyclicRotation::solution2);
    }

    private void testSolution(BiFunction<int[], Integer, int[]> solution) {
        int[] array = new int[]{3, 8, 9, 7, 6};
        Assert.assertArrayEquals(new int[]{6, 3, 8, 9, 7}, solution.apply(array, 1));
        Assert.assertArrayEquals(new int[]{9, 7, 6, 3, 8}, solution.apply(array, 3));
        Assert.assertArrayEquals(new int[]{3, 8, 9, 7, 6}, solution.apply(array, 5));
    }
}