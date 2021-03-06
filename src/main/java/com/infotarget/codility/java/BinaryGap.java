package com.infotarget.codility.java;

import java.util.stream.Stream;

/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros
 * that is surrounded by ones at both ends in the binary representation of N.
 * <p>
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
 * The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
 * The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution1(int N); }
 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
 * <p>
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..2,147,483,647].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(log(N));
 * expected worst-case space complexity is O(1).
 */
public class BinaryGap {

    public int solution1(int N) {
        return Stream.of(Integer.toBinaryString(N).replaceAll("0+$", "").split("1+")).
                map(String::length).
                max(Integer::compare).
                orElse(0);
    }

    public int solution2(int N) {
        char[] bits = Integer.toBinaryString(N).toCharArray();
        int maxGap = 0;
        int currentCounter = 0;
        for (char bit : bits) {
            if ('1' == bit) {
                if (maxGap < currentCounter) {
                    maxGap = currentCounter;
                }
                currentCounter = 0;
            } else {
                currentCounter++;
            }
        }
        return maxGap;
    }

    int solution3(int n) {
        while (n % 2 == 0) {
            n /= 2;
        }
        return solutionLoop(n, 0, 0);
    }

    int solutionLoop(int n, int max, int current) {
        if (n == 0)
            return max;
        else if (n % 2 == 0)
            return solutionLoop(n / 2, max, current + 1);
        else
            return solutionLoop(n / 2, Math.max(max, current), 0);
    }

}
