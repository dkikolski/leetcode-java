package dev.dkikolski.leetcode;


public class TreeNodes {

    public static TreeNode treeNode(final int val) {
        return new TreeNode(val);
    }

    public static TreeNode treeNode(final int val, final TreeNode left, final TreeNode right) {
        return new TreeNode(val, left, right);
    }

    public static TreeNode treeNode(final int val, final int left, final int right) {
        return new TreeNode(val, treeNode(left), treeNode(right));
    }
}
