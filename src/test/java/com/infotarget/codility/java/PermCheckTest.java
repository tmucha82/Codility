package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class PermCheckTest {

    private PermCheck permCheck = new PermCheck();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(1, permCheck.solution(new int[]{4, 1, 3, 2}));
        Assert.assertEquals(0, permCheck.solution(new int[]{4, 1, 3}));
    }
}