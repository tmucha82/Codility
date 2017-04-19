package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class MinPerimeterRectangleTest {

    private MinPerimeterRectangle minPerimeterRectangle = new MinPerimeterRectangle();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(22, minPerimeterRectangle.solution(30));
    }
}