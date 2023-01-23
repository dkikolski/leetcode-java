package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.problems.easy.P0168ExcelSheetColumnTitle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0168ExcelSheetColumnTitleTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(1, "A"),
                arguments(28, "AB"),
                arguments(701, "ZY")
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int givenColumnNumber, final String expected) {
        assertThat(P0168ExcelSheetColumnTitle.convertToTitle(givenColumnNumber)).isEqualTo(expected);
    }
}