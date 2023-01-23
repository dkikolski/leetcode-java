package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.annotations.SlidingWindow;

@SlidingWindow
public class P0643MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
        double max = 0.0;
        double sum = 0;
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (right < k) {
                sum += nums[right];
                max = sum;
            } else {
                sum = sum - nums[left] + nums[right];
                max = Math.max(max, sum);
                left++;
            }
            right++;
        }
        return max / k;
    }
}
