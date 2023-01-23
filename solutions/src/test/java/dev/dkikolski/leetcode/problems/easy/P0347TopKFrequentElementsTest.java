package dev.dkikolski.leetcode.problems.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class P0347TopKFrequentElementsTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.arguments(new int[]{1,1,1,2,2,3}, 2, new int[]{1,2}),
                Arguments.arguments(new int[]{1}, 1, new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final int k, final int[] expected) {
        assertThat(Arrays.equals(P0347TopKFrequentElements.topKFrequent(nums, k), expected)).isTrue();
    }
}