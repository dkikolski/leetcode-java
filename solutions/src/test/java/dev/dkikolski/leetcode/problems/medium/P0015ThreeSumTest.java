package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static dev.dkikolski.leetcode.assertions.predicates.ListOfListsMatcher.expectedListOfListsMatcher;
import static dev.dkikolski.leetcode.problems.medium.P0015ThreeSum.threeSum;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0015ThreeSumTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{-1,0,1,2,-1,-4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
                arguments(new int[]{0, 1, 1}, Collections.emptyList()),
                arguments(new int[]{0,0,0,0}, List.of(List.of(0,0,0)))

        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final List<List<Integer>> expected) {
        assertThat(threeSum(nums)).matches(expectedListOfListsMatcher(expected));
    }
}