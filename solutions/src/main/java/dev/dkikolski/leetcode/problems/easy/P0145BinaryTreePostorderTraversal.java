package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import dev.dkikolski.leetcode.annotations.Easy;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

@Easy
public class P0145BinaryTreePostorderTraversal {
    public static List<Integer> postorderTraversalRecursive(final TreeNode root) {
        final List<Integer> accumulator = new LinkedList<>();
        postorderTraversal(root, accumulator);
        return accumulator;
    }

    private static void postorderTraversal(final TreeNode root, final List<Integer> accumulator) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left, accumulator);
        postorderTraversal(root.right, accumulator);
        accumulator.add(root.val);
    }

    public static List<Integer> postorderTraversalIterative(final TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        final LinkedList<Integer> accumulator = new LinkedList<>();
        final Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            final var currentNode = stack.pop();
            accumulator.addFirst(currentNode.val);
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
        }
        return accumulator;
    }
}
