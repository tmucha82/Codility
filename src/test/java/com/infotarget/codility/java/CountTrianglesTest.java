package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class CountTrianglesTest {

    private CountTriangles countTriangles = new CountTriangles();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(4, countTriangles.solution(new int[]{10, 2, 5, 1, 8, 12}));
    }
}