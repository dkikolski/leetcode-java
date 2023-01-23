package dev.dkikolski.leetcode.problems.medium;

import dev.dkikolski.leetcode.annotations.Medium;
import dev.dkikolski.leetcode.annotations.PrefixSum;

@PrefixSum
@Medium
public class P0238ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        final int nlen = nums.length;
        final int[] lefts = new int[nlen];
        final int[] rights = new int[nlen];
        final int[] result = new int[nlen];
        lefts[0] = 1;
        rights[nlen - 1] = 1;
        for (int i = 1; i < nlen; i++) {
            lefts[i] = lefts[i -1] * nums[i - 1];
        }
        for (int i = nlen - 2; i >= 0; i--) {
            rights[i] = rights[i+ 1] * nums[i + 1];
        }
        for (int i = 0; i < nlen; i++) {
            result[i] = lefts[i] * rights [i];
        }
        return result;
    }
}
