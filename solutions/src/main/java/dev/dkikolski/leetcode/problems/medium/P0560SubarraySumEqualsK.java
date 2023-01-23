package dev.dkikolski.leetcode.problems.medium;

import dev.dkikolski.leetcode.annotations.Medium;
import dev.dkikolski.leetcode.annotations.PrefixSum;

import java.util.HashMap;

@PrefixSum
@Medium
public class P0560SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        final int[] prefixSum = new int[nums.length + 1];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        final var count = new HashMap<Integer, Integer>();
        var result = 0;
        for (int ps : prefixSum) {
            if (count.containsKey(ps - k)) {
                result += count.get(ps - k);
            }
            count.put(ps, count.getOrDefault(ps, 0 ) + 1);
        }
        return result;
    }
}
