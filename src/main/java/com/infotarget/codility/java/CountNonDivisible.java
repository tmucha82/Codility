package com.infotarget.codility.java;

import java.util.stream.IntStream;

/**
 * You are given a non-empty zero-indexed array A consisting of N integers.
 * <p>
 * For each number A[i] such that 0 ≤ i < N, we want to count the number of elements of the array that are not the divisors of A[i]. We say that these elements are non-divisors.
 * <p>
 * For example, consider integer N = 5 and array A such that:
 * <p>
 * A[0] = 3
 * A[1] = 1
 * A[2] = 2
 * A[3] = 3
 * A[4] = 6
 * For the following elements:
 * <p>
 * A[0] = 3, the non-divisors are: 2, 6,
 * A[1] = 1, the non-divisors are: 3, 2, 3, 6,
 * A[2] = 2, the non-divisors are: 3, 3, 6,
 * A[3] = 3, the non-divisors are: 2, 6,
 * A[4] = 6, there aren't any non-divisors.
 * Write a function:
 * <p>
 * class Solution { public int[] solution(int[] A); }
 * that, given a non-empty zero-indexed array A consisting of N integers, returns a sequence of integers representing the amount of non-divisors.
 * <p>
 * The sequence should be returned as:
 * <p>
 * a structure Results (in C), or
 * a vector of integers (in C++), or
 * a record Results (in Pascal), or
 * an array of integers (in any other programming language).
 * For example, given:
 * <p>
 * A[0] = 3
 * A[1] = 1
 * A[2] = 2
 * A[3] = 3
 * A[4] = 6
 * the function should return [2, 4, 3, 2, 0], as explained above.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..50,000];
 * each element of array A is an integer within the range [1..2 * N].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N*log(N));
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class CountNonDivisible {

    public int[] solution1(int[] A) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int a : A) {
                if (A[i] % a != 0) {
                    sum++;
                }
            }
            result[i] = sum;
        }
        return result;
    }

    public int[] solution2(int[] A) {
        int N = A.length;
        int[] counts = new int[IntStream.of(A).max().getAsInt() + 1];

        // Calculate occurrences of each number in the array
        for (int a : A) {
            counts[a]++;
        }

        // Assume each number has 0 non dividers
        int[] answer = new int[N];

        // For each element of the array
        for (int i = 0; i < N; ++i) {
            // Calculate how many of its divisors are in the array
            int divisors = 0;
            for (int j = 1; j * j <= A[i]; ++j) {
                if (A[i] % j == 0) {
                    divisors += counts[j];
                    if (A[i] / j != j) {
                        divisors += counts[A[i] / j];
                    }
                }
            }

            // Subtract the number of divisors from the number of elements in the array
            answer[i] = N - divisors;
        }

        return answer;
    }


}
