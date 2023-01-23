package dev.dkikolski.leetcode.problems.easy;

import java.util.HashMap;

public class P0219ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        final var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                if (Math.abs(i - j) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
