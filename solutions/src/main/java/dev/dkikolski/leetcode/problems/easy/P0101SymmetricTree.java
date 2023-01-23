package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import dev.dkikolski.leetcode.annotations.Easy;

import java.util.Deque;
import java.util.LinkedList;

@Easy
class P0101SymmetricTree {
    public static boolean isSymmetricRecursive(final TreeNode root) {
        return compare(root.left, root.right);
    }

    private static boolean compare(final TreeNode p, final TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return compare(p.left, q.right) && compare(p.right, q.left);
    }

    public static boolean isSymmetricIterative(final TreeNode root) {
        final Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root.left);
        stack.push(root.right);

        while(!stack.isEmpty()) {
            final var p = stack.pop();
            final var q = stack.pop();
            if (p == null && q== null) {
                continue;
            }
            if (p == null || q == null) {
                return false;
            }
            if (p.val != q.val) {
                return false;
            }
            stack.push(p.left);
            stack.push(q.right);
            stack.push(p.right);
            stack.push(q.left);
        }
        return true;
    }
}
