package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.annotations.Easy;

import java.util.HashMap;
import java.util.Map;

@Easy
public class P0169MajorityElement {
    public static int majorityElementUsingHashmap(final int[] nums) {
        final var map = new HashMap<Integer, Integer>();

        for (int n : nums) {
            final var count = map.containsKey(n) ? map.get(n) + 1 : 1;
            map.put(n, count);
        }

        Map.Entry<Integer, Integer> majorityEntry = null;

        for (var entry : map.entrySet()) {
            if (majorityEntry == null || majorityEntry.getValue() < entry.getValue()) {
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();
    }

    public static int majorityElementUsingBoyerMooreVotingAlgo(final int[] nums) {
        int majorityElement = 0;
        int count = 0;

        for (final int n : nums) {
            if (count == 0) {
                majorityElement = n;
            }
            count += majorityElement == n ? 1 : -1;
        }
        return majorityElement;
    }
}
