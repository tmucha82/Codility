package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class CountNonDivisibleTest {

    private CountNonDivisible countNonDivisible = new CountNonDivisible();

    @Test
    public void testSolution() throws Exception {
        Assert.assertArrayEquals(new int[]{}, countNonDivisible.solution(new int[]{}));
    }
}