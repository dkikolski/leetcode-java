package dev.dkikolski.leetcode.problems.easy;

import java.util.HashSet;

public class P0217ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        final var set = new HashSet<Integer>();
        for (final int n : nums) {
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return false;
    }
}
