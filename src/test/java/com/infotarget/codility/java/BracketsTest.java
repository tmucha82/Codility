package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class BracketsTest {

    private Brackets brackets = new Brackets();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(1, brackets.solution("(()(())())"));
        Assert.assertEquals(1, brackets.solution("(U)"));
        Assert.assertEquals(1, brackets.solution("{[()()]}"));
        Assert.assertEquals(0, brackets.solution("())"));
        Assert.assertEquals(0, brackets.solution(")"));
        Assert.assertEquals(0, brackets.solution("("));
        Assert.assertEquals(0, brackets.solution("(()"));
        Assert.assertEquals(0, brackets.solution("([)()]"));
    }
}