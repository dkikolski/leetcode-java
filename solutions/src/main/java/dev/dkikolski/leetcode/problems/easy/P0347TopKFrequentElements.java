package dev.dkikolski.leetcode.problems.easy;

import java.util.*;
import java.util.stream.Collectors;

public class P0347TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        final Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0 ) + 1);
        }
        final var numbers = count.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).map(Map.Entry::getKey).toList();
        final var numbersLen = numbers.size();
        final int[] result = new int[k];
        for (int i =0 ;i < k; i++) {
            result[i] = numbers.get(numbersLen - 1 - i);
        }
        return result;
    }

}
