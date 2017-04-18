package com.infotarget.codility.java;

import java.util.Stack;

/**
 * A non-empty zero-indexed array A consisting of N integers is given.
 * <p>
 * The leader of this array is the value that occurs in more than half of the elements of A.
 * <p>
 * An equi leader is an index S such that 0 ≤ S < N − 1 and two sequences A[0], A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N − 1] have leaders of the same value.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 4
 * A[1] = 3
 * A[2] = 4
 * A[3] = 4
 * A[4] = 4
 * A[5] = 2
 * we can find two equi leaders:
 * <p>
 * 0, because sequences: (4) and (3, 4, 4, 4, 2) have the same leader, whose value is 4.
 * 2, because sequences: (4, 3, 4) and (4, 4, 2) have the same leader, whose value is 4.
 * The goal is to count the number of equi leaders.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * that, given a non-empty zero-indexed array A consisting of N integers, returns the number of equi leaders.
 * <p>
 * For example, given:
 * <p>
 * A[0] = 4
 * A[1] = 3
 * A[2] = 4
 * A[3] = 4
 * A[4] = 4
 * A[5] = 2
 * the function should return 2, as explained above.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class EquiLeader {

    class Pair {
        int left;
        int right;

        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    public int solution(int[] A) {
        Pair leader = leader(A);
        if (leader.left == -1) {
            return 0;
        }

        int counterLeft = 0;
        int counterRight = leader.right;
        int counterEquiLeader = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader.left) {
                counterLeft++;
                counterRight--;
            }
            if (counterLeft > (i + 1) / 2 && counterRight > (A.length - (1 + i)) / 2) {
                counterEquiLeader++;
            }
        }
        return counterEquiLeader;
    }

    private Pair leader(int[] A) {
        int leader = -1;
        Stack<Integer> stack = new Stack<>();
        for (Integer element : A) {
            if (stack.empty() || stack.peek().intValue() == element) {
                stack.push(element);
            } else {
                stack.pop();
            }
        }
        int counter = 0;
        if (!stack.empty()) {
            int candidate = stack.pop();

            for (Integer element : A) {
                if (element == candidate) {
                    counter++;
                }
            }
            if (counter > A.length / 2) {
                leader = candidate;
            }

        }
        return new Pair(leader, counter);
    }
}
