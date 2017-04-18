package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfDiscIntersectionsTest {

    private NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(11, numberOfDiscIntersections.solution(new int[]{1, 5, 2, 1, 4, 0}));
    }
}