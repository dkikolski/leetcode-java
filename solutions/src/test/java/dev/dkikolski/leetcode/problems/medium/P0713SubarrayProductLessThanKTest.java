package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.medium.P0713SubarrayProductLessThanK.numSubarrayProductLessThanK;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0713SubarrayProductLessThanKTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{10,5,2,6}, 100, 8),
                arguments(new int[]{10,5,2,6, 100, 7, 8}, 100, 11),
                arguments(new int[]{1, 1 ,1}, 1, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final int k, final int count) {
        assertThat(numSubarrayProductLessThanK(nums, k)).isEqualTo(count);
    }
}