package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import dev.dkikolski.leetcode.annotations.Easy;

import java.util.concurrent.atomic.AtomicBoolean;

@Easy
class P0110BalancedBinaryTree {

    public static boolean isBalanced(TreeNode root) {
        final var isBalanced = new AtomicBoolean(true);
        if (root == null) {
            return true;
        }
        isBalancedWithMaxDepth(root, isBalanced);
        return isBalanced.get();
    }

    private static int isBalancedWithMaxDepth(final TreeNode root, final AtomicBoolean isBalanced) {
        if (!isBalanced.get()) {
            return 0;
        }
        if (root == null) {
            return 0;
        }
        final var leftSubtreeSize = isBalancedWithMaxDepth(root.left, isBalanced) + 1;
        final var rightSubtreeSize = isBalancedWithMaxDepth(root.right, isBalanced) + 1;
        if (Math.abs(leftSubtreeSize - rightSubtreeSize) > 1) {
            isBalanced.set(false);
        }
        return Math.max(leftSubtreeSize, rightSubtreeSize);
    }
}
