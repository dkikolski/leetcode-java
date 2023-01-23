package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.medium.P0049GroupAnagrams.groupAnagrams;
import static dev.dkikolski.leetcode.problems.medium.P0049GroupAnagrams.groupAnagramsStreams;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0049GroupAnagramsTest {
    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(
                        new String[]{"eat","tea","tan","ate","nat","bat"},
                        List.of(
                                List.of("eat", "tea", "ate"),
                                List.of("bat"),
                                List.of("tan", "nat")
                        )
                ),
                arguments(new String[]{"a"}, List.of(List.of("a"))),
                arguments(new String[]{""}, List.of(List.of("")))
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String[] strs, final List<List<String>> anagrams) {
        assertThat(groupAnagrams(strs)).isEqualTo(anagrams);
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyStreamSolution(final String[] strs, final List<List<String>> anagrams) {
        assertThat(groupAnagramsStreams(strs)).isEqualTo(anagrams);
    }
}