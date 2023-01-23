package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0658FindKClosestElementsTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 4, 5}, 4, 3, List.of(1, 2, 3, 4)),
                arguments(new int[]{1, 2, 3, 4, 5}, 4, -1, List.of(1, 2, 3, 4)),
                arguments(new int[]{1, 1, 1, 10, 10, 10}, 1, 9, List.of(10))
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] arr, final int k, final int x, final List<Integer> expected) {
        assertThat(P0658FindKClosestElements.findClosestElements(arr, k, x)).isEqualTo(expected);
    }

}