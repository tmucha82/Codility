package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class LadderTest {

    private Ladder ladder = new Ladder();

    @Test
    public void testSolution() throws Exception {
        Assert.assertArrayEquals(new int[]{5, 1, 8, 0, 1}, ladder.solution(new int[]{4, 4, 5, 5, 1}, new int[]{3, 2, 4, 3, 1}));
    }
}