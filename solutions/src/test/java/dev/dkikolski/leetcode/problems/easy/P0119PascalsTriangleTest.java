package dev.dkikolski.leetcode.problems.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.easy.P0119PascalsTriangle.getRow;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0119PascalsTriangleTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(3, List.of(1, 3, 3, 1)),
                arguments(0, List.of(1)),
                arguments(1, List.of(1, 1))

        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int numRow, final List<Integer> expected) {
        assertThat(getRow(numRow)).isEqualTo(expected);
    }
}