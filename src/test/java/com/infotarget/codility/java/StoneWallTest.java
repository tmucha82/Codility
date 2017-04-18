package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class StoneWallTest {

    private StoneWall stoneWall = new StoneWall();

    @Test
    public void testSolution() {
        Assert.assertEquals(7, stoneWall.solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8}));
    }
}