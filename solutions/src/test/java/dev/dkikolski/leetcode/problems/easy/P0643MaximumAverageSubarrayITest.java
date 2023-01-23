package dev.dkikolski.leetcode.problems.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.easy.P0643MaximumAverageSubarrayI.findMaxAverage;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0643MaximumAverageSubarrayITest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{1,12,-5,-6,50,3}, 4, 12.75),
                arguments(new int[]{4,2,1,3,3}, 2, 3.0),
                arguments(new int[]{5}, 1, 5.0)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final int k, final double maxAvg) {
        assertThat(findMaxAverage(nums, k)).isEqualTo(maxAvg);
    }
}