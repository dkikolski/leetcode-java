package dev.dkikolski.leetcode.problems.easy;

import java.util.Arrays;

public class P0268MissingNumber {

    public static int missingNumber(int[] nums) {
        var result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result ^= i ^ nums[i];
        }
        return result;
    }
}
