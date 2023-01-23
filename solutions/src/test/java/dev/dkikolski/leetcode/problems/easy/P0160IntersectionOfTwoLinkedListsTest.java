package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.easy.P0160IntersectionOfTwoLinkedLists.getIntersectionNode;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0160IntersectionOfTwoLinkedListsTest {

    private record NodesTriplet(ListNode headA, ListNode headB, ListNode intersection) {

    }

    private static Stream<Arguments> testcases() {
        final var testCase1 = createLinkedListsWithIntersection();
        final var testCase2 = createLinkedListsWithoutIntersection();

        return Stream.of(
                arguments(testCase1.headA, testCase1.headB, testCase1.intersection),
                arguments(testCase2.headA, testCase2.headB, testCase2.intersection)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final ListNode headA, final ListNode headB, final ListNode intersectionNode) {
        assertThat(getIntersectionNode(headA, headB)).isEqualTo(intersectionNode);
    }

    private static NodesTriplet createLinkedListsWithIntersection() {
        final var a1 = new ListNode(4);
        final var a2 = new ListNode(1);

        final var b1 = new ListNode(5);
        final var b2 = new ListNode(6);
        final var b3 = new ListNode(1);

        final var c1 = new ListNode(8);
        final var c2 = new ListNode(4);
        final var c3 = new ListNode(5);

        a1.next = a2;
        a2.next = c1;

        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        c1.next = c2;
        c2.next = c3;

        return new NodesTriplet(a1, b1, c1);
    }

    private static NodesTriplet createLinkedListsWithoutIntersection() {
        final var a1 = new ListNode(4);
        final var a2 = new ListNode(1);

        final var b1 = new ListNode(5);
        final var b2 = new ListNode(6);
        final var b3 = new ListNode(1);

        a1.next = a2;
        b1.next = b2;
        b2.next = b3;

        return new NodesTriplet(a1, b1, null);
    }
}