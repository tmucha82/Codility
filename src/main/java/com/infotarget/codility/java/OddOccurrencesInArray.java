package com.infotarget.codility.java;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * A non-empty zero-indexed array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
 * <p>
 * For example, in array A such that:
 * <p>
 * A[0] = 9  A[1] = 3  A[2] = 9
 * A[3] = 3  A[4] = 9  A[5] = 7
 * A[6] = 9
 * the elements at indexes 0 and 2 have value 9,
 * the elements at indexes 1 and 3 have value 3,
 * the elements at indexes 4 and 6 have value 9,
 * the element at index 5 has value 7 and is unpaired.
 * Write a function:
 * <p>
 * int solution(int A[], int N);
 * that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 9  A[1] = 3  A[2] = 9
 * A[3] = 3  A[4] = 9  A[5] = 7
 * A[6] = 9
 * the function should return 7, as explained in the example above.
 * <p>
 * Assume that:
 * <p>
 * N is an odd integer within the range [1..1,000,000];
 * each element of array A is an integer within the range [1..1,000,000,000];
 * all but one of the values in A occur an even number of times.
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class OddOccurrencesInArray {

    /**
     * 1) XOR of any number n with itself gives us 0, i.e., n ^ n = 0
     * 2) XOR of any number n with 0 gives us n, i.e., n ^ 0 = n
     * 3) XOR is cumulative and associative.
     */
    public int solution1(int[] A, int N) {
        int result = 0;
        for (int i = 0; i < N; i++) {
            result ^= A[i];
        }
        return result;
    }

    // without XOR
    public int solution2(int[] A, int N) {
        Map<Integer, Long> mapWithCounters = Arrays.stream(A).boxed().limit(N).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return mapWithCounters.entrySet().stream().filter(integerLongEntry -> integerLongEntry.getValue() % 2 == 1).findFirst().get().getKey();
    }
}