package dev.dkikolski.leetcode.problems.medium;

import dev.dkikolski.leetcode.annotations.Medium;
import dev.dkikolski.leetcode.annotations.SlidingWindow;

import java.util.LinkedList;
import java.util.List;

@SlidingWindow
@Medium
public class P0658FindKClosestElements {

    public static List<Integer> findClosestElements(final int[] arr, final int k, final int x) {
        final LinkedList<Integer> list = new LinkedList<>();
        int left = 0;
        int right = arr.length -1;
        while (right - left >= k) {
            int a = arr[left];
            int b = arr[right];
            if (Math.abs(a - x) > Math.abs(b - x)) {
                left++;
            } else {
                right--;
            }
        }
        for (int i = left; i <= right; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
