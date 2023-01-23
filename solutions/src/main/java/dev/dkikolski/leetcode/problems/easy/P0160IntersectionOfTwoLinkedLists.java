package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.ListNode;
import dev.dkikolski.leetcode.annotations.Easy;

@Easy
public class P0160IntersectionOfTwoLinkedLists {

    public static ListNode getIntersectionNode(final ListNode headA, final ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        var currentA = headA;
        var currentB = headB;

        while (currentA != currentB) {
            if (currentA == null) {
                currentA = headB;
            } else {
                currentA = currentA.next;
            }

            if (currentB == null) {
                currentB = headA;
            } else {
                currentB = currentB.next;
            }
        }
        return currentA;
    }
}
