package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class MaxNonoverlappingSegmentsTest {

    private MaxNonoverlappingSegments maxNonoverlappingSegments = new MaxNonoverlappingSegments();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(3, maxNonoverlappingSegments.solution(new int[]{1, 3, 7, 9, 9}, new int[]{5, 6, 8, 9, 10}));
    }
}