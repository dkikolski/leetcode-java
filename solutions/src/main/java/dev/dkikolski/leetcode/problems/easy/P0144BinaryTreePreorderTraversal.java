package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import dev.dkikolski.leetcode.annotations.Easy;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

@Easy
public class P0144BinaryTreePreorderTraversal {
    public static List<Integer> preorderTraversalRecursive(TreeNode root) {
        final List<Integer> accumulator = new LinkedList<>();
        preorderTraversal(root, accumulator);
        return accumulator;
    }

    private static void preorderTraversal(final TreeNode root, final List<Integer> acc) {
        if (root == null) {
            return;
        }
        acc.add(root.val);
        preorderTraversal(root.left, acc);
        preorderTraversal(root.right, acc);
    }

    public static List<Integer> preorderTraversalIterative(final TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        final List<Integer> traversedNodes = new LinkedList<>();
        final Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            final var currentNode = stack.pop();
            traversedNodes.add(currentNode.val);
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }
        return traversedNodes;
    }
}
