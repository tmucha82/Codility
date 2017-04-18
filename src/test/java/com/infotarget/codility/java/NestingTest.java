package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class NestingTest {

    private Nesting nesting = new Nesting();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(1, nesting.solution("(()(())())"));
        Assert.assertEquals(1, nesting.solution("(U)"));
        Assert.assertEquals(0, nesting.solution("())"));
        Assert.assertEquals(0, nesting.solution(")"));
        Assert.assertEquals(0, nesting.solution("("));
        Assert.assertEquals(0, nesting.solution("(()"));
    }
}