package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.medium.P0567PermutationInString.checkInclusion;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0567PermutationInStringTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments("ab", "eidbaooo", true),
                arguments("ab", "eidboaoo", false),
                arguments("adc", "dcda", true)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String a, final String b, final boolean expected) {
        assertThat(checkInclusion(a, b)).isEqualTo(expected);
    }
}