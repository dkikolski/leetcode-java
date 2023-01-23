package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.ListNode;

public class P0206ReverseLinkedList {
    public static ListNode reverseList(final ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            var tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
        }
        return prev;
    }
}
