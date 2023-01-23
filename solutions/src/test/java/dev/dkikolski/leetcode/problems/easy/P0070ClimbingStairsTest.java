package dev.dkikolski.leetcode.problems.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.easy.P0070ClimbingStairs.climbStairs;
import static org.assertj.core.api.Assertions.assertThat;

class P0070ClimbingStairsTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.arguments(2, 2),
                Arguments.arguments(3, 3),
                Arguments.arguments(35, 14930352)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int n, final int expected) {
        assertThat(climbStairs(n)).isEqualTo(expected);
    }
}