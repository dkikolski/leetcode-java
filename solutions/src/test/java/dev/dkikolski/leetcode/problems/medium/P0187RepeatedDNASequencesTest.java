package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.medium.P0187RepeatedDNASequences.findRepeatedDnaSequences;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0187RepeatedDNASequencesTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT", List.of("AAAAACCCCC", "CCCCCAAAAA")),
                arguments("AAAAAAAAAAAAA", List.of("AAAAAAAAAA")),
                arguments("AAA", Collections.emptyList())
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String s, final List<String> expected) {
        assertThat(findRepeatedDnaSequences(s)).isEqualTo(expected);
    }

}