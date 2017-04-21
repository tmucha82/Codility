package com.infotarget.codility.java;

/**
 * A prime is a positive integer X that has exactly two distinct divisors: 1 and X. The first few prime integers are 2, 3, 5, 7, 11 and 13.
 * <p>
 * A prime D is called a prime divisor of a positive integer P if there exists a positive integer K such that D * K = P. For example, 2 and 5 are prime divisors of 20.
 * <p>
 * You are given two positive integers N and M. The goal is to check whether the sets of prime divisors of integers N and M are exactly the same.
 * <p>
 * For example, given:
 * <p>
 * N = 15 and M = 75, the prime divisors are the same: {3, 5};
 * N = 10 and M = 30, the prime divisors aren't the same: {2, 5} is not equal to {2, 3, 5};
 * N = 9 and M = 5, the prime divisors aren't the same: {3} is not equal to {5}.
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A, int[] B); }
 * that, given two non-empty zero-indexed arrays A and B of Z integers, returns the number of positions K for which the prime divisors of A[K] and B[K] are exactly the same.
 * <p>
 * For example, given:
 * <p>
 * A[0] = 15   B[0] = 75
 * A[1] = 10   B[1] = 30
 * A[2] = 3    B[2] = 5
 * the function should return 1, because only one pair (15, 75) has the same set of prime divisors.
 * <p>
 * Assume that:
 * <p>
 * Z is an integer within the range [1..6,000];
 * each element of arrays A, B is an integer within the range [1..2,147,483,647].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(Z*log(max(A)+max(B))2);
 * expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class CommonPrimeDivisors {

    public int solution(int[] A, int[] B) {
        //1 - when a and b have same gcd, then they have one minimum prime in common
        //2 - to test other primes, you divide them using their gcd until another prime appear
        // and leave a remainder in a or b which cause it a!=1 or b!=1 // this is what
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (checkSamePrimeDivisor(A[i], B[i])) {
                result++;
            }
        }
        return result;
    }

    boolean checkSamePrimeDivisor(int A, int B) {
        int D = gcd(A, B);
        return reduce(A, D) == 1 && reduce(B, D) == 1;
    }

    int reduce(int A, int gcd) {
        int c = 0;
        while (c != 1) {
            c = gcd(A, gcd);
            A /= c;
        }
        return A;
    }

    int gcd(int A, int B) {
        if (A % B == 0) {
            return B;
        } else {
            return gcd(B, A % B);
        }
    }

}
