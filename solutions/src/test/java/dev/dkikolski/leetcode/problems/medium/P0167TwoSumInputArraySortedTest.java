package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.medium.P0167TwoSumInputArraySorted.twoSum;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0167TwoSumInputArraySortedTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}),
                arguments(new int[]{2, 3, 4}, 6, new int[]{1, 3}),
                arguments(new int[]{-1, 0}, -1, new int[]{1, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final int target, final int[] expected) {
        assertThat(Arrays.equals(twoSum(nums, target), expected)).isTrue();
    }
}