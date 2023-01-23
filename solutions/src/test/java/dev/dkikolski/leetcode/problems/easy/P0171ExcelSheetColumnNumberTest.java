package dev.dkikolski.leetcode.problems.easy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import dev.dkikolski.leetcode.problems.easy.P0171ExcelSheetColumnNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class P0171ExcelSheetColumnNumberTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments("A", 1),
                arguments("AB", 28),
                arguments("ZY", 701)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String columnTitle, final int expectedColumnNumber) {
        assertThat(P0171ExcelSheetColumnNumber.titleToNumber(columnTitle)).isEqualTo(expectedColumnNumber);
    }
}