package dev.dkikolski.leetcode.problems.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.easy.P0242ValidAnagram.isAnagramUsingHashmap;
import static dev.dkikolski.leetcode.problems.easy.P0242ValidAnagram.isAnagramUsingSorting;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0242ValidAnagramTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments("anagram", "nagaram", true),
                arguments("rat", "car", false),
                arguments("abc", "abca", false),
                arguments("aa", "a", false),
                arguments("aa", "aa", true)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyHashmapSolution(final String s, final String t, final boolean isAnagram) {
        assertThat(isAnagramUsingHashmap(s, t)).isEqualTo(isAnagram);
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifySortingSolution(final String s, final String t, final boolean isAnagram) {
        assertThat(isAnagramUsingSorting(s, t)).isEqualTo(isAnagram);
    }
}