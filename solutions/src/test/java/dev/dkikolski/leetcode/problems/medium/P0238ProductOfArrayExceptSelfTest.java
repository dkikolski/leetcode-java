package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class P0238ProductOfArrayExceptSelfTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.arguments(new int[]{1,2,3,4}, new int[]{24,12,8,6})

        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final int[] expected) {
        assertThat(P0238ProductOfArrayExceptSelf.productExceptSelf(nums)).matches(p -> Arrays.equals(p,expected));
    }
}