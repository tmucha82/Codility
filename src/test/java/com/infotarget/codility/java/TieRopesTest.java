package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class TieRopesTest {

    private TieRopes tieRopes = new TieRopes();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(3, tieRopes.solution(4, new int[]{1, 2, 3, 4, 1, 1, 3}));
    }
}