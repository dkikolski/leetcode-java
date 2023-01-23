package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.ListNode;

public class P0234PalindromeLinkedList {
    public static boolean isPalindrome(final ListNode head) {
        if (head == null) {
            return false;
        }
        final var midNode = findMidNode(head);

        var p = head;
        var q = reverse(midNode);

        while (p!=null && q!=null) {
            if (p.val != q.val) {
                return false;
            }
            p = p.next;
            q = q.next;
        }

        return true;
    }

    private static ListNode findMidNode(final ListNode head) {
        var fast = head;
        var slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.next;
    }

    private static ListNode reverse(final ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            var temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }
}
