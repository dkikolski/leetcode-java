package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import dev.dkikolski.leetcode.annotations.Easy;

import java.util.Deque;
import java.util.LinkedList;

@Easy
class P0104MaximumDepthOfBinaryTree {
    public static int maxDepthRecursive(final TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        return Math.max(maxDepthRecursive(root.left), maxDepthRecursive(root.right)) + 1;
    }

    public static int maxDepthIterative(final TreeNode root) {
        if (root == null) {
            return 0;
        }
        final Deque<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        var depth = 0;
        while (!queue.isEmpty()) {
            var size = queue.size();
            while(size > 0) {
                final var node = queue.poll();
                size--;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
