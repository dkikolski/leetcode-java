package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.medium.P0209MinimumSizeSubarraySum.minSubArrayLen;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0209MinimumSizeSubarraySumTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{2,3,1,2,4,3}, 7, 2),
                arguments(new int[]{1,4,4}, 4, 1),
                arguments(new int[]{1,1,1,1,1,1,1,1}, 11, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final int target, final int expected) {
        assertThat(minSubArrayLen(target, nums)).isEqualTo(expected);
    }
}