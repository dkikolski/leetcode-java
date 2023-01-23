package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.problems.easy.P0205IsomorphicStrings;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0205IsomorphicStringsTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments("egg", "add", true),
                arguments("foo", "bar", false),
                arguments("paper", "title", true),
                arguments("badc", "baba", false)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String s, final String t, final boolean expected) {
        assertThat(P0205IsomorphicStrings.isIsomorphic(s, t)).isEqualTo(expected);
    }
}