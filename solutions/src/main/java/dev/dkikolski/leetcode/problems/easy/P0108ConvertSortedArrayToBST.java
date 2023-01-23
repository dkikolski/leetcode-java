package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import dev.dkikolski.leetcode.annotations.Easy;

@Easy
class P0108ConvertSortedArrayToBST {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return arrayToBST(nums, 0, nums.length - 1);
    }

    private static TreeNode arrayToBST(final int[] a, final int start, final int end) {
        if (start > end) {
            return null;
        }
        final var mid = start + (end - start) / 2;
        final var n = new TreeNode(a[mid]);
        n.left = arrayToBST(a, start, mid - 1);
        n.right = arrayToBST(a, mid + 1, end);
        return n;
    }
}
