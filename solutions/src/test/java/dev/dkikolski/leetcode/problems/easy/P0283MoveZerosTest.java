package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.problems.easy.P0283MoveZeros;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class P0283MoveZerosTest {
    private static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.arguments(new int[] {0,1,0,3,12}, new int[]{1,3,12,0,0}),
                Arguments.arguments(new int[] {0, 0, 1}, new int[]{1,0,0}),
                Arguments.arguments(new int[] {0}, new int[]{0})

        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final int[] expected) {
        P0283MoveZeros.moveZeroes(nums);
        assertThat(nums).isEqualTo(expected);
    }
}