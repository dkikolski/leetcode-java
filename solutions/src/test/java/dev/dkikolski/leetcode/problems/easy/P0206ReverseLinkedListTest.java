package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.ListNode;
import dev.dkikolski.leetcode.ListNodes;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.assertions.predicates.ListNodeMatcherByValue.expectedListMatcherByValues;
import static dev.dkikolski.leetcode.problems.easy.P0206ReverseLinkedList.reverseList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0206ReverseLinkedListTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(ListNodes.from(1, 2, 3, 4, 5), ListNodes.from(5, 4, 3, 2, 1)),
                arguments(ListNodes.from(1, 2), ListNodes.from(2, 1)),
                arguments(ListNodes.from(1), ListNodes.from(1))
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final ListNode given, final ListNode expected) {
        assertThat(reverseList(given)).matches(expectedListMatcherByValues(expected));
    }
}