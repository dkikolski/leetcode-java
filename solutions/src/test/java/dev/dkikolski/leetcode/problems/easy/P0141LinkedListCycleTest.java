package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.ListNodes.listNode;
import static dev.dkikolski.leetcode.problems.easy.P0141LinkedListCycle.hasCycle;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0141LinkedListCycleTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(createListWithCycle1(), true),
                arguments(createListWithCycle2(), true),
                arguments(listNode(1), false)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final ListNode head, final boolean expected) {
        assertThat(hasCycle(head)).isEqualTo(expected);
    }

    private static ListNode createListWithCycle1() {
        final var a = new ListNode(3);
        final var b = new ListNode(2);
        final var c = new ListNode(0);
        final var d = new ListNode(-4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        return a;
    }

    private static ListNode createListWithCycle2() {
        final var a = new ListNode(1);
        final var b = new ListNode(2);

        a.next = b;
        b.next = a;

        return a;
    }
}