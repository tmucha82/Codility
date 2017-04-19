package com.infotarget.codility.java;

/**
 * A non-empty zero-indexed array A consisting of N integers is given.
 * <p/>
 * A peak is an array element which is larger than its neighbours. More precisely, it is an index P such that 0 < P < N − 1 and A[P − 1] < A[P] > A[P + 1].
 * <p/>
 * For example, the following array A:
 * <p/>
 * A[0] = 1
 * A[1] = 5
 * A[2] = 3
 * A[3] = 4
 * A[4] = 3
 * A[5] = 4
 * A[6] = 1
 * A[7] = 2
 * A[8] = 3
 * A[9] = 4
 * A[10] = 6
 * A[11] = 2
 * has exactly four peaks: elements 1, 3, 5 and 10.
 * <p/>
 * You are going on a trip to a range of mountains whose relative heights are represented by array A, as shown in a figure below. You have to choose how many flags you should take with you. The goal is to set the maximum number of flags on the peaks, according to certain rules.
 * <p/>
 * <p/>
 * <p/>
 * Flags can only be set on peaks. What's more, if you take K flags, then the distance between any two flags should be greater than or equal to K. The distance between indices P and Q is the absolute value |P − Q|.
 * <p/>
 * For example, given the mountain range represented by array A, above, with N = 12, if you take:
 * <p/>
 * two flags, you can set them on peaks 1 and 5;
 * three flags, you can set them on peaks 1, 5 and 10;
 * four flags, you can set only three flags, on peaks 1, 5 and 10.
 * You can therefore set a maximum of three flags in this case.
 * <p/>
 * Write a function:
 * <p/>
 * class Solution { public int solution(int[] A); }
 * that, given a non-empty zero-indexed array A of N integers, returns the maximum number of flags that can be set on the peaks of the array.
 * <p/>
 * For example, the following array A:
 * <p/>
 * A[0] = 1
 * A[1] = 5
 * A[2] = 3
 * A[3] = 4
 * A[4] = 3
 * A[5] = 4
 * A[6] = 1
 * A[7] = 2
 * A[8] = 3
 * A[9] = 4
 * A[10] = 6
 * A[11] = 2
 * the function should return 3, as explained above.
 * <p/>
 * Assume that:
 * <p/>
 * N is an integer within the range [1..400,000];
 * each element of array A is an integer within the range [0..1,000,000,000].
 * Complexity:
 * <p/>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class Flags {

    public int solution(int[] A) {
        boolean[] peaks = findPeaks(A);

        if (peaks.length < 2) {
            return peaks.length;
        }


        int min = 2;
        int max = (int) Math.floor(Math.sqrt(A.length));
        int result = 0;

        while (min <= max) {
            int K = (max + min) / 2;
            if (!check(A, K, peaks)) {
                //we failed to put K flags, then try to check a smaller value.
                max = K - 1;
            } else {
                //we succeed to put K flags, update the max_flags and try a larger value.
                min = K + 1;
                result = K;
            }
        }
        return result;
    }

    boolean[] findPeaks(int[] A) {
        boolean[] peaks = new boolean[A.length];
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                peaks[i] = true;
            }
        }
        return peaks;
    }

    boolean check(int[] A, int K, boolean[] peaks) {
        int pos = 0;
        int flags = K;
        while (pos < A.length && K > 0) {
            if (peaks[pos]) {
                flags--;
                if (flags == 0) {
                    return true;
                }
                pos += K;
            } else {
                pos++;
            }
        }
        return false;
    }
}
