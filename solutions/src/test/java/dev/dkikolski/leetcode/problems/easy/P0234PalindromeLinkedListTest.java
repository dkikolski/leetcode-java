package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.ListNode;
import dev.dkikolski.leetcode.ListNodes;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.easy.P0234PalindromeLinkedList.isPalindrome;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0234PalindromeLinkedListTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(ListNodes.from(1, 2, 2, 1), true),
                arguments(ListNodes.from(1, 2, 3, 2, 1), true),
                arguments(ListNodes.from(1, 2, 3), false),
                arguments(ListNodes.from(1, 2), false)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final ListNode head, final boolean expected) {
        assertThat(isPalindrome(head)).isEqualTo(expected);
    }
}