package dev.dkikolski.leetcode.problems.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static dev.dkikolski.leetcode.assertions.predicates.ListOfListsMatcher.expectedListOfListsMatcher;
import static dev.dkikolski.leetcode.problems.easy.P0118PascalsTriangle.generate;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0118PascalsTriangleTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(
                        5,
                        List.of(
                                List.of(1),
                                List.of(1, 1),
                                List.of(1, 2, 1),
                                List.of(1, 3, 3, 1),
                                List.of(1, 4, 6, 4, 1)
                        )
                ),
                arguments(
                        1,
                        List.of(List.of(1))
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int numRows, final List<List<Integer>> expected) {
        assertThat(generate(numRows)).matches(expectedListOfListsMatcher(expected));
    }
}