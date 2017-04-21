package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class CommonPrimeDivisorsTest {

    private CommonPrimeDivisors commonPrimeDivisors = new CommonPrimeDivisors();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(1, commonPrimeDivisors.solution(new int[]{15, 10, 3}, new int[]{75, 30, 5}));
    }
}