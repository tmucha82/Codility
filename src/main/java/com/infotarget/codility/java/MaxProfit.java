package com.infotarget.codility.java;

/**
 * A zero-indexed array A consisting of N integers is given. It contains daily prices of a stock share for a period of N consecutive days. If a single share was bought on day P and sold on day Q, where 0 ≤ P ≤ Q < N, then the profit of such transaction is equal to A[Q] − A[P], provided that A[Q] ≥ A[P]. Otherwise, the transaction brings loss of A[P] − A[Q].
 * <p>
 * For example, consider the following array A consisting of six elements such that:
 * <p>
 * A[0] = 23171
 * A[1] = 21011
 * A[2] = 21123
 * A[3] = 21366
 * A[4] = 21013
 * A[5] = 21367
 * If a share was bought on day 0 and sold on day 2, a loss of 2048 would occur because A[2] − A[0] = 21123 − 23171 = −2048. If a share was bought on day 4 and sold on day 5, a profit of 354 would occur because A[5] − A[4] = 21367 − 21013 = 354. Maximum possible profit was 356. It would occur if a share was bought on day 1 and sold on day 5.
 * <p>
 * Write a function,
 * <p>
 * class Solution { public int solution(int[] A); }
 * that, given a zero-indexed array A consisting of N integers containing daily prices of a stock share for a period of N consecutive days, returns the maximum possible profit from one transaction during this period. The function should return 0 if it was impossible to gain any profit.
 * <p>
 * For example, given array A consisting of six elements such that:
 * <p>
 * A[0] = 23171
 * A[1] = 21011
 * A[2] = 21123
 * A[3] = 21366
 * A[4] = 21013
 * A[5] = 21367
 * the function should return 356, as explained above.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [0..400,000];
 * each element of array A is an integer within the range [0..200,000].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class MaxProfit {
    public int solution1(int[] A) {
        int maxProfit = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                maxProfit = Math.max(maxProfit, A[j] - A[i]);
            }
        }
        return maxProfit;
    }

    public int solution2(int[] A) {
        int maxEnding = 0;
        int maxSlice = 0;
        for (int i = 1; i < A.length; i++) {
            maxEnding = Math.max(0, maxEnding + (A[i] - A[i - 1]));
            maxSlice = Math.max(maxSlice, maxEnding);
        }
        return maxSlice;
    }
}
