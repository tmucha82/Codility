package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class GenomicRangeQueryTest {

    private GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();

    @Test
    public void testSolution() throws Exception {
        Assert.assertArrayEquals(new int[]{2, 4, 1}, genomicRangeQuery.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}));
    }
}