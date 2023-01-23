package dev.dkikolski.leetcode.assertions.predicates;

import dev.dkikolski.leetcode.TreeNode;

import java.util.function.Predicate;

public class TreeNodeMatcher implements Predicate<TreeNode> {

    private final TreeNode expected;

    private TreeNodeMatcher(TreeNode expected) {
        this.expected = expected;
    }

    public static TreeNodeMatcher expectedTreeMatcher(final TreeNode treeNode) {
        return new TreeNodeMatcher(treeNode);
    }

    @Override
    public boolean test(TreeNode treeNode) {
        return isSameTree(treeNode, expected);
    }

    public static boolean isSameTree(final TreeNode p, final TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        final var isValid = isSameTree(p.left, q.left);
        if (!isValid) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.right, q.right);
    }
}
