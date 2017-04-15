package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToIntBiFunction;

public class OddOccurrencesInArrayTest {

    private OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    @Test
    public void testSolution1() throws Exception {
        testSolution(oddOccurrencesInArray::solution1);
    }

    @Test
    public void testSolution2() throws Exception {
        testSolution(oddOccurrencesInArray::solution2);
    }

    private void testSolution(ToIntBiFunction<int[], Integer> solution) {
        Assert.assertEquals(7, solution.applyAsInt(new int[]{9, 3, 9, 3, 9, 7, 9}, 7));
        Assert.assertEquals(0, solution.applyAsInt(new int[]{9, 3, 9, 3, 9, 0, 9}, 7));
        Assert.assertEquals(9, solution.applyAsInt(new int[]{9, 3, 9, 3, 9, 0, 9}, 1));
    }
}
