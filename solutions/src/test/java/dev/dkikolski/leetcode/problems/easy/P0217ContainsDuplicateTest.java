package dev.dkikolski.leetcode.problems.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.easy.P0217ContainsDuplicate.containsDuplicate;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0217ContainsDuplicateTest {
    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{1,2,3,1}, true),
                arguments(new int[]{1,2,3,4,5}, false),
                arguments(new int[]{1,1,1,1,2,3,4,5}, true)

        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final boolean expected) {
        assertThat(containsDuplicate(nums)).isEqualTo(expected);
    }
}