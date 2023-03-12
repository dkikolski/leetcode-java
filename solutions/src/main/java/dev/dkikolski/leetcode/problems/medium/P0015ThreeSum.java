package dev.dkikolski.leetcode.problems.medium;

import java.util.*;

public class P0015ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        var result = new LinkedList<List<Integer>>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (k > j) {
                var a = nums[i];
                var b = nums[j];
                var c = nums[k];
                var sum = a + b + c;
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    result.add(List.of(a, b, c));
                    j++;
                    while(nums[j] == nums[j - 1] && j < k) {
                        j++;
                    }
                }
            }
        }

        return result;
    }
}
