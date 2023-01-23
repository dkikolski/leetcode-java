package dev.dkikolski.leetcode.problems.medium;

import dev.dkikolski.leetcode.annotations.Medium;
import dev.dkikolski.leetcode.annotations.PrefixSum;
import dev.dkikolski.leetcode.annotations.SlidingWindow;

import java.util.HashMap;

@SlidingWindow
@PrefixSum
@Medium
public class P0930BinarySubarraysWithSum {

    public static int numSubarraysWithSumUsingSlidingWindow(int[] nums, int goal) {
        int numOfSubarrays = 0;
        int currentSum = 0;
        int left = 0;
        int right = 0;

        while (left < nums.length && right < nums.length) {
            currentSum += nums[right];
            if (currentSum < goal) {
                right++;
            } else if (currentSum > goal) {
                left++;
                right = left;
                currentSum = 0;
            } else {
                numOfSubarrays++;
                right++;
                if (right == nums.length) {
                    left++;
                    right = left;
                    currentSum = 0;
                }
            }
        }

        return numOfSubarrays;
    }

    public static int numSubarraysWithPrefixSums(int[] nums, int goal) {
        final int[] prefixSums = new int[nums.length + 1];
        for (int i = 1; i < prefixSums.length; i++) {
            prefixSums[i] = prefixSums[i - 1] + nums[i - 1];
        }
        int result = 0;
        final var seen = new HashMap<Integer, Integer>();
        for (int ps : prefixSums) {
            result += seen.getOrDefault(ps, 0);
            seen.put(ps + goal, seen.getOrDefault(ps + goal, 0) + 1);
        }
        return result;
    }
}
