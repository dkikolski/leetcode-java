package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class P0226InvertBinaryTree {

    public static TreeNode invertTreeIterative(final TreeNode root) {
        if (root == null) {
            return null;
        }
        final Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            final var n = queue.poll();
            final var tmp = n.left;
            n.left = n.right;
            n.right = tmp;
            if (n.left != null) {
                queue.offer(n.left);
            }
            if (n.right != null) {
                queue.offer(n.right);
            }
        }
        return root;
    }

    public static TreeNode invertTreeRecursive(final TreeNode root) {
        invert(root);
        return root;
    }

    private static void invert(final TreeNode root) {
        if (root == null) {
            return;
        }
        final var tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invert(root.left);
        invert(root.right);
    }
}
