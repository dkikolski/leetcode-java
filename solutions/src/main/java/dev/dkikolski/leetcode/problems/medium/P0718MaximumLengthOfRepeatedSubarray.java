package dev.dkikolski.leetcode.problems.medium;

import dev.dkikolski.leetcode.annotations.DynamicProgramming;
import dev.dkikolski.leetcode.annotations.Medium;
import dev.dkikolski.leetcode.annotations.SlidingWindow;

@DynamicProgramming
@SlidingWindow
@Medium
public class P0718MaximumLengthOfRepeatedSubarray {

    /*
     nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]

     dp =   [ 0 , 0 , 3 , 0 , 0 , 0 ]
            [ 0 , 1 , 0 , 2 , 0 , 0 ]
            [ 1 , 0 , 0 , 0 , 1 , 0 ]
            [ 0 , 0 , 0 , 0 , 0 , 0 ]
            [ 0 , 0 , 0 , 0 , 0 , 0 ]
            [ 0 , 0 , 0 , 0 , 0 , 0 ]
     */

    public static int findLengthDp(int[] a, int[] b) {
        int maxLen = 0;
        final int[][] dp = new int[a.length + 1][b.length + 1];
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = b.length - 1; j >= 0; j--) {
                if (a[i] == b[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                    maxLen = Math.max(dp[i][j], maxLen);
                }
            }
        }
        return maxLen;
    }

    public static int findLengthSlidingWindow(int[] a, int[] b) {
        final int alen = a.length;
        final int blen = b.length;
        int maxLen = 0;
        for (int i = blen + alen - 1; i >= 0; i--) {
            var ai = Math.max(i - blen, 0);
            var bi = Math.max(blen - i, 0);
            var currentMax = 0;
            while (bi < blen && ai < alen) {
                if (a[ai] == b[bi]) {
                    maxLen = Math.max(++currentMax, maxLen);
                }  else {
                    currentMax = 0;
                }
                ai++;
                bi++;
            }
        }
        return maxLen;
    }
}
