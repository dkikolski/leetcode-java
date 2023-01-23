package dev.dkikolski.leetcode.problems.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.easy.P0219ContainsDuplicateII.containsNearbyDuplicate;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0219ContainsDuplicateIITest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{1,2,3,1}, 3, true),
                arguments(new int[]{1,0,1,1}, 1, true),
                arguments(new int[]{1,2,3,1,2,3}, 2, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final int k, final boolean expected) {
        assertThat(containsNearbyDuplicate(nums, k)).isEqualTo(expected);
    }
}