package com.infotarget.codility.java;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Task description
 * A non-empty zero-indexed array A consisting of N numbers is given. The array is sorted in non-decreasing order.
 * The absolute distinct count of this array is the number of distinct absolute values among the elements of the array.
 * For example, consider array A such that:
 * A[0] = -5
 * A[1] = -3
 * A[2] = -1
 * A[3] =  0
 * A[4] =  3
 * A[5] =  6
 * The absolute distinct count of this array is 5, because there are 5 distinct absolute values among the elements of this array, namely 0, 1, 3, 5 and 6.
 * Write a function:
 * class Solution { public int solution1(int[] A); }
 * that, given a non-empty zero-indexed array A consisting of N numbers, returns absolute distinct count of array A.
 * For example, given array A such that:
 * A[0] = -5
 * A[1] = -3
 * A[2] = -1
 * A[3] =  0
 * A[4] =  3
 * A[5] =  6
 * the function should return 5, as explained above.
 * Assume that:
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647];
 * array A is sorted in non-decreasing order.
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 */
public class AbsDistinct {

    public int solution1(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int headIndex = 0;
        int tailIndex = A.length - 1;
        int result = 0;

        //we can't handle abs(-2147483648). Since the max value for int is
        //2147483647, abs(-2147483648) becomes -2147483648 - sic!!
        if (A[headIndex] == -2147483648) {
            result++;
            while (headIndex < A.length && A[headIndex] == -2147483648) {
                headIndex++;
            }
        }

        while (headIndex <= tailIndex) {
            int head = Math.abs(A[headIndex]);
            int tail = Math.abs(A[tailIndex]);

            if (head < tail) {
                while (tailIndex > 0 && tail == Math.abs(A[tailIndex])) {
                    tailIndex--;
                }
            } else if (head > tail) {
                while (headIndex < A.length && head == Math.abs(A[headIndex])) {
                    headIndex++;
                }
            } else {
                while (tailIndex > 0 && tail == Math.abs(A[tailIndex])) {
                    tailIndex--;
                }
                while (headIndex < A.length && head == Math.abs(A[headIndex])) {
                    headIndex++;
                }
            }
            result++;
        }
        return result;
    }

    public int solution2(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int element : A) {
            set.add(Math.abs(element));
        }
        return set.size();
    }

    public int solution3(int [] A) {
        return (int) IntStream.of(A).map(Math::abs).distinct().count();
    }
}
