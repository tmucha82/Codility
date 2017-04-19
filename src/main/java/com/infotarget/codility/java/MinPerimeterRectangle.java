package com.infotarget.codility.java;

/**
 * An integer N is given, representing the area of some rectangle.
 * <p>
 * The area of a rectangle whose sides are of length A and B is A * B, and the perimeter is 2 * (A + B).
 * <p>
 * The goal is to find the minimal perimeter of any rectangle whose area equals N. The sides of this rectangle should be only integers.
 * <p>
 * For example, given integer N = 30, rectangles of area 30 are:
 * <p>
 * (1, 30), with a perimeter of 62,
 * (2, 15), with a perimeter of 34,
 * (3, 10), with a perimeter of 26,
 * (5, 6), with a perimeter of 22.
 * Write a function:
 * <p>
 * class Solution { public int solution(int N); }
 * that, given an integer N, returns the minimal perimeter of any rectangle whose area is exactly equal to N.
 * <p>
 * For example, given an integer N = 30, the function should return 22, as explained above.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..1,000,000,000].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(sqrt(N));
 * expected worst-case space complexity is O(1).
 */
public class MinPerimeterRectangle {

    public int solution(int N) {
        int minPerimeter = Integer.MAX_VALUE;

        int A = 1;
        while (A * A < N) {
            if (N % A == 0) {
                minPerimeter = Math.min(2 * (A + (N / A)), minPerimeter);
            }
            A++;
        }
        if (A * A == N) {
            minPerimeter = Math.min(4 * A, minPerimeter);
        }
        return minPerimeter;
    }
}
