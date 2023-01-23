package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.problems.easy.P0202HappyNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class P0202HappyNumberTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.arguments(19, true),
                Arguments.arguments(2, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int candidate, final boolean expected) {
        assertThat(P0202HappyNumber.isHappy(candidate)).isEqualTo(expected);
    }
}