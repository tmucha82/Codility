package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryGapTest {

    private BinaryGap binaryGap = new BinaryGap();

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(2, binaryGap.solution(9));
        Assert.assertEquals(4, binaryGap.solution(529));
        Assert.assertEquals(5, binaryGap.solution(1041));
        Assert.assertEquals(0, binaryGap.solution(15));
        Assert.assertEquals(0, binaryGap.solution(8));
    }
}