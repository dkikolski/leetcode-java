package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import dev.dkikolski.leetcode.annotations.BFS;

import java.util.LinkedList;
import java.util.Queue;

class P0111MinimumDepthOfBinaryTree {
    public static int minDepthRecursive(final TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left != null && root.right != null) {
            return Math.min(minDepthRecursive(root.left), minDepthRecursive(root.right)) + 1;
        }
        if (root.left != null) {
            return minDepthRecursive(root.left) + 1;
        }
        return minDepthRecursive(root.right) + 1;
    }

    @BFS
    public static int minDepthIterative(final TreeNode root) {
        if (root == null) {
            return 0;
        }
        final Queue<TreeNode> bfsq = new LinkedList<>();
        bfsq.offer(root);
        int depth = 1;
        while(!bfsq.isEmpty()) {
            int nodesOnTheCurrentLevel = bfsq.size();
            while(nodesOnTheCurrentLevel-- > 0) {
                final var node = bfsq.poll();
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    bfsq.offer(node.left);
                }
                if (node.right != null) {
                    bfsq.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
