package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class ChocolatesByNumbersTest {

    private ChocolatesByNumbers chocolatesByNumbers = new ChocolatesByNumbers();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(5, chocolatesByNumbers.solution(10, 4));
    }
}