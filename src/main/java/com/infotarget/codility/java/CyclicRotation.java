package com.infotarget.codility.java;

import java.util.stream.IntStream;

/**
 * A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element
 * is shifted right by one index, and the last element of the array is also moved to the first place.
 * <p>
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7].
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int[] solution(int[] A, int K); }
 * that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.
 * <p>
 * For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].
 * <p>
 * Assume that:
 * <p>
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
public class CyclicRotation {
    public int[] solution1(int[] A, int K) {
        int[] result = new int[A.length];
        for (int i = 0; i < result.length; i++) {
            result[(i + K) % result.length] = A[i];
        }
        return result;

    }

    public int[] solution2(int[] A, int K) {
        int[] result = new int[A.length];
        IntStream.range(0, A.length).forEachOrdered(i -> result[(i + K) % A.length] = A[i]);
        return result;
    }
}
