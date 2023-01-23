package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.medium.P0930BinarySubarraysWithSum.numSubarraysWithPrefixSums;
import static dev.dkikolski.leetcode.problems.medium.P0930BinarySubarraysWithSum.numSubarraysWithSumUsingSlidingWindow;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0930BinarySubarraysWithSumTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{1,0,1}, 2, 1),
                arguments(new int[]{1,0,1,0,1}, 2, 4),
                arguments(new int[]{0,0,0,0,0}, 0, 15)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifySlidingWindowSolution(final int[] nums, final int goal, final int expected) {
        assertThat(numSubarraysWithSumUsingSlidingWindow(nums, goal)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyPrefixSumsSolution(final int[] nums, final int goal, final int expected) {
        assertThat(numSubarraysWithPrefixSums(nums, goal)).isEqualTo(expected);
    }
}