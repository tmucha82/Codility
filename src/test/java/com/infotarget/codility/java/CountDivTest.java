package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountDivTest {

    private CountDiv countDiv = new CountDiv();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(3, countDiv.solution(5,11,2));
        Assert.assertEquals(3, countDiv.solution(6,11,2));
        Assert.assertEquals(2, countDiv.solution(6,11,3));
        Assert.assertEquals(1, countDiv.solution(6,11,6));
        Assert.assertEquals(4, countDiv.solution(6,12,2));
        Assert.assertEquals(7, countDiv.solution(5,11,1));
    }
}