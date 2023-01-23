package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.ListNode;
import dev.dkikolski.leetcode.annotations.Easy;

@Easy
class P0083RemoveDuplicatesFromSortedList {
    static ListNode deleteDuplicates(final ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        var current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
