package dev.dkikolski.leetcode.assertions.predicates;

import dev.dkikolski.leetcode.ListNode;

import java.util.function.Predicate;

public class ListNodeMatcherByValue implements Predicate<ListNode> {

    private final ListNode expected;

    private ListNodeMatcherByValue(final ListNode expected) {
        this.expected = expected;
    }

    public static ListNodeMatcherByValue expectedListMatcherByValues(final ListNode expected) {
        return new ListNodeMatcherByValue(expected);
    }

    @Override
    public boolean test(ListNode actual) {
        if (actual == null && expected == null) {
            return true;
        }
        var acurrent = actual;
        var bcurrent = expected;
        while (acurrent != null && bcurrent != null) {
            final var diff = acurrent.val - bcurrent.val;
            if (diff != 0) {
                return false;
            }
            acurrent = acurrent.next;
            bcurrent = bcurrent.next;
        }
        return acurrent == null && bcurrent == null;
    }
}
