package dev.dkikolski.leetcode.problems.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.problems.easy.P0067AddBinary.addBinary;
import static org.assertj.core.api.Assertions.assertThat;

class P0067AddBinaryTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.arguments("11", "1", "100"),
                Arguments.arguments("1010", "1011", "10101")
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String a, final String b, final String expected) {
        assertThat(addBinary(a, b)).isEqualTo(expected);
    }
}