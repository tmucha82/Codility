package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    private Triangle triangle = new Triangle();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(1, triangle.solution(new int[]{10, 2, 5, 1, 8, 20}));
        Assert.assertEquals(0, triangle.solution(new int[]{10, 50, 5, 1}));
    }
}