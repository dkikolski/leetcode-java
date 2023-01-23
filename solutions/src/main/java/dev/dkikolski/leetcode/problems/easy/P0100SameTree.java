package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import dev.dkikolski.leetcode.annotations.Easy;

import java.util.Deque;
import java.util.LinkedList;

@Easy
class P0100SameTree {
    public static boolean isSameTreeRecursive(final TreeNode p, final TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        final var isValid = isSameTreeRecursive(p.left, q.left);
        if (!isValid) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTreeRecursive(p.right, q.right);
    }

    public static boolean isSameTreeIterative(final TreeNode p, final TreeNode q) {
        final Deque<TreeNode> pstack = new LinkedList<>();
        final Deque<TreeNode> qstack = new LinkedList<>();
        var pcurrent = p;
        var qcurrent = q;

        while((pcurrent != null && qcurrent != null) || (!pstack.isEmpty() && !qstack.isEmpty())) {
            while(pcurrent != null) {
                pstack.push(pcurrent);
                qstack.push(qcurrent);
                pcurrent = pcurrent.left;
                qcurrent = qcurrent.left;
                if ((pcurrent != null && qcurrent == null) || (pcurrent == null && qcurrent != null)) {
                    return false;
                }
            }
            pcurrent = pstack.pop();
            qcurrent = qstack.pop();
            if (pcurrent.val != qcurrent.val) {
                return false;
            }
            pcurrent = pcurrent.right;
            qcurrent = qcurrent.right;
            if ((pcurrent != null && qcurrent == null) || (pcurrent == null && qcurrent != null)) {
                return false;
            }
        }
        return pcurrent == null && qcurrent == null && pstack.isEmpty() && qstack.isEmpty();
    }
}
