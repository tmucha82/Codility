package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;

public class CountNonDivisibleTest {

    private CountNonDivisible countNonDivisible = new CountNonDivisible();

    @Test
    public void testSolution1() throws Exception {
        testSolution(countNonDivisible::solution1);
    }

    @Test
    public void testSolution2() throws Exception {
        testSolution(countNonDivisible::solution2);
    }

    private void testSolution(Function<int[], int[]> solution) throws Exception {
        Assert.assertArrayEquals(new int[]{2, 4, 3, 2, 0}, solution.apply(new int[]{3, 1, 2, 3, 6}));
    }

}