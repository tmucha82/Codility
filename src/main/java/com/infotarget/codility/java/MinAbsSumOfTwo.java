package com.infotarget.codility.java;


import java.util.Arrays;

/**
 * Let A be a non-empty zero-indexed array consisting of N integers.
 * <p/>
 * The abs sum of two for a pair of indices (P, Q) is the absolute value |A[P] + A[Q]|, for 0 ≤ P ≤ Q < N.
 * <p/>
 * For example, the following array A:
 * <p/>
 * A[0] =  1
 * A[1] =  4
 * A[2] = -3
 * has pairs of indices (0, 0), (0, 1), (0, 2), (1, 1), (1, 2), (2, 2).
 * The abs sum of two for the pair (0, 0) is A[0] + A[0] = |1 + 1| = 2.
 * The abs sum of two for the pair (0, 1) is A[0] + A[1] = |1 + 4| = 5.
 * The abs sum of two for the pair (0, 2) is A[0] + A[2] = |1 + (−3)| = 2.
 * The abs sum of two for the pair (1, 1) is A[1] + A[1] = |4 + 4| = 8.
 * The abs sum of two for the pair (1, 2) is A[1] + A[2] = |4 + (−3)| = 1.
 * The abs sum of two for the pair (2, 2) is A[2] + A[2] = |(−3) + (−3)| = 6.
 * Write a function:
 * <p/>
 * class Solution { public int solution(int[] A); }
 * that, given a non-empty zero-indexed array A consisting of N integers, returns the minimal abs sum of two for any pair of indices in this array.
 * <p/>
 * For example, given the following array A:
 * <p/>
 * A[0] =  1
 * A[1] =  4
 * A[2] = -3
 * the function should return 1, as explained above.
 * <p/>
 * Given array A:
 * <p/>
 * A[0] = -8
 * A[1] =  4
 * A[2] =  5
 * A[3] =-10
 * A[4] =  3
 * the function should return |(−8) + 5| = 3.
 * <p/>
 * Assume that:
 * <p/>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].
 * Complexity:
 * <p/>
 * expected worst-case time complexity is O(N*log(N));
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class MinAbsSumOfTwo {

    public int solution1(int[] A) {
        Arrays.sort(A);
        int result = Math.abs(A[0] + A[A.length - 1]);
        for (int i = 0, j = A.length - 1; i < j && result > 0; result = Math.min(result, Math.abs(A[i] + A[j]))) {
            System.out.println("A[i] = " + A[i]);
            System.out.println("A[j] = " + A[j]);
            if (-A[i] > A[j]) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }

    public int solution2(int[] A) {
        int minSlice = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                int sum = Math.abs(sumOfSlice(A, i, j));
                minSlice = Math.min(sum, minSlice);
            }
        }
        return minSlice;
    }


    private int sumOfSlice(int[] A, int i, int j) {
        return A[i] + A[j];
    }
}
