package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.medium.P0424LongestRepeatingCharacterReplacement.characterReplacement;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0424LongestRepeatingCharacterReplacementTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments("ABAB", 2, 4),
                arguments("AABABBA", 1, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String s, final int k, final int maxLen) {
        assertThat(characterReplacement(s, k)).isEqualTo(maxLen);
    }
}