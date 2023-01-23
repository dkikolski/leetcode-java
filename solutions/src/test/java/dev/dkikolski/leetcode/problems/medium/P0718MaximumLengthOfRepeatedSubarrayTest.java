package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.medium.P0718MaximumLengthOfRepeatedSubarray.findLengthDp;
import static dev.dkikolski.leetcode.problems.medium.P0718MaximumLengthOfRepeatedSubarray.findLengthSlidingWindow;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0718MaximumLengthOfRepeatedSubarrayTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7}, 3),
                arguments(new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0}, 5),
                arguments(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1}, 3),
                arguments(new int[]{3, 2, 1}, new int[]{3, 2, 2, 4, 7}, 2),
                arguments(new int[]{0, 0, 0, 0, 1}, new int[]{1, 0, 0, 0, 0}, 4),
                arguments(new int[]{1, 0, 0, 0, 0}, new int[]{1, 0, 0, 0, 0}, 5),
                arguments(new int[]{3, 2, 2, 4, 7}, new int[]{3, 2, 1}, 2),
                arguments(new int[]{0, 1, 1, 1, 1}, new int[]{1, 0, 1, 0, 1}, 2),
                arguments(new int[]{5, 14, 53, 80, 48}, new int[]{50, 47, 3, 80, 83}, 1),
                arguments(new int[]{1,1,1,1,2,3,2,1}, new int[]{3,2,1}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyDpSolution(final int[] a, final int[] b, final int expected) {
        assertThat(findLengthDp(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifySlidingWindowSolution(final int[] a, final int[] b, final int expected) {
        assertThat(findLengthSlidingWindow(a, b)).isEqualTo(expected);
    }
}