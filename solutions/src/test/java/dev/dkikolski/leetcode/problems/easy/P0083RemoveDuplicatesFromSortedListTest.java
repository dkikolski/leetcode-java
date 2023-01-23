package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.ListNode;
import dev.dkikolski.leetcode.ListNodes;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.assertions.predicates.ListNodeMatcherByValue.expectedListMatcherByValues;
import static dev.dkikolski.leetcode.problems.easy.P0083RemoveDuplicatesFromSortedList.deleteDuplicates;
import static org.assertj.core.api.Assertions.assertThat;

class P0083RemoveDuplicatesFromSortedListTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.arguments(ListNodes.from(1, 1, 1), ListNodes.from(1)),
                Arguments.arguments(ListNodes.from(1, 1, 2), ListNodes.from(1, 2)),
                Arguments.arguments(ListNodes.from(1, 1, 2, 3, 3), ListNodes.from(1, 2, 3))
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final ListNode given, final ListNode expected) {
        assertThat(deleteDuplicates(given)).matches(expectedListMatcherByValues(expected));
    }
}