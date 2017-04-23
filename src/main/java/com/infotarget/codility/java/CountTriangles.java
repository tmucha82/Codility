package com.infotarget.codility.java;

import java.util.Arrays;

/**
 * A zero-indexed array A consisting of N integers is given. A triplet (P, Q, R) is triangular if it is possible to build a triangle with sides of lengths A[P], A[Q] and A[R]. In other words, triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
 * <p/>
 * A[P] + A[Q] > A[R],
 * A[Q] + A[R] > A[P],
 * A[R] + A[P] > A[Q].
 * For example, consider array A such that:
 * <p/>
 * A[0] = 10    A[1] = 2    A[2] = 5
 * A[3] = 1     A[4] = 8    A[5] = 12
 * There are four triangular triplets that can be constructed from elements of this array, namely (0, 2, 4), (0, 2, 5), (0, 4, 5), and (2, 4, 5).
 * <p/>
 * Write a function:
 * <p/>
 * class Solution { public int solution(int[] A); }
 * that, given a zero-indexed array A consisting of N integers, returns the number of triangular triplets in this array.
 * <p/>
 * For example, given array A such that:
 * <p/>
 * A[0] = 10    A[1] = 2    A[2] = 5
 * A[3] = 1     A[4] = 8    A[5] = 12
 * the function should return 4, as explained above.
 * <p/>
 * Assume that:
 * <p/>
 * N is an integer within the range [0..1,000];
 * each element of array A is an integer within the range [1..1,000,000,000].
 * Complexity:
 * <p/>
 * expected worst-case time complexity is O(N2);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class CountTriangles {

    public int solution(int[] A) {
        Arrays.sort(A);
        int counter = 0;
        for (int i = 0; i < A.length - 2; i++) {
            int left = i + 1;
            int right = i + 2;

            while (left < A.length - 1) {
                if (right < A.length && A[i] + A[left] > A[right]) {
                    right++;
                } else {
                    counter += (right - left - 1);
                    left++;
                }
            }
        }
        return counter;
    }
}
