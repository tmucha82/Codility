package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class DominatorTest {

    private Dominator dominator = new Dominator();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(7, dominator.solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));
    }
}