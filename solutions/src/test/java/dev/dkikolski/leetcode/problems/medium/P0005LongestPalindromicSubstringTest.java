package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.medium.P0005LongestPalindromicSubstring.longestPalindrome;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0005LongestPalindromicSubstringTest {
    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments("babad", "bab"),
                arguments("cbbd", "bb")
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String given, final String expected) {
        assertThat(longestPalindrome(given)).isEqualTo(expected);
    }
}