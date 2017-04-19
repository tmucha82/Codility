package com.infotarget.codility.java;

import java.util.stream.IntStream;

/**
 * A non-empty zero-indexed array A consisting of N integers is given. A pair of integers (P, Q), such that 0 ≤ P ≤ Q < N, is called a slice of array A. The sum of a slice (P, Q) is the total of A[P] + A[P+1] + ... + A[Q].
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * that, given an array A consisting of N integers, returns the maximum sum of any slice of A.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 3  A[1] = 2  A[2] = -6
 * A[3] = 4  A[4] = 0
 * the function should return 5 because:
 * <p>
 * (3, 4) is a slice of A that has sum 4,
 * (2, 2) is a slice of A that has sum −6,
 * (0, 1) is a slice of A that has sum 5,
 * no other slice of A has sum greater than (0, 1).
 * Assume that:
 * <p>
 * N is an integer within the range [1..1,000,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000];
 * the result will be an integer within the range [−2,147,483,648..2,147,483,647].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class MaxSliceSum {

    int solution1(int[] A) {
        /**
         # starting array
         A = [5, -2, 10, 3, -25, 12, 6]
         # calculating the max slice in O(n), starting from A[1]
         # copy A into S, where the max slices are stored
         S = A[:]
         # instead of looping, I'll unroll the loop for simplicity
         # so, at S[1], we either add the previous sum, or start over
         # to decide that, we simply check the max between the element and the previous sum added
         S[1] = max(S[1], S[1] + S[0])
         # S = [5, 3, ...]
         S[2] = max(S[2], S[2] + S[1])
         # S = [5, 3, 13, ...]
         # S = [5, 3, 13, 16, ...]
         # S = [5, 3, 13, 16, -9, ...]
         # S = [5, 3, 13, 16, -9, 12, ...]
         # S = [5, 3, 13, 16, -9, 12, 18]
         # answer = max(S)
         */
        int[] S = new int[A.length];
        S[0] = A[0];
        for (int i = 1; i < S.length; i++) {
            S[i] = Math.max(A[i], A[i] + S[i - 1]);
        }
        return IntStream.of(S).max().getAsInt();
    }

    public int solution2(int[] A) {
        int maxEnding = 0;
        int maxSlice = 0;
        for (Integer a : A) {
            maxEnding = Math.max(0, maxEnding + a);
            maxSlice = Math.max(maxSlice, maxEnding);
        }
        return maxSlice;
    }
}
