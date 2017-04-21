package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class FibFrogTest {

    private FibFrog fibFrog = new FibFrog();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(3, fibFrog.solution(new int[]{0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0}));
    }
}