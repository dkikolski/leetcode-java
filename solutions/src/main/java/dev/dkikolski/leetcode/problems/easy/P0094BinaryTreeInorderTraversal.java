package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import dev.dkikolski.leetcode.annotations.Easy;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

@Easy
class P0094BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversalRecursive(final TreeNode root) {
        final List<Integer> values = new LinkedList<>();
        visit(root, values);
        return values;
    }

    public static List<Integer> inorderTraversalIterative(final TreeNode root) {
        final List<Integer> values = new LinkedList<>();
        final Deque<TreeNode> stack = new LinkedList<>();
        TreeNode current = root;
        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            values.add(current.val);
            current = current.right;
        }
        return values;
    }

    private static void visit(final TreeNode current, final List<Integer> values) {
        if (current == null) {
            return;
        }
        visit(current.left, values);
        values.add(current.val);
        visit(current.right, values);
    }
}
