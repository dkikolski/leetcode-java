package dev.dkikolski.leetcode.problems.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0036ValidSudokuTest {
    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(createBoard("""
                        5,3,.,.,7,.,.,.,.
                        6,.,.,1,9,5,.,.,.
                        .,9,8,.,.,.,.,6,.
                        8,.,.,.,6,.,.,.,3
                        4,.,.,8,.,3,.,.,1
                        7,.,.,.,2,.,.,.,6
                        .,6,.,.,.,.,2,8,.
                        .,.,.,4,1,9,.,.,5
                        .,.,.,.,8,.,.,7,9
                        """), true),
                arguments(createBoard("""
                        .,.,.,.,5,.,.,1,.
                        .,4,.,3,.,.,.,.,.
                        .,.,.,.,.,3,.,.,1
                        8,.,.,.,.,.,.,2,.
                        .,.,2,.,7,.,.,.,.
                        .,1,5,.,.,.,.,.,.
                        .,.,.,.,.,2,.,.,.
                        .,2,.,9,.,.,.,.,.
                        .,.,4,.,.,.,.,.,.
                        """), false)

        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifySolutionN3(final char[][] board, final boolean isValid) {
        assertThat(P0036ValidSudoku.isValidSudokuN3(board)).isEqualTo(isValid);
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifySolutionN2(final char[][] board, final boolean isValid) {
        assertThat(P0036ValidSudoku.isValidSudokuN2(board)).isEqualTo(isValid);
    }

    private static char[][] createBoard(final String input) {
        final var rows = input.split("\n");
        final char[][] rowsArr = new char[rows.length][];
        for (int i = 0; i < rowsArr.length; i++) {
            var tmp = Arrays.stream(rows[i].split(",")).map(String::trim).filter(s -> !s.isEmpty()).collect(Collectors.joining()).toCharArray();
            rowsArr[i] = tmp;
        }
        return rowsArr;
    }
}