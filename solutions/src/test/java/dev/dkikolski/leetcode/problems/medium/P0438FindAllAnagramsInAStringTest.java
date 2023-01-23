package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.medium.P0438FindAllAnagramsInAString.findAnagrams;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0438FindAllAnagramsInAStringTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments("cbaebabacd", "abc", List.of(0,6)),
                arguments("abab", "ab", List.of(0,1,2)),
                arguments("baa", "aa", List.of(1))
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String s, final String p, final List<Integer> expected) {
        assertThat(findAnagrams(s, p)).isEqualTo(expected);
    }

}