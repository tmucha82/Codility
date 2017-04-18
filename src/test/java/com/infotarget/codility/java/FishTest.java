package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class FishTest {

    private Fish fish = new Fish();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(2, fish.solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}));
    }
}