package com.infotarget.codility.java;

import scala.Int;

import java.util.stream.IntStream;

/**
 * A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.
 * <p>
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 * <p>
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 * <p>
 * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
 * <p>
 * For example, consider array A such that:
 * <p>
 * A[0] = 3
 * A[1] = 1
 * A[2] = 2
 * A[3] = 4
 * A[4] = 3
 * We can split this tape in four places:
 * <p>
 * P = 1, difference = |3 − 10| = 7
 * P = 2, difference = |4 − 9| = 5
 * P = 3, difference = |6 − 7| = 1
 * P = 4, difference = |10 − 3| = 7
 * Write a function:
 * <p>
 * class Solution { public int solution1(int[] A); }
 * that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.
 * <p>
 * For example, given:
 * <p>
 * A[0] = 3
 * A[1] = 1
 * A[2] = 2
 * A[3] = 4
 * A[4] = 3
 * the function should return 1, as explained above.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class TapeEquilibrium {

    public int solution1(int[] A) {
        int diff = 0;
        int tailIndex = A.length - 1;
        int tailSum = A[tailIndex];
        int headIndex = 0;
        int headSum = A[headIndex];
        while (headIndex + 1 != tailIndex) {
            diff = tailSum - headSum;
            if (diff < 0) {
                tailIndex--;
                tailSum += A[tailIndex];
            } else if (diff > 0) {
                headIndex++;
                headSum += A[headIndex];
            } else {
                headIndex++;
                tailIndex--;
                tailSum += A[tailIndex];
                headSum += A[headIndex];
            }
        }
        return Math.abs(tailSum - headSum);
    }

    public int solution2(int[] A) {
        // A[0] + ... +A[P-1] - A[P] - ... - A[N-1] ==
        //SUM - 2 * A[P] - ... - 2 * A[N-1]
        int diff = IntStream.of(A).sum();
        int minDiff = Int.MaxValue();
        for (int element : A) {
            diff -= 2 * element;
            minDiff = Math.min(minDiff, Math.abs(diff));
        }
        return minDiff;
    }
}
