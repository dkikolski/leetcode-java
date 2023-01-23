package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.ListNode;
import dev.dkikolski.leetcode.annotations.Easy;

@Easy
public class P0141LinkedListCycle {
    public static boolean hasCycle(final ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        var slow = head;
        var fast = head.next.next;

        while (slow != null && fast != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next;
            if (fast != null && fast.next != null) {
                fast = fast.next;
            }
        }
        return false;
    }
}
