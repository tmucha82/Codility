package com.infotarget.codility.java;

import java.util.stream.IntStream;

/**
 * Write a function
 * <p>
 * int solution(int A[], int N);
 * that, given a zero-indexed array A consisting of N integers, returns the number of distinct values in array A.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 * For example, given array A consisting of six elements such that:
 * <p>
 * A[0] = 2    A[1] = 1    A[2] = 1
 * A[3] = 2    A[4] = 3    A[5] = 1
 * the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
 * <p>
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N*log(N));
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class Distinct {
    int solution1(int A[], int N) {
        return (int) IntStream.of(A).limit(N).distinct().count();
    }

    int solution2(int A[], int N) {
        int[] counter = new int[N];
        for (int i = 0; i < N; i++) {
            counter[A[i]] = 1;
        }
        return (int) IntStream.of(counter).filter(i -> i == 1).count();
    }
}

