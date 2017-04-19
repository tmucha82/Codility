package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class FrogRiverOneTest {

    private FrogRiverOne frogRiverOne = new FrogRiverOne();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(6, frogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }
}