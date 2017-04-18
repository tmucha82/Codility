package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassingCarsTest {

    private PassingCars passingCars = new PassingCars();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(5, passingCars.solution(new int[]{0, 1, 0, 1, 1}));
    }
}