package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import dev.dkikolski.leetcode.annotations.DFS;
import dev.dkikolski.leetcode.annotations.Easy;

import java.util.Deque;
import java.util.LinkedList;

@Easy
class P0112PathSum {
    static boolean hasPathSumRecursive(final TreeNode root, final int targetSum) {
        if (root == null && targetSum == 0) {
            return true;
        }
        if (root == null) {
            return false;
        }
        return hasPathSumRecursive(root, 0, targetSum);
    }

    private static boolean hasPathSumRecursive(final TreeNode node, final int accumulator, final int targetSum) {
        if (node.left == null && node.right == null && accumulator + node.val == targetSum) {
            return true;
        }
        final var leftSubtreeSum = node.left != null && hasPathSumRecursive(node.left, accumulator + node.val, targetSum);
        final var rightSubtreeSum = node.right != null && hasPathSumRecursive(node.right, accumulator + node.val, targetSum);
        return  leftSubtreeSum || rightSubtreeSum;
    }

    @DFS
    static boolean hasPathSumIterative(final TreeNode root, final int targetSum) {
        if (root == null) {
            return false;
        }
        final Deque<TreeNode> nodesDeck = new LinkedList<>();
        final Deque<Integer> valuesDeck = new LinkedList<>();
        nodesDeck.push(root);
        valuesDeck.push(root.val);
        while(!nodesDeck.isEmpty()) {
            final var n = nodesDeck.pop();
            final var v = valuesDeck.pop();
            if (n.left == null & n.right == null && v == targetSum) {
                return true;
            }
            if (n.left != null) {
                nodesDeck.push(n.left);
                valuesDeck.push(n.left.val + v);
            }
            if (n.right != null) {
                nodesDeck.push(n.right);
                valuesDeck.push(n.right.val + v);
            }
        }
        return false;
    }
}
