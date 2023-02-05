package dev.dkikolski.leetcode.problems.medium;

import java.util.HashSet;

public class P0128LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        final var visitedNums = new HashSet<>(nums.length);
        int max = 0;
        for (var n : nums) {
            visitedNums.add(n);
        }
        for (var n : nums) {
            if (!visitedNums.contains(n  - 1)) {
                var current = n;
                var currentMax = 1;
                while (visitedNums.contains(current + 1)) {
                    currentMax++;
                    current++;
                }
                max = Math.max(max, currentMax);
            }
        }
        return max;
    }
}
