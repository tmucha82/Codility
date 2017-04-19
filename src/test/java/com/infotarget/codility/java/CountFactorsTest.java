package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CountFactorsTest {

    private CountFactors countFactors = new CountFactors();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(8, countFactors.solution(24));
    }
}