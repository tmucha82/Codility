package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PeaksTest {

    private Peaks peaks = new Peaks();

    @Ignore
    public void testSolution() throws Exception {
        Assert.assertEquals(3, peaks.solution(new int[]{1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}));
    }
}