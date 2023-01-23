package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.problems.easy.P0268MissingNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0268MissingNumberTest {
    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{}, 0),
                arguments(new int[]{0}, 1),
                arguments(new int[]{1}, 0),
                arguments(new int[]{1, 0}, 2),
                arguments(new int[]{1, 2, 3}, 0),
                arguments(new int[]{0, 1}, 2),
                arguments(new int[]{3, 0, 1}, 2),
                arguments(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final int missingNumber) {
        assertThat(P0268MissingNumber.missingNumber(nums)).isEqualTo(missingNumber);
    }
}