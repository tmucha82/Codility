package com.infotarget.codility.java;

import java.util.stream.IntStream;

/**
 * For a given array A of N integers and a sequence S of N integers from the set {−1, 1}, we define val(A, S) as follows:
 * <p>
 * val(A, S) = |sum{ A[i]*S[i] for i = 0..N−1 }|
 * (Assume that the sum of zero elements equals zero.)
 * <p>
 * For a given array A, we are looking for such a sequence S that minimizes val(A,S).
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * that, given an array A of N integers, computes the minimum value of val(A,S) from all possible values of val(A,S) for all possible sequences S of N integers from the set {−1, 1}.
 * <p>
 * For example, given array:
 * <p>
 * A[0] =  1
 * A[1] =  5
 * A[2] =  2
 * A[3] = -2
 * your function should return 0, since for S = [−1, 1, −1, 1], val(A, S) = 0, which is the minimum possible value.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [0..20,000];
 * each element of array A is an integer within the range [−100..100].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N*max(abs(A))2);
 * expected worst-case space complexity is O(N+sum(abs(A))), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class MinAbsSum {

    public int solution(int[] A) {
        //Since we can arbitrarily choose to take the element or its negative, we can simplify the
        // problem and replace each number with its absolute value
        A = IntStream.of(A).map(Math::abs).toArray();
        int M = IntStream.of(A).max().getAsInt();
        int S = IntStream.of(A).sum();

        boolean[] dp = new boolean[S + 1];
        dp[0] = true;
        for (int a : A) {
            for (int i = S; i >= 0; i--) {
                if (dp[i] && (i + a) <= S) {
                    dp[i + a] = true;
                }
            }
        }

        int result = S;
        for (int i = 0; i < (0.5 * S + 1); i++) {
            if (dp[i]) {
                result = Math.min(result, S - 2 * i);
            }
        }
        return result;
    }
}
