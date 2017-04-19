package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class FrogJmpTest {

    private FrogJmp frogJmp = new FrogJmp();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(3, frogJmp.solution(10, 85, 30));
    }
}