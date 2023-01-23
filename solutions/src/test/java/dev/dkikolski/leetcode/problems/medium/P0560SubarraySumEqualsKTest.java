package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.medium.P0560SubarraySumEqualsK.subarraySum;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0560SubarraySumEqualsKTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{1,1,1}, 2, 2),
                arguments(new int[]{1,2,3}, 3, 2),
                arguments(new int[]{1,-1,0}, 0, 3),
                arguments(new int[]{1}, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final int k, final int expected) {
        assertThat(subarraySum(nums, k)).isEqualTo(expected);
    }
}