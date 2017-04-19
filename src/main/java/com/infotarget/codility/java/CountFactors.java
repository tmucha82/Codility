package com.infotarget.codility.java;

/**
 * A positive integer D is a factor of a positive integer N if there exists an integer M such that N = D * M.
 * <p>
 * For example, 6 is a factor of 24, because M = 4 satisfies the above condition (24 = 6 * 4).
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int N); }
 * that, given a positive integer N, returns the number of its factors.
 * <p>
 * For example, given N = 24, the function should return 8, because 24 has 8 factors, namely 1, 2, 3, 4, 6, 8, 12, 24. There are no other factors of 24.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..2,147,483,647].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(sqrt(N));
 * expected worst-case space complexity is O(1).
 */
public class CountFactors {
    public int solution(int N) {
        int counter = 0;
        int i = 1;
        while (i * i < N) {
            if (N % i == 0) {
                counter += 2;
            }
            i++;
        }
        if (i * i == N) {
            counter++;
        }
        return counter;
    }
}
