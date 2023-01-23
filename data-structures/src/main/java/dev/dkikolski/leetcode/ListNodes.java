package dev.dkikolski.leetcode;

public class ListNodes {

    private ListNodes(){}

    public static ListNode from(final int... values) {
        final var dummy = new ListNode();
        var current = dummy;
        for (final int value: values) {
            final var node = new ListNode(value);
            current.next = node;
            current = node;
        }
        return dummy.next;
    }

    public static ListNode listNode(final int val, final ListNode next) {
        return new ListNode(val, next);
    }

    public static ListNode listNode(final int val) {
        return new ListNode(val);
    }
    public static String mkString(final ListNode head) {
        final var sb = new StringBuilder();
        var current = head;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null){
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }
}
