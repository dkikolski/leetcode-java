package dev.dkikolski.leetcode.problems.medium;

import dev.dkikolski.leetcode.annotations.Medium;
import dev.dkikolski.leetcode.annotations.SlidingWindow;

@SlidingWindow
@Medium
public class P0209MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int currentSum = 0;
        while (right < nums.length) {
            currentSum += nums[right];
            if (currentSum >= target) {
                while (currentSum >= target) {
                    currentSum -= nums[left];
                    minLen = Math.min(minLen , right - left + 1);
                    left++;
                }
            }
            right++;
        }

        if (minLen == Integer.MAX_VALUE) {
            return 0;
        }
        return minLen;
    }
}
