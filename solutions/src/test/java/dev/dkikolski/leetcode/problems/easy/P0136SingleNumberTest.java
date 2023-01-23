package dev.dkikolski.leetcode.problems.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.easy.P0136SingleNumber.singleNumber;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0136SingleNumberTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{2, 2, 1}, 1),
                arguments(new int[]{4, 1, 2, 1, 2}, 4),
                arguments(new int[]{1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] numbers, final int expected) {
        assertThat(singleNumber(numbers)).isEqualTo(expected);
    }
}