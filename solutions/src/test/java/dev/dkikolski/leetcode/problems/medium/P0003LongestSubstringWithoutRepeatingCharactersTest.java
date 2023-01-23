package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.medium.P0003LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0003LongestSubstringWithoutRepeatingCharactersTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments("abcabcbb", 3),
                arguments("bbbbb", 1),
                arguments("pwwkew", 3),
                arguments("abcde", 5),
                arguments("baobab", 3),
                arguments("abcdddefgh", 5)

        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String given, final int expected) {
        assertThat(lengthOfLongestSubstring(given)).isEqualTo(expected);
    }
}