package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class NumberSolitaireTest {

    private NumberSolitaire numberSolitaire = new NumberSolitaire();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(8, numberSolitaire.solution(new int[]{1, -2, 0, 9, -1, -2}));
    }
}