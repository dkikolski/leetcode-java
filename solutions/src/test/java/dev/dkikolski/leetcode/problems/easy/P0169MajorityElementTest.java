package dev.dkikolski.leetcode.problems.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.easy.P0169MajorityElement.majorityElementUsingBoyerMooreVotingAlgo;
import static dev.dkikolski.leetcode.problems.easy.P0169MajorityElement.majorityElementUsingHashmap;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0169MajorityElementTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{3,2,3}, 3),
                arguments(new int[]{2,2,1,1,1,2,2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifySolutionWithHashmap(final int[] nums, final int expectedMajorityElement) {
        assertThat(majorityElementUsingHashmap(nums)).isEqualTo(expectedMajorityElement);
    }


    @ParameterizedTest
    @MethodSource("testcases")
    void verifySolutionWithBoyerMooreVotingAlgo(final int[] nums, final int expectedMajorityElement) {
        assertThat(majorityElementUsingBoyerMooreVotingAlgo(nums)).isEqualTo(expectedMajorityElement);
    }
}