package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EquiLeaderTest {

    private EquiLeader equiLeader = new EquiLeader();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(2, equiLeader.solution(new int[]{4, 3, 4, 4, 4, 2}));
    }
}