package com.infotarget.codility.java;

import org.junit.Assert;
import org.junit.Test;

public class CountSemiprimesTest {

    private CountSemiprimes countSemiprimes = new CountSemiprimes();

    @Test
    public void testSolution() throws Exception {
        Assert.assertArrayEquals(new int[]{10, 4, 0}, countSemiprimes.solution(26, new int[]{1, 4, 16}, new int[]{26, 10, 20}));
    }

    @Test
    public void testFactorisationArray() {
        Assert.assertArrayEquals(new int[]{
                0, 0, 0, 0, 2, 0, 2, 0, 2, 3, 2, 0, 2, 0, 2, 3, 2, 0, 2, 0, 2, 3, 2, 0, 2, 5, 2
        }, countSemiprimes.factorizationArray(26));
    }

    @Test
    public void testIsPrime() {
        int[] F = countSemiprimes.factorizationArray(26);
        Assert.assertTrue(countSemiprimes.isPrime(2, F));
        Assert.assertTrue(countSemiprimes.isPrime(3, F));
        Assert.assertTrue(countSemiprimes.isPrime(5, F));
        Assert.assertTrue(countSemiprimes.isPrime(7, F));
        Assert.assertFalse(countSemiprimes.isPrime(4, F));
        Assert.assertFalse(countSemiprimes.isPrime(9, F));
        Assert.assertFalse(countSemiprimes.isPrime(25, F));
    }

    @Test
    public void testIsSemiPrime() {
        int[] F = countSemiprimes.factorizationArray(26);
        Assert.assertFalse(countSemiprimes.isSemiPrime(2, F));
        Assert.assertFalse(countSemiprimes.isSemiPrime(3, F));
        Assert.assertFalse(countSemiprimes.isSemiPrime(5, F));
        Assert.assertFalse(countSemiprimes.isSemiPrime(7, F));
        Assert.assertTrue(countSemiprimes.isSemiPrime(4, F));
        Assert.assertTrue(countSemiprimes.isSemiPrime(9, F));
        Assert.assertTrue(countSemiprimes.isSemiPrime(25, F));
        Assert.assertFalse(countSemiprimes.isSemiPrime(8, F));
        Assert.assertFalse(countSemiprimes.isSemiPrime(24, F));
        Assert.assertFalse(countSemiprimes.isSemiPrime(16, F));
    }

}