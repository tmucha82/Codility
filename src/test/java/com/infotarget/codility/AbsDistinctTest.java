package com.infotarget.codility;

import org.junit.Assert;
import org.junit.Test;

public class AbsDistinctTest {

    AbsDistinct absDistinct = new AbsDistinct();

    @Test
    public void testSimpleCase() {
        Assert.assertEquals(5, absDistinct.solution(new int[]{-5, -3, -1, 0, 3, 6}));
        Assert.assertEquals(4, absDistinct.solution(new int[]{-5, -4, -4, -4, 0, 1, 1, 1, 4}));
        Assert.assertEquals(1, absDistinct.solution(new int[]{2, 2, 2, 2, 2}));
        Assert.assertEquals(2, absDistinct.solution(new int[]{-2147483648, 2147483647}));
        Assert.assertEquals(1, absDistinct.solution(new int[]{-2147483647, 2147483647}));
        Assert.assertEquals(0, absDistinct.solution(null));
        Assert.assertEquals(0, absDistinct.solution(new int[]{}));
    }
}