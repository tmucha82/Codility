package com.infotarget.codility.java;

import java.util.*;

/**
 * The Fibonacci sequence is defined using the following recursive formula:
 * <p/>
 * F(0) = 0
 * F(1) = 1
 * F(M) = F(M - 1) + F(M - 2) if M >= 2
 * A small frog wants to get to the other side of a river. The frog is initially located at one bank of the river (position −1) and wants to get to the other bank (position N). The frog can jump over any distance F(K), where F(K) is the K-th Fibonacci number. Luckily, there are many leaves on the river, and the frog can jump between the leaves, but only in the direction of the bank at position N.
 * <p/>
 * The leaves on the river are represented in a zero-indexed array A consisting of N integers. Consecutive elements of array A represent consecutive positions from 0 to N − 1 on the river. Array A contains only 0s and/or 1s:
 * <p/>
 * 0 represents a position without a leaf;
 * 1 represents a position containing a leaf.
 * The goal is to count the minimum number of jumps in which the frog can get to the other side of the river (from position −1 to position N). The frog can jump between positions −1 and N (the banks of the river) and every position containing a leaf.
 * <p/>
 * For example, consider array A such that:
 * <p/>
 * A[0] = 0
 * A[1] = 0
 * A[2] = 0
 * A[3] = 1
 * A[4] = 1
 * A[5] = 0
 * A[6] = 1
 * A[7] = 0
 * A[8] = 0
 * A[9] = 0
 * A[10] = 0
 * The frog can make three jumps of length F(5) = 5, F(3) = 2 and F(5) = 5.
 * <p/>
 * Write a function:
 * <p/>
 * class Solution { public int solution(int[] A); }
 * that, given a zero-indexed array A consisting of N integers, returns the minimum number of jumps by which the frog can get to the other side of the river. If the frog cannot reach the other side of the river, the function should return −1.
 * <p/>
 * For example, given:
 * <p/>
 * A[0] = 0
 * A[1] = 0
 * A[2] = 0
 * A[3] = 1
 * A[4] = 1
 * A[5] = 0
 * A[6] = 1
 * A[7] = 0
 * A[8] = 0
 * A[9] = 0
 * A[10] = 0
 * the function should return 3, as explained above.
 * <p/>
 * Assume that:
 * <p/>
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer that can have one of the following values: 0, 1.
 * Complexity:
 * <p/>
 * expected worst-case time complexity is O(N*log(N));
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class FibFrog {
    class Point {
        int position;
        int counter;

        public Point(int position, int counter) {
            this.position = position;
            this.counter = counter;
        }
    }

    public int solution(int[] A) {
        Integer[] fibonacci = generateFibonacci(A.length);

        Queue<Point> queue = new LinkedList<>(Collections.singletonList(new Point(-1, 0)));
        while (!queue.isEmpty()) {
            Point currentPosition = queue.remove();
            for (Integer fib : fibonacci) {
                Point next = new Point(currentPosition.position + fib, currentPosition.counter + 1);
                if (next.position == A.length) {
                    return next.counter;
                } else if (next.position < A.length && A[next.position] == 1) {
                    queue.add(next);
                    A[next.position] = 0;
                }
            }
        }
        return -1;

    }

    private Integer[] generateFibonacci(int N) {
        List<Integer> fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add(1);
        fibonacciSequence.add(1);
        for (int i = 2; i < N; i++) {
            int value = fibonacciSequence.get(i - 1) + fibonacciSequence.get(i - 2);
            if (value > N) {
                break;
            }
            fibonacciSequence.add(value);
        }
        Collections.reverse(fibonacciSequence);
        return fibonacciSequence.toArray(new Integer[fibonacciSequence.size()]);
    }
}
