package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingIntegerTest {

    private MissingInteger missingInteger = new MissingInteger();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(5, missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }
}