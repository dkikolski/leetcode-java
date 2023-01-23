package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class P0257BinaryTreePaths {
    public static List<String> binaryTreePaths(final TreeNode root) {
        if (root == null ) {
            return Collections.emptyList();
        }
        if (root.left == null && root.right == null) {
            return List.of(String.valueOf(root.val));
        }
        final var list = new LinkedList<String>();
        binaryTreePaths(root.left, String.valueOf(root.val), list);
        binaryTreePaths(root.right, String.valueOf(root.val), list);
        return list;
    }

    private static void binaryTreePaths(final TreeNode root, final String accumulator, final List<String> result) {
        if (root == null) {
            return;
        }
        final String path = String.format("%s->%d", accumulator, root.val);
        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        }
        binaryTreePaths(root.left, path, result);
        binaryTreePaths(root.right, path, result);
    }
}
