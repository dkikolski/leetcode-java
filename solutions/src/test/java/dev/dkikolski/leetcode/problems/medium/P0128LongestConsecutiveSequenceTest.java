package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0128LongestConsecutiveSequenceTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{100,4,200,1,3,2}, 4),
                arguments(new int[]{0,3,7,2,5,8,4,6,0,1}, 9)

        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final int expectedMax) {
        assertThat(P0128LongestConsecutiveSequence.longestConsecutive(nums)).isEqualTo(expectedMax);
    }
}