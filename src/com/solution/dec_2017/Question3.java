package com.solution.dec_2017;

/**
 * An array is said to be hollow if it contains 3 or more zeroes in the middle that are preceded and followed
 * by the same number of non-zero elements. Write a function named isHollow that
 * accepts an integer array and returns 1 if it is a hollow array, otherwise it returns 0
 *
 * Examples:
 * isHollow({1,2,4,0,0,0,3,4,5}) returns 1.
 * isHollow ({1,2,0,0,0,3,4,5}) returns 0.
 * isHollow ({1,2,4,9, 0,0,0,3,4, 5}) returns 0.
 * isHollow ({1,2, 0,0, 3,4}) returns 0.
 *
 * If you are programming in Java or C#, the function signature is
 * int isHollow(int[ ] a).
 *
 * If you are C or C++ programmer
 * int isHollow(int[ ] a, int len)
 * where len is the number of elements in the array.
 */
public class Question3 {

    /**
     * if the size of array is odd, then we can have midpoint
     * @param a
     * @return
     */
    private static int midPointOfArray(int[] a) {
        return (a.length % 2) == 0 ? 0 : (a.length/2);
    }

    public static int isHollow(int[] a) {
        int midPoint = midPointOfArray(a);
        if(midPoint == 0) return 0;
        if(a[midPoint] != 0) return 0;
        if(a[midPoint-1] != 0 || a[midPoint+1] != 0) return 0;

        for (int i = midPoint-1, j = midPoint+1; i >= 0 && j < a.length; i--, j++) {
            if((a[i] == 0 && a[j] == 0) || (a[i] != 0 && a[j] != 0)) continue;
            return 0;
        }
        return 1;
    }
}
