package com.infotarget.codility.java;

/**
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.
 * <p>
 * For example, given:
 * <p>
 * A[0] = 1
 * A[1] = 3
 * A[2] = 6
 * A[3] = 4
 * A[4] = 1
 * A[5] = 2
 * the function should return 5.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class MissingInteger {
    public int solution(int[] A) {
        boolean[] occurrences = new boolean[A.length];
        for (int element : A) {
            occurrences[element - 1] = true;
        }
        for (int i = 0; i < occurrences.length; i++) {
            if (!occurrences[i])
                return i + 1;
        }
        throw new IllegalStateException("There is no missing integer");
    }
}
